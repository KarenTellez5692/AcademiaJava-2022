package desarrollo;

public class Perro extends Animal {

	public Perro(String nombre) {
		super(nombre);
		System.out.println("Constructor perro, nombre : " + nombre);

	}

	@Override
	public void comunicarse() {
		System.out.println("Metodo comunicarse : El perro Ladra... Guau Guau");

	}

	@Override
	public void tipoAnimal() {
		System.out.println("Tipo Animal : Es un Perro");

	}

}
