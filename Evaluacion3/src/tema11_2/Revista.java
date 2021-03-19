package tema11_2;

public class Revista extends Biblioteca{
	private int numero;

	//Constructor parametrizado
	public Revista(int codigo, String titulo, int anyoPubli, int numero) {
		super(codigo, titulo, anyoPubli);
		this.numero = numero;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "\nRevista: " + super.toString() + "\nNúmero: " + numero;
=======
		return "Revista: " + super.toString() + "\nNúmero: " + numero;
>>>>>>> refs/remotes/origin/master
	}
	
	
}
