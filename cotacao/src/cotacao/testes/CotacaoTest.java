package cotacao.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cotacao.Cotacao;

public class CotacaoTest {
	private Cotacao cotacao;
	
	@Before
	public void iniciar() {
		this.cotacao = new Cotacao();
	}

	@Test
	public void testaCalculaCotacao() {
		String moedaAtual = "BRL";
		String moedaConvertida = "USD";
		double valorCotacao = this.cotacao.verificarCotacao(moedaAtual, moedaConvertida);
		
		assertEquals(4.0, valorCotacao, 0);
	}

}
