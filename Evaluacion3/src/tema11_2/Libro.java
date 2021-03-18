package tema11_2;

public class Libro extends Biblioteca{
	private boolean prestado = false;

	//Constructor parametrizado
	public Libro(int codigo, String titulo, int anyoPubli, boolean prestado) {
		super(codigo, titulo, anyoPubli);
		this.prestado = prestado;
		}

	//toString
	@Override
	public String toString() {
		return "Libro: "+ super.toString() + "\nPrestado: " + prestado;
	}
	
}