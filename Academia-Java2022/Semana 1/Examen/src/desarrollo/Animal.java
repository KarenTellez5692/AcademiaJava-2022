package desarrollo;

public abstract class Animal implements IAnimals {

	private String nombre;

	/**
	 * Constructor de la clase Animal
	 */

	public Animal(String nombre) {
		this.nombre = nombre;
		System.out.println("Constructor Animal, " + "nombre del animal : " + this.nombre);
	}

	/**
	 * Retorna el valor de nombre
	 * 
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo Abstracto tipoAnimal
	 */
	public abstract void tipoAnimal();

}
