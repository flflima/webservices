package calcularDistancia;

import javax.xml.ws.Endpoint;

public class CalculadorDistanciaPublisher {

	public static void main(String[] args) {
		System.out.println("Calcula Distância Webservice iniciando...");
		CalculadorDistancia calculadorDistancia = new CalculadorDistancia();
		Endpoint.publish("http://localhost:8081/calculadorDistancia", calculadorDistancia);
	}
}
