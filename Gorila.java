package com.zoologico;

public class Gorila extends Mamifero{
	
	public void lanzarAlgo() {
		System.out.println("El gorila arrojo algo");
		reducirEnergia(5);
		
	}
	public void comerBananas() {
		System.out.println("El gorila eat satisfecho");
		aumentarEnergia(10);
		
	}
	public void escalar() {
		System.out.println("El gorila ha trepado un árbol");
		reducirEnergia(10);
	
}

}
