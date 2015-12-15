package com.mmpsoftware.x.sentinel;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication(scanBasePackages = {"com.mmpsoftware.x.sentinel.config"})
public class SentinelApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelApiApplication.class, args);
    }

    @Bean(name = "org.dozer.Mapper")
    public DozerBeanMapper dozerBean() {
        /*List<String> mappingFiles = Arrays.asList(
                "dozer-global-configuration.xml",
                "dozer-bean-mappings.xml",
                "more-dozer-bean-mappings.xml"
        );*/

        DozerBeanMapper dozerBean = new DozerBeanMapper();
        //dozerBean.setMappingFiles(mappingFiles);
        return dozerBean;
    }

}
