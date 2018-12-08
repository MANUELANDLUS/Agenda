package org.iesalandalus.programacion.agenda;

public class Contacto {
	private static final String ER_TELEFONO = "/^[9|6|7][0-9]{8}$/";
	private static final String ER_CORREO = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	private String nombre;
	private String telefono;
	private String correo;

}
