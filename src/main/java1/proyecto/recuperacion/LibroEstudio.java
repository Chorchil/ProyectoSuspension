package proyecto.recuperacion;

public class LibroEstudio extends Libro{
private String codigoUniversidad;

public String getCodigoUniversidad() {
	return codigoUniversidad;
}

public void setCodigoUniversidad(String codigoUniversidad) {
	this.codigoUniversidad = codigoUniversidad;
}

@Override
public String toString() {
	return "Nombre: " + nombre + ", Autor: " + autor + ", Categoria: " + categoria + ", Paginas: " + paginas + ", Codigo de Universidad: " + codigoUniversidad ;
}

}
