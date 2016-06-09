package random;

import javax.xml.ws.Endpoint;

public class RandomPublisher {

	public static void main(String[] args) {
		System.out.println("Random Webservice iniciando...");
		Random random = new Random();
		Endpoint.publish("http://localhost:9090/random", random);
	}

}
