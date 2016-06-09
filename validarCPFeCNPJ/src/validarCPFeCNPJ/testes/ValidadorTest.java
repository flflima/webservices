package validarCPFeCNPJ.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import validarCPFeCNPJ.Validador;

public class ValidadorTest {
	private Validador validador;
	
	@Before
	public void iniciar() {
		this.validador = new Validador();
	}
	
	@Test
	public void testaValidarCPFeCNPJ() {
		String cpf = "12345678900";
		boolean isDocumentoValido = this.validador.validarCPFeCNPJ(cpf);
		assertTrue(isDocumentoValido);
	}

}
