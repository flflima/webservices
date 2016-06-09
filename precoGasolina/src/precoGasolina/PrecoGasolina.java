package precoGasolina;

import javax.jws.WebService;

@WebService
public class PrecoGasolina {

	public double obterPrecoGasolina() {
		return Math.random() * 15;
	}
	
}
