/**
 * 
 */
package controlador;

import java.io.IOException;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

/**
 * Aplicacion de gestion de mercancia
 * 
 * @author csi23-nrojlla 16042024
 */
public class inicio {

	/**
	 * Aplicacion principal
	 * @param args
	 */
	public static void main(String[] args) {

		MenuInterfaz mi = new MenuImplementacion();
		int opcionSeleccionar;
		boolean esCerrado = false;
		try {
			do {
				opcionSeleccionar = mi.MenuPrincipal();
				switch (opcionSeleccionar) {
				case 0:
					esCerrado = true;
					System.out.println("La aplicacion se ha cerrado");
					break;
				case 1:
					mi.MenuPuertaSur();
					break;
				case 2:
					//mi.MenuPuertaNorte();
					break;
				case 3:
					//mi.MenuPuertaEste();
					break;
				case 4:
					//mi.MenuPuertaOeste
					break;
				case 5:
					//mi.MenuPIF();
					break;
				
				default:
					System.out.println("Opcion no valida");
				}

			} while (!esCerrado);

		} catch (IOException e) {
			System.out.println("No se ha podido leer/escribir: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
