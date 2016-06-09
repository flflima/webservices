package webservices;

import javax.xml.ws.Endpoint;

public class OperacoesMatematicasPublisher {

	public static void main(String[] args) {
		System.out.println("Operacoes Matematicas Webservice iniciando...");
		OperacoesMatematicas operacoes = new OperacoesMatematicas();
		Endpoint.publish("http://localhost:8080/OperacoesMatematicas", operacoes);
	}

}
