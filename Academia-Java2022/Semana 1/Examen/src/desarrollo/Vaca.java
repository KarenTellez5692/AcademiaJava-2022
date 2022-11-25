package desarrollo;

public class Vaca extends Animal {

	public Vaca(String nombre) {
		super(nombre);
		System.out.println("Constructor vaca, nombre : " + nombre);
	}

	@Override
	public void comunicarse() {
		System.out.println("Metodo comunicarse : La Vaca Muge... Muuu Muuu");

	}

	@Override
	public void tipoAnimal() {
		System.out.println("Tipo Animal : Es una Vaca");
	}

}
