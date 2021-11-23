package org.generation.italy.geometria;

public class Rettangolo {
	int altezza;
	int base;

	Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	int calcolaArea(){
		return base*altezza;
	}
	int calcolaPerimetro() {
		return (base+altezza)*2;
	}
}
