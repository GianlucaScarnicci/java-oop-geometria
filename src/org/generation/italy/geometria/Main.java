package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Rettangolo rettangolo=new Rettangolo(0,0);
		Scanner scan=new Scanner(System.in);
		System.out.print("inserisci la base del rettangolo ");
		rettangolo.base=scan.nextInt();
		System.out.print("inserisci l'altezza del rettangolo ");
		rettangolo.altezza=scan.nextInt();
		System.out.println("l'area è :" +rettangolo.calcolaArea());
		System.out.println("il perimetro è :" +rettangolo.calcolaPerimetro());
		
		scan.close();
	}
}
