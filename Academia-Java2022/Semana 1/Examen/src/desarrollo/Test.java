package desarrollo;

public class Test {

	public static void main(String[] args) {

		/** Cree un objeto anim, un objeto Perro de tipo Animal */
		Animal anim = new Perro("Morgan");
		anim.tipoAnimal();
		anim.comunicarse();
		System.out.println();

		/** Cree un objeto perro, un objeto Perro de tipo Perro */
		Perro perro = new Perro("Ragnar");
		perro.tipoAnimal();
		System.out.println();

		/**
		 * Cree un objeto animalPolimorfico, un objeto perro de tipo Animal asignando
		 * una referencia ya existente
		 */
		Animal animalPolimorfico = perro;
		animalPolimorfico.tipoAnimal();
		System.out.println();

		/** Cree un objeto gato, un objeto Gato de tipo Animal */
		Animal gat = new Gato("Michi");
		gat.tipoAnimal();
		gat.comunicarse();
		System.out.println();

		/**
		 * Cree un objeto cat, un objeto Gato de tipo Animals Para esto aplique el
		 * polimorfismo usando la Interface
		 */
		IAnimals cat = new Gato("Manchas");
		cat.comunicarse();


		/** Cree un objeto Vaca, un objeto Vaca de tipo Animal */
		Animal vac = new Vaca("Lola");
		vac.tipoAnimal();
		vac.comunicarse();
		System.out.println();

		/**
		 * Cree un objeto vaco, un objeto Vaca de tipo Animals Para esto aplique el
		 * polimorfismo usando la Interface
		 */
		IAnimals vaco = new Vaca("Petra");
		vaco.comunicarse();

	}

}
