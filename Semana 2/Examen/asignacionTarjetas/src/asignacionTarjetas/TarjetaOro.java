package asignacionTarjetas;

public class TarjetaOro implements IAsignacion {

	String tipoTarjeta;
	
	@Override
	public void mostrarMonto(long monto) {
		if (TipoTarjetas.TARJETA_ORO.toString() != null) tipoTarjeta = "Tarjeta ORO";
		System.out.println("\nLa tarjeta que te asignamos fue: " + tipoTarjeta);
	}

}
