package desarrollo;

public class Gato extends Animal {

	public Gato(String nombre) {
		super(nombre);
		System.out.println("Constructor Gato, nombre : " + nombre);
	}

	@Override
	public void comunicarse() {
		System.out.println("Metodo comunicarse : El gato maulla... Miau Miau");
	}

	@Override
	public void tipoAnimal() {
		System.out.println("Tipo Animal : Es un Gato");

	}

}
