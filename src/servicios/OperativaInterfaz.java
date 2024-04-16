/**
 * 
 */
package servicios;

import java.io.IOException;
import java.util.List;

import dtos.RegistroDto;

/**
 * Biblioteca de los metodos de la interfaz
 * @author csi23-nrojlla 16042024
 */
public interface OperativaInterfaz {

	/**
	 * Metodo de registro
	 * @param registroLista
	 * @throws IOException
	 */
	void Registro(List<RegistroDto> registroLista) throws IOException;

}
