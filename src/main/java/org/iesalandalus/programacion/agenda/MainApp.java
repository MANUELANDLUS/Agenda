package org.iesalandalus.programacion.agenda;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	private static final String ERROR = "No funciona";
	private static final String EXITO = "Funciona!";

	public static void main(String[] args) {
		System.out.println("Programa para gestionar una agenda de contactos");

		Agenda agenda;

		agenda = new Agenda();
		mostrarMenu();

	}

	private static void mostrarMenu() {
		int opcion;
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1 - Añadir contacto");
			System.out.println("2 - Buscar contacto");
			System.out.println("3 - Borrar contacto");
			System.out.println("4 - Listar agenda");
			System.out.println("5 - Salir");
			opcion = elegirOpcion();
		} while (opcion < 1 || opcion > 5);
		ejecutarOpcion(opcion);
	}

	private static int elegirOpcion() {
		int opcion;
		opcion = Entrada.entero();
		return opcion;
	}

	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			anadirContacto();
			mostrarMenu();
			break;
		case 2:

			mostrarMenu();
			break;
		case 3:

			mostrarMenu();
			break;
		case 4:

			mostrarMenu();
			break;
		case 5:
			break;
		}
	}

	private static void anadirContacto() {
		String nombre;
		String telefono;
		String correo;
		Contacto contacto;

		do {
			System.out.println("Nombre?");
			nombre = Entrada.cadena();
		} while (nombre == "");

		do {
			System.out.println("Teléfono?");
			telefono = Entrada.cadena();
		} while (telefono == "");

		do {
			System.out.println("e-mail?");
			correo = Entrada.cadena();
		} while (correo == "");

		contacto = new Contacto(nombre, telefono, correo);
	}

}
