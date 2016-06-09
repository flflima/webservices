package precoGasolina.testes;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import precoGasolina.PrecoGasolina;

public class PrecoGasolinaTest {
	
	private PrecoGasolina precoGasolina;

	@Before
	public void setUp() throws Exception {
		this.precoGasolina = new PrecoGasolina();
	}

	@Test
	public void testaObterPreco() {
		double preco = this.precoGasolina.obterPrecoGasolina();
		assertTrue(preco > 0);
	}

}
