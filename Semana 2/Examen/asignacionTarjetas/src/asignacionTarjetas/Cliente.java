package asignacionTarjetas;

public class Cliente {
	
	public int monto;
	public int salario;
	public long salarioConvert;
	public double mascaraMonto;
	
	IAsignacion myAsignacion;

	public Cliente(int salario2) {
		this.monto = salario2;
	}

	/* Convierte el valor dado por el usuario a un entero
	 * El valor que nos envia el usuario es un string
	 */
	int obtener(String monto) throws ExcepcionMonto {
		try {
			salario = Integer.parseInt(monto);
		} catch (Exception e) {
			throw new ExcepcionMonto("El monto ingresado debe ser numerico, favor de ingresarlo correctamente!!");
		}
		return salario;
	}
	
	void asignarPlastico() {
		mascaraMonto = salario;
		System.out.println("\nEn base al salario que ingresaste que fue : $" + monto + " pesos");
		salarioConvert = salario;
		myAsignacion.mostrarMonto(salarioConvert);
	}
	

}
