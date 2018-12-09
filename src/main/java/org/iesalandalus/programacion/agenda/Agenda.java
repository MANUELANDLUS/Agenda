package org.iesalandalus.programacion.agenda;

import java.util.Arrays;

import javax.naming.OperationNotSupportedException;

public class Agenda {

	private static final int MAX_CONTACTOS = 10;
	private int numContactos;

	public Agenda() {

	}

	public Contacto[] getContactos() {
		Contacto[] contacto = new Contacto[numContactos];
		return contacto;
	}

	public int getNumContactos() {
		return numContactos;
	}

	public void Anadir(Contacto contacto) throws OperationNotSupportedException {
		String nombre = contacto.getNombre();
		String telefono = contacto.getTelefono();
		String correo = contacto.getCorreo();
		Contacto[] lista_contactos;
		lista_contactos = new Contacto[MAX_CONTACTOS];
		if (numContactos < MAX_CONTACTOS) {
			contacto = new Contacto(nombre, telefono, correo);
			lista_contactos[numContactos] = contacto;
			this.numContactos++;
			// Ordenar();
		} else {
			throw new OperationNotSupportedException("La agenda está llena.");
		}

	}

}
