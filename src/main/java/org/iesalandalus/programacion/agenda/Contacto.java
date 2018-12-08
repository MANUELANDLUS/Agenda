package org.iesalandalus.programacion.agenda;

public class Contacto {
	private static final String ER_TELEFONO = "[6|7|9][0-9]{8}$";
	private static final String ER_CORREO = "([\\w\\.\\-_]+)?\\w+@[\\w-_]+(\\.\\w+){1,}";
	private String nombre;
	private String telefono;
	private String correo;

	public Contacto(String nombre, String telefono, String correo) {
		if (nombre != null && nombre != "") {
			setNombre(nombre);
		} else {
			throw new IllegalArgumentException("El nombre de un contacto no puede ser nulo o vacío.");
		}

		if (telefono != null && telefono != "") {
			if (telefono.matches(ER_TELEFONO)) {
				setTelefono(telefono);
			} else {
				throw new IllegalArgumentException("El teléfono no tiene un formato válido.");
			}
		} else {
			throw new IllegalArgumentException("El teléfono de un contacto no puede ser nulo o vacío.");
		}

		if (correo != null && correo != "") {
			if (correo.matches(ER_CORREO)) {
				setCorreo(correo);
			} else {
				throw new IllegalArgumentException("El correo no tiene un formato válido.");
			}
		} else {
			throw new IllegalArgumentException("El correo de un contacto no puede ser nulo o vacío.");
		}

	}

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
		} else {
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
		} else {
			throw new IllegalArgumentException("El correo de un contacto no puede ser nulo o vacío.");
		}
	}

	@Override
	public String toString() {
		return getIniciales() + " [" + telefono + ", " + correo + "]";
	}

	private String getIniciales() {
		String nombre = this.nombre;
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

		return iniciales.toUpperCase();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}

}
