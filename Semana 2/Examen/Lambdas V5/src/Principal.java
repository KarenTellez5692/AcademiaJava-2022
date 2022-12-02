
import java.util.*;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {

		List<Celular> listaCelular = new ArrayList<>();
		listaCelular.add(new Celular("Xiaomi", " Mi 11", 6000));
		listaCelular.add(new Celular("Apple", "XR", 15000));
		listaCelular.add(new Celular("Samsung", " S22", 13000));
		listaCelular.add(new Celular("Samsung", " A 53", 11000));
		listaCelular.add(new Celular("Motorola", "Edge", 4500));
		listaCelular.add(new Celular("Apple", "14 Pro Max", 35000));

		System.out.println("\n-----GAMA ALTA----------\n");
		mostrarCelular(listaCelular, emp -> emp.getPrecio() >= 25000);

		System.out.println("\n-----GAMA MEDIA----------\n");
		mostrarCelular(listaCelular, x -> x.getPrecio() > 10000 && x.getPrecio() < 18000);

		System.out.println("\n-----GAMA BAJA----------\n");
		mostrarCelular(listaCelular, x -> x.getPrecio() > 3000 && x.getPrecio() < 10000);

		System.out.println("\n-----NOMBRE LONGITUD MAYOR A 4----------\n");
		mostrarCelular(listaCelular, Z -> Z.getModelo().length() > 4);

		System.out.println("\nCELULARES DONDE EL MODELO EMPIECE CON A  Y CUESTAN MAS DE 10000\n");
		mostrarCelular(listaCelular, w -> w.getMarca().startsWith("A") && w.getPrecio() > 10000);

	}

	static void mostrarCelular(List<Celular> lista, Predicate<Celular> p) {

		for (Celular c : lista) {
			if (p.test(c)) // EJECUTA LA LAMBDA
				System.out.println(c);
		}

	}

}
