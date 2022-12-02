package asignacionTarjetas;

public class TarjetaBlack implements IAsignacion {

	String tipoTarjeta;
	
	@Override
	public void mostrarMonto(long salario) {
		if (TipoTarjetas.TARJETA_ORO.toString() != null) tipoTarjeta = "Tarjeta Black";
		System.out.println("\nLa tarjeta que te asignamos fue: " + tipoTarjeta);
	}
	

}
