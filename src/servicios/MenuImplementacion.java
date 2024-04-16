/**
 * 
 */
package servicios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.RegistroDto;

/**
 * Funcionalidades de los metodos del menu Interfaz
 * 
 * @author csi23-nrojlla 16042024
 */
public class MenuImplementacion implements MenuInterfaz {
	public static List<RegistroDto>RegistroLista = new ArrayList<RegistroDto>();
	Scanner sc = new Scanner(System.in);
	OperativaInterfaz oi = new OperativaImplementacion();
	@Override
	public int MenuPrincipal() throws IOException {

		System.out.println("--------------");
		System.out.println("Menu principal");
		System.out.println("0.Cerrar aplicacion");
		System.out.println("1.Puerta sur");
		System.out.println("2.Puerta Norte");
		System.out.println("3.Puerta Este");
		System.out.println("4.Puerta Oeste");
		System.out.println("--------------");
		System.out.println("5.PIF");

		int opcionEscogida = sc.nextInt();

		return opcionEscogida;
	}

	@Override
	public void MenuPuertaSur() throws IOException {
		
		int opcionSeleccionar;
		boolean esCerrado = false;

		do {
			opcionSeleccionar = PuertaSur();
			switch (opcionSeleccionar) {
			case 0:
				esCerrado = true;
				System.out.println("Atrás");
				break;
			case 1:
				oi.Registro(RegistroLista);
				break;		

			default:
				System.out.println("Opcion no valida");
			}

		} while (!esCerrado);

	}

	/**
	 * Vista del menu puerta sur
	 * @return int
	 * @throws IOException
	 */
	private int PuertaSur() throws IOException {
		
		System.out.println("----------");
		System.out.println("Puerta Sur");
		System.out.println("----------");
		System.out.println("0.Volver");
		System.out.println("1.Registro");	

		int opcionEscogida = sc.nextInt();

		return opcionEscogida;
	}

}
