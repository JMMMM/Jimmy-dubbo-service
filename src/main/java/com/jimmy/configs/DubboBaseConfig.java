package com.jimmy.configs;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.jimmy.tools.SystemEnviroment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.annotation.Order;

/**
 * Created by Jimmy on 2017/6/20.
 */
@Configuration
//@PropertySource("classpath:dubbo/dubbo.properties")
@ImportResource("classpath:dubbo/*.xml")
public class DubboBaseConfig {
//    @Bean
//    public RegistryConfig registry() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress(SystemEnviroment.getPropeties("dubbo.registry.address"));
//        registryConfig.setProtocol(SystemEnviroment.getPropeties("dubbo.registry.protocol"));
//        return registryConfig;
//    }
//
//    @Bean
//    public ApplicationConfig application() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName(SystemEnviroment.getPropeties("dubbo.application.name"));
//        return applicationConfig;
//    }
//
//    @Bean
//    public ProtocolConfig protocol() {
//        ProtocolConfig protocolConfig = new ProtocolConfig();
//        protocolConfig.setPort(SystemEnviroment.getIntPropeties("dubbo.protocol.port"));
//        protocolConfig.setName(SystemEnviroment.getPropeties("dubbo.protocol.name"));
//        return protocolConfig;
//    }

}
