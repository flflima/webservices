package cotacao;

import javax.xml.ws.Endpoint;

public class CotacaoPublisher {

	public static void main(String[] args) {
		System.out.println("Cota��o Webservice iniciando...");
		Cotacao cotacao = new Cotacao();
		Endpoint.publish("http://localhost:8080/cotacao", cotacao);
	}

}
