
package org.tacografo.file.vublock;

/**
 * @author Andres Carmona Gil
 *
 */
public enum Sid {

	VU_RESUMEN(0X7601),
	VU_ACTIVITY(0X7602),
	VU_EVENT_FAULT(0X7603),
	VU_DATOS_PORMENORIZADO(0X7604),
	VU_DATE_TECNIC(0X7605);
	
	private final int id;
	
	Sid(int id){
		this.id=id;
	}
	
	/**
	 * Obtiene el identificador del fichero en hexadecimal
	 * @return hex
	 */
	public int getId(){return this.id;}
	
}
