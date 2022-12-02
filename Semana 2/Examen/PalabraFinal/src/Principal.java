// Final implementado con  declaracion de variables 

public class Principal {

	public static void main(String[] args) {

		int variable1 = 10;
		System.out.println("variable1 = " + variable1);

		variable1 = 15;

		System.out.println("variable1 = " + variable1);

		System.out.println("__________________________________");

		String saludo = "Hola";
		System.out.println("saludo = " + saludo);

		saludo = "Hola Karen";

		System.out.println("saludo = " + saludo);

		/*
		 * Agregar Final al declarar una variable la convierte en un una constante, por
		 * lo tanto ya no se puede modificar su valor
		 */

		final int Variable2 = 10;
		System.out.println("Variable2 = " + Variable2);

		// Variable2 = 5;

		final String nombre = "Karen";
		System.out.println("nombre = " + nombre);

		// nombre = "Karen Tellez"

		/*
		 * Si quitamos los comentarios en los que se vuelven a asignar valores a las
		 * variables, el programa ya no se va a ejecutar por que se volvieron costantes
		 */
		
		//Si se quita el comentario en la siguiente linea, no se va a ejecutar el programa
		//por que no es posible modificar el atributo ya que es de tipo constante ( ver clase nombre)
		
		
		//Nombre.PRECIO = 100;
	}
}
