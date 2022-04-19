package com.zoologico;

public class Murcielago extends Mamifero{
	
	public Murcielago() {
		nivelDeEnergia=300;		
	}
	
	public void volar() {
		System.out.println("Vuela, vuela, vuela");
		reducirEnergia(50);
	}
	
	public void comerHumanos() {
		System.out.println("Gggrrrrrrr");
		aumentarEnergia(25);
	}
	
	public void atacarPueblo() {
		System.out.println("Si fuego");
		reducirEnergia(100);
	}
	
}
