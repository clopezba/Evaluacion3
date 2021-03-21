package tema11_2;

<<<<<<< HEAD
public class Libro extends Biblioteca implements Prestable{
	private boolean prestado;

	//Constructor parametrizado
	public Libro(int codigo, String titulo, int anyoPubli) {
		super(codigo, titulo, anyoPubli);
		this.prestado = false;
		}

	//toString
	@Override
	public String toString() {
		return "\nLibro: "+ super.toString() + "\nPrestado: " + prestado;
	}

	@Override
	public void prestar() {
		if(prestado==true) 
			System.out.println("Ya está prestado");
		else {
			this.prestado = true;
			System.out.println("Prestado correctamente");
		}
		
	}

	@Override
	public void devolver() {
		if(prestado==true) {
			this.prestado = false;
			System.out.println("Devuelto correctamente");
		}
		else
			System.out.println("No estaba prestado");
		
	}

	@Override
	public boolean prestado() {
		return this.prestado;
			
		
=======
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
>>>>>>> refs/remotes/origin/master
	}
	
}