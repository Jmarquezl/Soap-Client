package com.soapclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soapclient.consulta.wsdl.GetCityWeatherByZIP;
import com.soapclient.consulta.wsdl.Proxy;

@RestController
public class ConsultaClienteController {
	private static final Logger log = LoggerFactory.getLogger(ConsultaClienteController.class);
	@Autowired
	@Qualifier("ProxySOAP")
	private Proxy p;
	@GetMapping("/hola")
	public String saludo(String name) {
		log.info("Inicio del controller");
		GetCityWeatherByZIP request = new GetCityWeatherByZIP();
		request.setZIP("1234");
		return p.obtenerClimaPorCP(request).getGetCityWeatherByZIPResult().getResponseText();
	}
}
