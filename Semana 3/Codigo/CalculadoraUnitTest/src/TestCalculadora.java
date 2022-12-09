import junit.framework.TestCase;

public class TestCalculadora extends TestCase {
	private Calculadora calculadora;
	
	public void escenario() {
		calculadora = new Calculadora();
	}
	
	public void testSumar() {
		escenario();
		assertTrue(calculadora.sumar(2, 2) == (2+2));
	}
	
	public void testRestar() {
		escenario();
		assertEquals(5, calculadora.restar(15, 10));
	}
	
	public void testMultiplicar() {
		escenario();
		assertEquals(150, calculadora.multiplicar(15, 10));
	}
	
	public void testDividir() {
		escenario();
		assertEquals(2, calculadora.dividir(10, 5));
	}
}
