
public abstract class OperacionAbstracta implements Operacion{

	int x;
	int y;

	OperacionAbstracta(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [x=" + x + ", y=" + y + "]";
	}
	
}
