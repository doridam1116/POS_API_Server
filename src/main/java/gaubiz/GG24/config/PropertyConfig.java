package gaubiz.GG24.config;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class PropertyConfig {

    @Bean(name = "message")
    public PropertiesFactoryBean propertiesFactoryBean(){
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        ClassPathResource classPathResource = new ClassPathResource("properties/message.properties");

        propertiesFactoryBean.setLocation(classPathResource);
        return propertiesFactoryBean;
    }
}
