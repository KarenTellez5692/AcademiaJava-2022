
public class Celular {
	
	private String marca;
	private String modelo;
	private int precio;
	
	public Celular (String marca, String modelo, int precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
		
		public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}



	
	@Override
	public String toString() {
		return "Celular [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + "]";
	}
	
}


