package org.iesalandalus.programacion.agenda;


public class Agenda {

	private static final int MAX_CONTACTOS = 10;
	private int numContactos;
	
	public Agenda() {
		//numContactos = 4;
	}
	
	public Contacto[] getContactos() {
		Contacto[] contacto = new Contacto[numContactos];
		return contacto;
	}
	
	
	public int getNumContactos() {
		return numContactos;
	}

	
}
