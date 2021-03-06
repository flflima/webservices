package webservice;

import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;
import precogasolina.PrecoGasolina;
import precogasolina.PrecoGasolinaService;
import validarcpfecnpj.Validador;
import validarcpfecnpj.ValidadorService;
import calculardistancia.CalculadorDistancia;
import calculardistancia.CalculadorDistanciaService;

public class Consumidor {

	public static void main(String[] args) {
		// servi�o calcular distancia
		CalculadorDistanciaService distanciaService = new CalculadorDistanciaService();
		// proxy distancia
		CalculadorDistancia proxyDistancia = distanciaService.getCalculadorDistanciaPort();
		
		// servico cota��o
//		CotacaoService cotacaoService = new CotacaoService();
		CurrencyConvertor cotacaoService = new CurrencyConvertor();
		// proxy cota��o
		CurrencyConvertorSoap proxyCotacao = cotacaoService.getCurrencyConvertorSoap();
//		Cotacao proxyCotacao = cotacaoService.getCotacaoPort();
		
		// servi�o pre�o gasolina
		PrecoGasolinaService gasolinaService = new PrecoGasolinaService();
		// proxy pre�o gasolina
		PrecoGasolina proxyGasolina = gasolinaService.getPrecoGasolinaPort();
		
		// validador cpf cnpj
		ValidadorService validadorService = new ValidadorService();
		// proxy validador
		Validador proxyValidador = validadorService.getValidadorPort();

		String moedaAtual = args[0];
//		double cotacao = proxyCotacao.verificarCotacao(moedaAtual, "USD");
		double cotacao = proxyCotacao.conversionRate(Currency.fromValue(moedaAtual), Currency.USD);

		String cpfOuCnpj = args[1];
		boolean isDocumentoValido = proxyValidador.validarCPFeCNPJ(cpfOuCnpj);
		
		String[] enderecoCompleto = args[2].split(",");
		String rua = enderecoCompleto[0];
		int numero = Integer.valueOf(enderecoCompleto[1].trim());
		double distancia = proxyDistancia.calcularDistancia(rua, numero);
		
		if (isDocumentoValido) {
			double total = distancia * cotacao * proxyGasolina.obterPrecoGasolina();
			
			System.out.format("** Total a pagar: R$%.2f", total);
		} else {
			System.out.println("Documento inv�lido");
		}
	}

}
