package com.perna.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.print("Digite o valor: ");
			int n = teclado.nextInt();
			SomaMultiplos s = new SomaMultiplos();
			System.out.println(s.somaMultiplos(n));
		}
		catch(Exception e) {
			System.out.print("Valor inválido!");
		}
	}

}
