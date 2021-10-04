package proyecto.recuperacion;

public class LibroTrabajo extends Libro{
	private String codigoISBN;

	public String getCodigoISBN() {
		return codigoISBN;
	}

	public void setCodigoISBN(String codigoISBN) {
		this.codigoISBN = codigoISBN;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Autor: " + autor + ", Categoria: " + categoria + ", Paginas: " + paginas+", Codigo ISBN: " + codigoISBN + "]";
	}
	

}
