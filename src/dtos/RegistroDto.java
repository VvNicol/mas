/**
 * 
 */
package dtos;

import java.time.LocalDateTime;

/**
 * Base de datos para registro
 * @author csi23-nrojlla 16042024
 */
public class RegistroDto {
	
	String dniRegistro = "aaaaa";
    boolean esAPie = false;
    boolean esVehiculo = false;
    boolean esEmbarque = false;
    boolean esZonaPuertaSur = false;
    boolean esZonaPuertaNorte = false;
    boolean esZonaPuertaOeste = false;
    boolean esZonaPuertaEste = false;
    boolean esZonaPuertaPIF = false;
    boolean esZonaPuertaEsteNorte = false;
    boolean esMercancia = false;
    boolean esMercanciaAptaPif = false;
    LocalDateTime fechaTicket = LocalDateTime.of(9999, 12, 31, 0, 0, 0);
    LocalDateTime fechaControlPuertaSur = LocalDateTime.of(9999, 12, 31, 0, 0, 0);
    LocalDateTime fechaControlPuertaNorte = LocalDateTime.of(9999, 12, 31, 0, 0, 0);
    LocalDateTime fechaControlPuertaOeste = LocalDateTime.of(9999, 12, 31, 0, 0, 0);
    LocalDateTime fechaControlPuertaEste = LocalDateTime.of(9999, 12, 31, 0, 0, 0);
    LocalDateTime fechaControlEsteNorte = LocalDateTime.of(9999, 12, 31, 0, 0, 0);
    
    
    
    
    
    
	/**
	 * @param dniRegistro
	 * @param esAPie
	 * @param esVehiculo
	 * @param esEmbarque
	 * @param esZonaPuertaSur
	 * @param esMercancia
	 * @param fechaTicket
	 * @param fechaControlPuertaSur
	 */
	public RegistroDto(String dniRegistro, boolean esAPie, boolean esVehiculo, boolean esEmbarque,
			boolean esZonaPuertaSur, boolean esMercancia, LocalDateTime fechaTicket, LocalDateTime fechaControlPuertaSur) {
		super();
		this.dniRegistro = dniRegistro;
		this.esAPie = esAPie;
		this.esVehiculo = esVehiculo;
		this.esEmbarque = esEmbarque;
		this.esZonaPuertaSur = esZonaPuertaSur;
		this.esMercancia = esMercancia;
		this.fechaTicket = fechaTicket;
		this.fechaControlPuertaSur = fechaControlPuertaSur;
	}
	/**
	 * @return the esAPie
	 */
	public boolean isEsAPie() {
		return esAPie;
	}
	/**
	 * @param esAPie the esAPie to set
	 */
	public void setEsAPie(boolean esAPie) {
		this.esAPie = esAPie;
	}
	/**
	 * @return the esVehiculo
	 */
	public boolean isEsVehiculo() {
		return esVehiculo;
	}
	/**
	 * @param esVehiculo the esVehiculo to set
	 */
	public void setEsVehiculo(boolean esVehiculo) {
		this.esVehiculo = esVehiculo;
	}
	/**
	 * @return the esZonaPuertaSur
	 */
	public boolean isEsZonaPuertaSur() {
		return esZonaPuertaSur;
	}
	/**
	 * @param esZonaPuertaSur the esZonaPuertaSur to set
	 */
	public void setEsZonaPuertaSur(boolean esZonaPuertaSur) {
		this.esZonaPuertaSur = esZonaPuertaSur;
	}
	/**
	 * @return the esZonaPuertaNorte
	 */
	public boolean isEsZonaPuertaNorte() {
		return esZonaPuertaNorte;
	}
	/**
	 * @param esZonaPuertaNorte the esZonaPuertaNorte to set
	 */
	public void setEsZonaPuertaNorte(boolean esZonaPuertaNorte) {
		this.esZonaPuertaNorte = esZonaPuertaNorte;
	}
	/**
	 * @return the esZonaPuertaOeste
	 */
	public boolean isEsZonaPuertaOeste() {
		return esZonaPuertaOeste;
	}
	/**
	 * @param esZonaPuertaOeste the esZonaPuertaOeste to set
	 */
	public void setEsZonaPuertaOeste(boolean esZonaPuertaOeste) {
		this.esZonaPuertaOeste = esZonaPuertaOeste;
	}
	/**
	 * @return the esZonaPuertaEste
	 */
	public boolean isEsZonaPuertaEste() {
		return esZonaPuertaEste;
	}
	/**
	 * @param esZonaPuertaEste the esZonaPuertaEste to set
	 */
	public void setEsZonaPuertaEste(boolean esZonaPuertaEste) {
		this.esZonaPuertaEste = esZonaPuertaEste;
	}
	/**
	 * @return the esZonaPuertaPIF
	 */
	public boolean isEsZonaPuertaPIF() {
		return esZonaPuertaPIF;
	}
	/**
	 * @param esZonaPuertaPIF the esZonaPuertaPIF to set
	 */
	public void setEsZonaPuertaPIF(boolean esZonaPuertaPIF) {
		this.esZonaPuertaPIF = esZonaPuertaPIF;
	}
	/**
	 * @return the esZonaPuertaEsteNorte
	 */
	public boolean isEsZonaPuertaEsteNorte() {
		return esZonaPuertaEsteNorte;
	}
	/**
	 * @param esZonaPuertaEsteNorte the esZonaPuertaEsteNorte to set
	 */
	public void setEsZonaPuertaEsteNorte(boolean esZonaPuertaEsteNorte) {
		this.esZonaPuertaEsteNorte = esZonaPuertaEsteNorte;
	}
	/**
	 * @return the esMercancia
	 */
	public boolean isEsMercancia() {
		return esMercancia;
	}
	/**
	 * @param esMercancia the esMercancia to set
	 */
	public void setEsMercancia(boolean esMercancia) {
		this.esMercancia = esMercancia;
	}
	/**
	 * @return the esMercanciaAptaPif
	 */
	public boolean isEsMercanciaAptaPif() {
		return esMercanciaAptaPif;
	}
	/**
	 * @param esMercanciaAptaPif the esMercanciaAptaPif to set
	 */
	public void setEsMercanciaAptaPif(boolean esMercanciaAptaPif) {
		this.esMercanciaAptaPif = esMercanciaAptaPif;
	}
	/**
	 * @return the fechaTicket
	 */
	public LocalDateTime getFechaTicket() {
		return fechaTicket;
	}
	/**
	 * @param fechaTicket the fechaTicket to set
	 */
	public void setFechaTicket(LocalDateTime fechaTicket) {
		this.fechaTicket = fechaTicket;
	}
	/**
	 * @return the fechaControlPuertaSur
	 */
	public LocalDateTime getFechaControlPuertaSur() {
		return fechaControlPuertaSur;
	}
	/**
	 * @param fechaControlPuertaSur the fechaControlPuertaSur to set
	 */
	public void setFechaControlPuertaSur(LocalDateTime fechaControlPuertaSur) {
		this.fechaControlPuertaSur = fechaControlPuertaSur;
	}
	/**
	 * @return the fechaControlPuertaNorte
	 */
	public LocalDateTime getFechaControlPuertaNorte() {
		return fechaControlPuertaNorte;
	}
	/**
	 * @param fechaControlPuertaNorte the fechaControlPuertaNorte to set
	 */
	public void setFechaControlPuertaNorte(LocalDateTime fechaControlPuertaNorte) {
		this.fechaControlPuertaNorte = fechaControlPuertaNorte;
	}
	/**
	 * @return the fechaControlPuertaOeste
	 */
	public LocalDateTime getFechaControlPuertaOeste() {
		return fechaControlPuertaOeste;
	}
	/**
	 * @param fechaControlPuertaOeste the fechaControlPuertaOeste to set
	 */
	public void setFechaControlPuertaOeste(LocalDateTime fechaControlPuertaOeste) {
		this.fechaControlPuertaOeste = fechaControlPuertaOeste;
	}
	/**
	 * @return the fechaControlPuertaEste
	 */
	public LocalDateTime getFechaControlPuertaEste() {
		return fechaControlPuertaEste;
	}
	/**
	 * @param fechaControlPuertaEste the fechaControlPuertaEste to set
	 */
	public void setFechaControlPuertaEste(LocalDateTime fechaControlPuertaEste) {
		this.fechaControlPuertaEste = fechaControlPuertaEste;
	}
	/**
	 * @return the fechaControlEsteNorte
	 */
	public LocalDateTime getFechaControlEsteNorte() {
		return fechaControlEsteNorte;
	}
	/**
	 * @param fechaControlEsteNorte the fechaControlEsteNorte to set
	 */
	public void setFechaControlEsteNorte(LocalDateTime fechaControlEsteNorte) {
		this.fechaControlEsteNorte = fechaControlEsteNorte;
	}

    
}
