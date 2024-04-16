/**
 * 
 */
package servicios;

import java.io.IOException;

/**
 * Biblioteca de metodos del menu
 * @author csi23-nrojlla 16042024
 */
public interface MenuInterfaz {

	/**
	 * Vista de menu principal 
	 * @return int
	 * @throws IOException 
	 */
	int MenuPrincipal() throws IOException;
	
	/**
	 * Opciones de la puerta sur
	 * @throws IOException
	 */
	void MenuPuertaSur() throws IOException;

}
