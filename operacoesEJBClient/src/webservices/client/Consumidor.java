package webservices.client;

import webservices.OperacoesMatematicas;
import webservices.OperacoesMatematicasService;

public class Consumidor {
	public static void main(String[] args) {
		// service
		OperacoesMatematicasService service = new OperacoesMatematicasService();
		
		// proxy
		OperacoesMatematicas proxy = service.getOperacoesMatematicasPort();
		
		// operação
		double soma = proxy.somar(10, 10);
		System.out.println("soma.....: 10 + 10 = " + soma);

		double diferenca = proxy.subtrair(10, 10);
		System.out.println("diferença: 10 - 10 = " + diferenca);

		double produto = proxy.multiplicar(10, 10);
		System.out.println("produto..: 10 * 10 = " + produto);
		
		double quociente = proxy.dividir(10, 10);
		System.out.println("quociente: 10 / 10 = " + quociente);
	}
}
