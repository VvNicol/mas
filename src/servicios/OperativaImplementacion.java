/**
 * 
 */
package servicios;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import dtos.RegistroDto;

/**
 * Funcionalidades de los metodos de la operativa interfaz
 * @author csi23-nrojlla 16042024
 */
public class OperativaImplementacion implements OperativaInterfaz {

	Scanner sc = new Scanner(System.in);
	@Override
	public void Registro(List<RegistroDto> registroLista) throws IOException {
		System.out.println("Ingrese el dni completo");
		String dniRegistro = sc.nextLine();
		
		System.out.println("¿Ingresa a pie (s/n)");		
		char snPieRegistro = sc.next().charAt(0);
		
		boolean esPieRegistro = false;
		if(snPieRegistro == 's') {
			esPieRegistro = true;
		}else {
			esPieRegistro = false;
		}
		
		System.out.println("¿Ingresa en vehiculo (s/n)");
		char snVehiculoRegistro = sc.next().charAt(0);
				
		boolean esVehiculoRegistro = false;
		if(snVehiculoRegistro == 's') {
			esVehiculoRegistro = true;
		}else {
			esVehiculoRegistro = false;
		}
		
		System.out.println("¿Va a embarcar (s/n)");		
		char snEmbarqueRegistro = sc.next().charAt(0);
		
		boolean esEmbarqueRegistro = false;
		if(snEmbarqueRegistro == 's') {
			esEmbarqueRegistro = true;
		}else {
			esEmbarqueRegistro = false;
		}
		
		boolean esZonaSur = true;
		
		System.out.println("¿Lleva mercancia (s/n)");		
		char snMercanciaRegistro = sc.next().charAt(0);
		
		boolean esMercanciaRegistro = false;
		if(snMercanciaRegistro == 's') {
			esMercanciaRegistro = true;
		}else {
			esMercanciaRegistro = false;
		}
		
		System.out.println("Ingrese la fecha completa del ticket (yyyy-MM-dd HH:mm:ss)");
		sc.next();
		String fechaTicketString = sc.nextLine().trim();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime fechaTicketRegistro = LocalDateTime.parse(fechaTicketString, formato);
		
		LocalDateTime fchaPuertaSurRegistroDateTime = LocalDateTime.now();
		
		RegistroDto nuevoRegistroDto = new RegistroDto(dniRegistro, esPieRegistro, 
				esVehiculoRegistro, esEmbarqueRegistro, esZonaSur, esMercanciaRegistro, 
				fechaTicketRegistro, fchaPuertaSurRegistroDateTime);
		registroLista.add(nuevoRegistroDto);
	}
	
}
