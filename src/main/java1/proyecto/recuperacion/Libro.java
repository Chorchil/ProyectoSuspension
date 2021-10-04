package proyecto.recuperacion;

public class Libro {
	protected String nombre;
	protected String autor;
	protected String categoria;
	protected int paginas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", categoria=" + categoria + ", paginas=" + paginas
				+ "]";
	}

}
