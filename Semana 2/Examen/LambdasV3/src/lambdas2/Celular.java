package lambdas2;

public class Celular {

	private String Marca;
	private String Modelo;
	private int Precio;
	
	

	public Celular(String marca, String modelo, int precio) {
		super();
		Marca = marca;
		Modelo = modelo;
		Precio = precio;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}

	@Override
	public String toString() {
		return "Celulares [Marca=" + Marca + ", Modelo=" + Modelo + ", Precio=" + Precio + "]";
	}

}