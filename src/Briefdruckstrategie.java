
/**Das Interface gibt die Briefdruckstrategie vor.
 * Dabei wird Brief formatieren und Brief formatieren festgelegt.
 * 
 * 
 * @author fabio jaenecke
 * @version 1.1
 *
 */
public interface Briefdruckstrategie {
	
	/** 
	 * Druckt die fertigen Briefe aus
	 */
	public void druckeBrief();
	
	/**
	 * Druckt die fertigen Serienbriefe aus
	 */
	public void serienDruck();
	
	/**
	 * Gibt die formatierten Absenderinformationen als String zurück
	 * 
	 * @return absaenderBlock die Daten des Absenders
	 */
	public String emailAbsaenderBlock();
	
	/**
	 * Gibt die formatierten Empfängerinformationen als String zurück
	 * 
	 * @return empfaengerBlock die Daten des Empfängers
	 */
	public String emailEmpfaengerBlock();
	
	/**
	 * Gibt den formatierten Hauptteil der Email als String zurück
	 * 
	 * @return hauptBlock das Datum, der Titel, die Anrede und der Text der Email.
	 */
	public String emailHauptBlock();
	
	/**
	 * Fügt alle formatierten emailBlocks zusammen und gibt es als formatierten String zurück
	 * 
	 * @return briefKomplett das fertig formatierte Email
	 */
	public String formatiereBrief();


}
	
