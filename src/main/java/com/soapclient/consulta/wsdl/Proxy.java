package com.soapclient.consulta.wsdl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Component("ProxySOAP")
public class Proxy extends WebServiceGatewaySupport{
	private static final Logger log = LoggerFactory.getLogger(Proxy.class);

	public GetCityWeatherByZIPResponse obtenerClimaPorCP(GetCityWeatherByZIP request) {
		log.info("Inicio del llamado del servicio SOAP ********************");
		return (GetCityWeatherByZIPResponse)getWebServiceTemplate().marshalSendAndReceive(
				this.getDefaultUri(),
				request,
				new SoapActionCallback("http://ws.cdyne.com/WeatherWS/GetCityWeatherByZIP"));
	}
}
