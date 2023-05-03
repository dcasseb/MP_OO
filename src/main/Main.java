package main;

import java.util.ArrayList;
import model.util.*; 

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Filial> filiais = new ArrayList<Filial>();		
		Filial filial = new Filial("Lago Sul", 16785, null);	
		System.out.println(filial);
		
		ArrayList<Patrimonio> patrimonios = new ArrayList<Patrimonio>();
		Patrimonio patrimonio = new Patrimonio("Cadeira", 40);
		System.out.println(patrimonio);
	}
}
