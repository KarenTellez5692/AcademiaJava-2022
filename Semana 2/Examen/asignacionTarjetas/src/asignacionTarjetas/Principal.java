package asignacionTarjetas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int salario = 0;
		
		try(Scanner input = new Scanner(System.in)) {
			System.out.println("Ingresa por favor tú salario: ");
			salario = input.nextInt();
		} catch (Exception e) {
			System.out.println("Hubo un error en el programa: " + e);
			return;
		}
		
		try {
			Cliente cliente = new Cliente(salario);
			try {
				if (salario >= 5000) {
					Inyeccion.asignarPlastico(cliente, salario);
					cliente.asignarPlastico();
				} else if(salario < 5000) {
					throw new ExcepcionMonto("Aún no tenemos un producto en base al salario que ingresaste, ¡Lo sentimos!");
				}
				
			} catch (Exception e) {
				System.err.println(e.getLocalizedMessage());
				throw new ExcepcionMonto("Hubo un error al asignar la tarjeta!!!");
			} finally {
				System.out.println("\n¡Por favor, acude a sucursal para más información, gracias por tú preferencia!");
			}
		} catch (ExcepcionMonto e) {
			e.printStackTrace();
		}
	}

}
