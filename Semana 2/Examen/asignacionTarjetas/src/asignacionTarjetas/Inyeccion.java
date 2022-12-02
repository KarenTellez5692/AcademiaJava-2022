package asignacionTarjetas;

public class Inyeccion {
	
	static void asignarPlastico(Cliente cliente, int salario) throws ExcepcionMonto {
		if(salario >= 5000 && salario <= 8000) {
			cliente.myAsignacion = new TarjetaAzul();
		}else if (salario >= 15000 && salario <= 75000) {
			cliente.myAsignacion = new TarjetaOro();
		}else if (salario > 75000) {
			cliente.myAsignacion = new TarjetaBlack();
		} else {
			System.out.print("Se ingreso un monto incorrecto, favor de validar!!!!");
		}
	}

}
