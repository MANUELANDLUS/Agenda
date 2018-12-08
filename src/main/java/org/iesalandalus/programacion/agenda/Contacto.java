package org.iesalandalus.programacion.agenda;

public class Contacto {
	private static final String ER_TELEFONO = "/^[9|6|7][0-9]{8}$/";
	private static final String ER_CORREO = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	private String nombre;
	private String telefono;
	private String correo;

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		if (nombre != null && nombre != "") {
			this.nombre = nombre;
		} else {
			throw new IllegalArgumentException("El nombre de un contacto no puede ser nulo o vacío.");
		}
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		if (telefono != null && telefono != "") {
			if (telefono.matches(ER_TELEFONO)) {
				this.telefono = telefono;
			} else {
				throw new IllegalArgumentException("El teléfono no tiene un formato válido.");
			}
		}else {
			throw new IllegalArgumentException("El teléfono de un contacto no puede ser nulo o vacío.");
		}
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		if (correo != null && correo != "") {
			if (correo.matches(ER_CORREO)) {
				this.correo = correo;
			} else {
				throw new IllegalArgumentException("El correo no tiene un formato válido.");
			}
		}else {
			throw new IllegalArgumentException("El correo de un contacto no puede ser nulo o vacío.");
		}
	}

}
