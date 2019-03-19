package com.soapclient.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.soapclient.consulta.wsdl.Proxy;

@Configuration
public class SoapConfig {
	@Autowired
	private Proxy client;
	
	@Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.soapclient.consulta.wsdl");//Paquete donde estan las clases creadas por JAXB.
        return marshaller;
    }

    @Bean
    public Proxy weatherClient(Jaxb2Marshaller marshaller) {    	
        client.setDefaultUri("http://wsf.cdyne.com/WeatherWS");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
