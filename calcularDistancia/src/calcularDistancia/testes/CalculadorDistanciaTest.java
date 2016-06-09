package calcularDistancia.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calcularDistancia.CalculadorDistancia;

public class CalculadorDistanciaTest {
	private CalculadorDistancia calculadorDistancia;

	@Before
	public void setUp() throws Exception {
		this.calculadorDistancia = new CalculadorDistancia();
	}

	@Test
	public void testarCalcularDistancia() {
		final String endereco = "Rua Sem Dono";
		final int numero = 10;
		double distancia = this.calculadorDistancia.calcularDistancia(endereco, numero);
		
		assertTrue(distancia > 0);
	}

}
