package com.perna.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.print("Digite o valor: ");
			int n = teclado.nextInt();
			Fatorial f = new Fatorial();
			System.out.println(f.fatorial(n));
		}
		catch(Exception e) {
			System.out.print("Valor inv�lido!");
		}

	}

}
