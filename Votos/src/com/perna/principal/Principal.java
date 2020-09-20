package com.perna.principal;

import com.perna.domain.Voto;
import com.perna.services.VotoServices;

public class Principal {

	public static void main(String[] args) {
		
		Voto voto = new Voto(1000, 800, 150, 50);
		
		System.out.println(VotoServices.percentualVotosValidos(voto));
		System.out.println(VotoServices.percentualVotosBrancos(voto));
		System.out.println(VotoServices.percentualVotosNulos(voto));

	}

}
