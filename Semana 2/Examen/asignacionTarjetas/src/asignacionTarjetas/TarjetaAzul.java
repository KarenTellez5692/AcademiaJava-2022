package asignacionTarjetas;

public class TarjetaAzul implements IAsignacion {
	
	String tipoTarjeta;
	
	@Override
	public void mostrarMonto(long monto1) {
		
		System.out.println("La tarjeta que te asignamos fue: Tarjeta Azul");
	}
	
}
