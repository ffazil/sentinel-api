package com.mmpsoftware.x.sentinel.config;

import com.mmpsoftware.x.sentinel.repository.es.ConversationRepository;
import com.mmpsoftware.x.sentinel.speech.schema.Conversation;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.NullChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.core.Pollers;
import org.springframework.integration.dsl.file.Files;
import org.springframework.integration.dsl.support.Transformers;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import java.io.File;

/**
 * @author ffazil
 * @since 08/12/15
 */
@Configuration
public class FileIntegrationConfiguration {

    @Value("${sentinel.conversation.import.directory}")
    private String inboundPath;

    @Autowired
    private NullChannel nullChannel;

    @Autowired
    private Mapper mapper;

    @Autowired
    private ConversationRepository conversationRepository;

    /*@Bean
    public MessageChannel nullFileChannel() {
        return new DirectChannel();
    }*/

    /*
    @Bean
    public MessageChannel conversationChannel() {
        return new DirectChannel();
    }



    @Bean
    @InboundChannelAdapter(value = "fileInputChannel", poller = @Poller(fixedDelay = "1000"))
    public MessageSource<File> fileReadingMessageSource() {
        FileReadingMessageSource source = new FileReadingMessageSource();
        source.setDirectory(new File(inboundPath));
        source.setFilter(new SimplePatternFileListFilter("*conversation*.xml"));
        return source;
    }*/


    /*@Bean
    public IntegrationFlow transformXmlFileToObjectFlow() {
        return IntegrationFlows.from(fileInputChannel())
                .transform(Transformers.marshaller(jaxb2Marshaller()))
                .channel(conversationChannel())
                .get();

    }*/

    @Bean
    public Jaxb2Marshaller jaxb2Marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.mmpsoftware.x.sentinel.speech.schema");
        return marshaller;
    }

    @Bean
    public IntegrationFlow importConversation() {
        return IntegrationFlows
                .from(Files.inboundAdapter(new File("/Users/ffazil/sentinel/import"))
                                .patternFilter("*conversation*.xml")
                                .preventDuplicates(),
                        e -> e.poller(Pollers.fixedDelay(1000)
                                .maxMessagesPerPoll(20)
                                //.transactional(pseudoTransactionManager())
                                //.transactionSynchronizationFactory(synchronizationFactory())
                                ))
                .transform(Transformers.fileToString())
                .transform(Transformers.unmarshaller(jaxb2Marshaller()))
                .handle(p -> {
                    Conversation source = (Conversation) p.getPayload();
                    com.mmpsoftware.x.sentinel.domain.Conversation target = mapper.map(source, com.mmpsoftware.x.sentinel.domain.Conversation.class);
                    target = conversationRepository.save(target);
                    System.out.println(target);

                })
                .get();
    }

    /*@Bean
    public TransactionSynchronizationFactory synchronizationFactory(){
        ExpressionEvaluatingTransactionSynchronizationProcessor syncProcessor =
                new ExpressionEvaluatingTransactionSynchronizationProcessor();

        ExpressionParser parser = new SpelExpressionParser();
        Expression afterCommit = parser.parseExpression("payload.delete()");

        syncProcessor.setAfterCommitExpression(afterCommit);
        syncProcessor.setAfterCommitChannel(nullChannel);
        syncProcessor.afterPropertiesSet();


        TransactionSynchronizationFactory synchronizationFactory = new DefaultTransactionSynchronizationFactory(syncProcessor);
        return synchronizationFactory;
    }

    @Bean
    public PseudoTransactionManager pseudoTransactionManager(){
        return new PseudoTransactionManager();
    }*/




}
