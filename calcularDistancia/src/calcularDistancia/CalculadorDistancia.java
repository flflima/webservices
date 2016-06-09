package calcularDistancia;

import javax.jws.WebService;

@WebService
public class CalculadorDistancia {

	public double calcularDistancia(String endereco, int numero) {
		return Math.random() * numero;
	}

}
