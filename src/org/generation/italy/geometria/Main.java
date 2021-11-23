package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int base;
		int altezza;
		
		Scanner scan=new Scanner(System.in);
		do {
		System.out.print("inserisci la base del rettangolo positiva ");
		base=scan.nextInt();
		}while(base<0);
		do {
		System.out.print("inserisci l'altezza del rettangolo positiva ");
		altezza=scan.nextInt();
		}while(altezza<0);
		Rettangolo rettangolo=new Rettangolo(altezza,base);
		System.out.println("l'area è :" +rettangolo.calcolaArea());
		System.out.println("il perimetro è :" +rettangolo.calcolaPerimetro());
		
		scan.close();
	}
}
