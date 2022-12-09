

public class Multi  extends OperacionAbstracta {
	
	Multi(int x, int y) {
		super(x,y);
	}

	@Override
	public int ejecuta(){
		return x * y;
	}

}