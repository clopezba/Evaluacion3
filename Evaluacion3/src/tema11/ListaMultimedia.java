package tema11;

import java.util.ArrayList;

public class ListaMultimedia {
	private ArrayList<Multimedia> lista;

	public ListaMultimedia() {
		lista = new ArrayList<Multimedia>();
	}
	
	public void añadir(Multimedia m) {
		lista.add(m);
	}
	public int tamaño() {
		return lista.size();
	}

	@Override
	public String toString() {
		return "ListaMultimedia \n----------------\n" + lista;
	}
	public double duracionTotal() {
		double durTotal=0;
		for (Multimedia m:lista)
			durTotal += m.getDuracion();
		return durTotal;
	}
	
	
}
