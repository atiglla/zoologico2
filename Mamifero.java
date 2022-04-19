package com.zoologico;

public class Mamifero {
	
	protected int nivelDeEnergia;
	
	public Mamifero() {
		this.nivelDeEnergia=100;
	}
	
	public int mostrarEnergia() {
		System.out.println(nivelDeEnergia);
		return nivelDeEnergia;
	}
	public void reducirEnergia(int a) {
		nivelDeEnergia-=a;
	}
	public void aumentarEnergia(int a) {
		nivelDeEnergia+=a;
	}

}
