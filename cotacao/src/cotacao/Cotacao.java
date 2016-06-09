package cotacao;

import javax.jws.WebService;

@WebService
public class Cotacao {

	public double verificarCotacao(String moedaAtual, String moedaConvertida) {
		if (moedaAtual.equalsIgnoreCase("BRL") && moedaConvertida.equalsIgnoreCase("USD")) {
			return 4;
		}

		return 0;
	}

}
