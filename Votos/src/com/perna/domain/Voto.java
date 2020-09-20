package com.perna.domain;

public class Voto {

	private int totalEleitores;
	private int validos;
	private int brancos;
	private int nulos;
	
	public Voto() {
	}

	public Voto(int totalEleitores, int validos, int brancos, int nulos) {
		this.totalEleitores = totalEleitores;
		this.validos = validos;
		this.brancos = brancos;
		this.nulos = nulos;
	}

	public int getTotalEleitores() {
		return totalEleitores;
	}

	public void setTotalEleitores(int totalEleitores) {
		this.totalEleitores = totalEleitores;
	}

	public int getValidos() {
		return validos;
	}

	public void setValidos(int validos) {
		this.validos = validos;
	}

	public int getBrancos() {
		return brancos;
	}

	public void setBrancos(int brancos) {
		this.brancos = brancos;
	}

	public int getNulos() {
		return nulos;
	}

	public void setNulos(int nulos) {
		this.nulos = nulos;
	}
	
	
	
}
