package validarCPFeCNPJ;

import javax.jws.WebService;

@WebService
public class Validador {

	private static final int TAMANHO_CPF = 11;
	private static final int TAMANHO_CNPJ = 14;

	public boolean validarCPFeCNPJ(String documento) {
		return documento.length() == TAMANHO_CPF || documento.length() == TAMANHO_CNPJ;
	}

}
