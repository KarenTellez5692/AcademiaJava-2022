import java.util.ArrayList;
import java.util.List;

public class Calculadora {
	
	public int sumar(int a, int b) {
		
		return new Suma(a, b).ejecuta();
	}
	
	public int restar(int a, int b) {
		return new Resta(a, b).ejecuta();
	}
	
	public int multiplicar(int a, int b) {
		return new Multi(a, b).ejecuta();
	}
	
	public int dividir(int a, int b) {
		return new Division(a, b).ejecuta();
	}
	
	static int x = 8; 
	static int y = 4; 
	
	public static void main(String[] args) {
		List<Operacion> listaOperacion = new ArrayList<>();
		listaOperacion.add(new Multi(x,y));
		listaOperacion.add(new Suma(x,y));
		listaOperacion.add(new Resta(x,y));
		listaOperacion.add(new Multi(x,y));
		listaOperacion.add(new Division(x,y));
			
		//POLIMORFISMO
		for(Operacion o:listaOperacion) {
			System.out.println(o);
			System.out.println(o.ejecuta());
			if (o instanceof Multi)
				System.out.println("SOY UNA MULTI");
			
		}
		
	}

}
