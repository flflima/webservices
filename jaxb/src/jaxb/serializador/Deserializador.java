package jaxb.serializador;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import jaxb.modelo.Conta;

public class Deserializador {

	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Conta.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Conta conta = (Conta) unmarshaller.unmarshal(new File("Conta.xml"));
		
		System.out.println("----- Conta -----");
		System.out.println("Limite: " + conta.getLimite());
		System.out.println("Saldo.: " + conta.getSaldo());
		System.out.println("Nome..: " + conta.getCliente().getNome());
	}

}
