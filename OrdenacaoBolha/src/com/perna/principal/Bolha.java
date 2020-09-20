package com.perna.principal;

import java.util.ArrayList;

public class Bolha {

	public static ArrayList<Integer> vet= new ArrayList<>();
	
	public static void swap(ArrayList<Integer> vet, int i) {
		int aux = vet.get(i);
        vet.set(i, vet.get(i+1));
        vet.set(i+1, aux);
	}
    
    public void Bolha_BubbleSort()
    {
        int tl2 = vet.size();
        
        while(tl2 > 1)
        {
            for (int i = 0; i < tl2-1; i++) 
            {
                if(vet.get(i) > vet.get(i+1))
                {
                	swap(vet, i);
                }

            }
            tl2--;
        }
    }
	
	public static void main(String[] args) {
		
		Bolha b = new Bolha();
        vet.add(5);
        vet.add(3);
        vet.add(2);
        vet.add(4);
        vet.add(7);
        vet.add(1);
        vet.add(0);
        vet.add(6);
        
        for (int i = 0; i < vet.size(); i++) 
        {
            System.out.println(""+vet.get(i));
        }
        
        System.out.println("\nM�todo bolha\n");
        
        b.Bolha_BubbleSort();
        
        for (int i = 0; i < vet.size(); i++) 
        {
            System.out.println(""+vet.get(i));
        }
	}

}
