public class Division  extends OperacionAbstracta {
	
	Division(int x, int y) {
		super(x,y);
	}

	@Override
	public int ejecuta(){
		return x / y;
	}

}