package validarCPFeCNPJ;

import javax.xml.ws.Endpoint;

public class ValidadorPublisher {

	public static void main(String[] args) {
		System.out.println("Cota��o Webservice iniciando...");
		Validador validador = new Validador();
		Endpoint.publish("http://localhost:8083/validador", validador);
	}


}
