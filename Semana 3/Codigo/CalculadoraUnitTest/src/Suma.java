

public class Suma extends OperacionAbstracta {
	
	Suma(int x, int y) {
		super(x,y);
	}

	@Override
	public int ejecuta(){
		return x + y;
	}

}
