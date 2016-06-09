package webservices.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import webservices.OperacoesMatematicas;

public class OperacoesMatematicasTest {
	private OperacoesMatematicas operacao;
	
	@Before
	public void iniciar() {
		this.operacao = new OperacoesMatematicas();
	}

	@Test
	public void testSomar() {
		double soma = this.operacao.somar(2, 2);
		assertEquals(4.0, soma, 0);
	}
	
	@Test
	public void testSubtrair() {
		double diferenca = this.operacao.subtrair(5, 10);
		assertEquals(5.0, diferenca, 0);
	}
	
	@Test
	public void testProduto() {
		double produto = this.operacao.multiplicar(2, 5);
		assertEquals(10.0, produto, 0);
	}
	
	@Test
	public void testQuociente() {
		double quociente = this.operacao.dividir(20, 5);
		assertEquals(4.0, quociente, 0);
	}

}
