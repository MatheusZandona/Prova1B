package br.univel.client;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.univel.CONSTANTES;
import br.univel.comum.Plact;

public class Zoom {

	
	public Zoom() throws Exception {
		Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1818);
		Plact servico = (Plact) registry.lookup(Plact.NOME);
		Integer retorno = servico.calcule(CONSTANTES.RA_DEZENA);
		System.out.println(retorno);
	}
	
	public static void main(String[] args) throws Exception{
		new Zoom();
	}

}
