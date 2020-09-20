package com.perna.services;

import com.perna.domain.Voto;

public class VotoServices {

	public static double percentualVotosValidos(Voto voto) {
		if(voto != null)
		{
			if(voto.getTotalEleitores() > 0)
			{
				return voto.getValidos() *100 / voto.getTotalEleitores();
			}
		}
		return 0; 
	}
	
	public static double percentualVotosBrancos(Voto voto) {
		if(voto != null)
		{
			if(voto.getTotalEleitores() > 0)
			{
				return voto.getBrancos()*100 / voto.getTotalEleitores();
			}
		}
		return 0; 
	}
	
	public static double percentualVotosNulos(Voto voto) {
		if(voto != null)
		{
			if(voto.getTotalEleitores() > 0)
			{
				return voto.getNulos()*100 / voto.getTotalEleitores();
			}
		}
		return 0; 
	}
}
