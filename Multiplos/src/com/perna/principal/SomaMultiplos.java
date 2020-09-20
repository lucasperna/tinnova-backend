package com.perna.principal;

public class SomaMultiplos {

	public long somaMultiplos(int n) {
	
		int soma = 0;
		for(int i = 0; i < n; i ++)
		{
			if(i % 3 == 0 || i % 5 == 0)
			{
				soma += i;
			}
		}
		return soma;
	}
}
