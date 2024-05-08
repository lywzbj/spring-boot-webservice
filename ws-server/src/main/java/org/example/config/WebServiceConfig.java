package org.example.config;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import javax.xml.ws.Endpoint;
import java.util.Set;

@Configuration
public class WebServiceConfig {


    @Autowired
    private HelloService helloService;

    @Bean
    public ServletRegistrationBean cxfServlet() {
        var registrationBean = new ServletRegistrationBean(new CXFServlet());
        registrationBean.setUrlMappings(Set.of("/*"));
        return registrationBean;
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }


    @Bean
    public Endpoint helloEndpoint() {
        Endpoint endpoint = new EndpointImpl(springBus(), helloService);
        endpoint.publish("/ws/hello");
        return endpoint;
    }




}
