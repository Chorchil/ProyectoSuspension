package proyecto.recuperacion;

import java.util.*;

public class MainBibliotecaS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectorS = new Scanner(System.in);
		Scanner lectorI = new Scanner(System.in);
		String nombre;
		String autor;
		String categoria;
		int paginas;
		String codigoUniversidad;
		String codigoISBN;
		List<Libro> listaLibros = new ArrayList<Libro>();
		int menu;
		int tipoLibro;
		String busqueda;

		do {
			System.out.println("****************************************************************");
			System.out.println("BIENVENIDOS AL SISTEMA DE BIBLIOTECA DE LA UNIVERSIDAD CENTRAL DEL ECUADOR!!");
			System.out.println(
					"Pulse 1 para registrar un libro\nPulse 2 para buscar un libro\nPulse 3 para SALIR");
			System.out.println("****************************************************************");
			menu = lectorI.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Para registrar un libro seleccione: \n1.Libro de estudio\n2.Libro de trabajo");
				tipoLibro = lectorI.nextInt();
				if (tipoLibro == 1) {
					LibroEstudio libroE = new LibroEstudio();
					System.out.println("Nombre: ");
					libroE.setNombre(nombre = lectorS.nextLine());
					System.out.println("Autor: ");
					libroE.setAutor(autor = lectorS.nextLine());
					System.out.println("Categoria: ");
					libroE.setCategoria(categoria = lectorS.nextLine());
					System.out.println("Cantidad de paginas: ");
					libroE.setPaginas(paginas=lectorI.nextInt());
					System.out.println("Codigo de Universidad: ");
					libroE.setCodigoUniversidad(codigoUniversidad = lectorS.nextLine());
					listaLibros.add(libroE);
				} else if (tipoLibro == 2) {
					LibroTrabajo libroT = new LibroTrabajo();
					System.out.println("Nombre: ");
					libroT.setNombre(nombre = lectorS.nextLine());
					System.out.println("Autor: ");
					libroT.setAutor(autor = lectorS.nextLine());
					System.out.println("Categoria: ");
					libroT.setCategoria(categoria = lectorS.nextLine());
					System.out.println("Cantidad de paginas: ");
					libroT.setPaginas(paginas=lectorI.nextInt());
					System.out.println("Codigo ISBN: ");
					libroT.setCodigoISBN(codigoISBN = lectorS.nextLine());
					listaLibros.add(libroT);
				}
				break;
			case 2:
				System.out.println("Para buscar un libro digite el nombre del libro a buscar por favor.");
				busqueda = lectorS.nextLine();
				for (int i = 0; i < listaLibros.size(); i++) {
					if (busqueda.equals(listaLibros.get(i).getNombre())) {
						System.out.println("Libro consultado: ");
						System.out.println(listaLibros.get(i).toString());
					} else {
						System.out.println("Libro no encontrado");
					}
				}
				break;
			case 3:
				System.out.println("Fin de la sesion!!");
				break;
			default:
				System.out.println("Opcion incorrecta, intentelo otra vez!!");
				break;
			}

		} while (menu != 3);

	}

}
