package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Rettangolo rettangolo=new Rettangolo(0,0);
		Scanner scan=new Scanner(System.in);
		do {
		System.out.print("inserisci la base del rettangolo positiva ");
		rettangolo.base=scan.nextInt();
		}while(rettangolo.base<0);
		do {
		System.out.print("inserisci l'altezza del rettangolo positiva ");
		rettangolo.altezza=scan.nextInt();
		}while(rettangolo.altezza<0 || rettangolo.base<0);
		
		System.out.println("l'area è :" +rettangolo.calcolaArea());
		System.out.println("il perimetro è :" +rettangolo.calcolaPerimetro());
		
		scan.close();
	}
}
