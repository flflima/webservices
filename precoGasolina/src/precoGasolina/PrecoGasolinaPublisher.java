package precoGasolina;

import javax.xml.ws.Endpoint;

public class PrecoGasolinaPublisher {

	public static void main(String[] args) {
		System.out.println("Preço da Gasolina Webservice iniciando...");
		PrecoGasolina precoGasolina = new PrecoGasolina();
		Endpoint.publish("http://localhost:8082/precoGasolina", precoGasolina);
	}

}
