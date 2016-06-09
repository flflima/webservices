package random.webservices;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import random.Random;
import random.RandomService;

public class Consumidor {
	public static void main(String[] args) {
		// service
		RandomService randomService = new RandomService();
		
		// proxy
		Random proxy = randomService.getRandomPort();
		
		// username e password
		BindingProvider bp = (BindingProvider) proxy;
		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		headers.put("Username", Collections.singletonList("user"));
		headers.put("Password", Collections.singletonList("p@ss"));
		bp.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		
		// operação
		double next = proxy.geraRandom(50);
		System.out.println(next);
	}
}
