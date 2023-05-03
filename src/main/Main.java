package main;

import java.util.ArrayList;
import model.util.*; 

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Filial> filiais = new ArrayList<Filial>();
		
		Filial filial = new Filial("Lago Sul", 1, null);
		
		System.out.println(filial);
	}
}
