package com.example.webservice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetLenguaRequest;
import io.spring.guides.gs_producing_web_service.GetLenguaResponse;

@Endpoint
public class LenguaEndpint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private LenguaRepository lenguaRepository;

	@Autowired
	public void LenguaEndpoint(LenguaRepository lenguaRepository) {
		this.lenguaRepository = lenguaRepository;
		
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLenguaRequest")
	@ResponsePayload
	public GetLenguaResponse getLengua(@RequestPayload GetLenguaRequest request) {
		GetLenguaResponse response = new GetLenguaResponse();
		response.setLengua(lenguaRepository.findLengua(request.getName()));

		return response;
	
	}
}
