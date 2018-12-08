package org.iesalandalus.programacion.agenda;

import javax.naming.OperationNotSupportedException;
import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Programa para gestionar una agenda de contactos");
		String nombre = "  buenos dias como estamos";
		String iniciales = "";
		int indice = 0;
		if (nombre.charAt(indice) != ' ') {
			iniciales = iniciales + nombre.charAt(indice);
		}
		indice = nombre.indexOf(" ");
		while (indice != -1) {
			if (nombre.charAt(indice + 1) != ' ') {
				iniciales = iniciales + nombre.charAt(indice + 1);
			}
			indice = nombre.indexOf(" ", indice + 1);

		}

		System.out.println(iniciales.toUpperCase());
	}

}
