import java.util.ArrayList;

/**Legt die Strategie für Standardbriefdrucke fest.
 * 
 * 
 * @author fabio jaenecke
 * @versio 1.1
 *
 */
public class StandardBriefdruckStrategie implements Briefdruckstrategie {
	private Brief einzelBrief;
	private ArrayList<Brief> briefe = new ArrayList<Brief>();
	
	
	/**Erstellt den Einzelbrief mit Standard Brief Formatierung.
	 * 	 * 
	 * @param brief Ein Einzelner Brief
	 */
	public StandardBriefdruckStrategie(Brief brief) {
		einzelBrief = brief;
	}
	
	
	/**Erstellt Serienbrief mit Standard Brief Formatierung.
	 * 
	 * @param briefe Mehrere Briefe als Liste
	 */
	public StandardBriefdruckStrategie(ArrayList<Brief> briefe) {
		this.briefe = briefe;
	}
	
	public void druckeBrief() {
		System.out.println(formatiereBrief());	
	}
	
	public void serienDruck() {
		for (Brief b : briefe) {
			einzelBrief = b;
			druckeBrief();
		}
	}
	
	public String formatiereBrief() {
		StringBuilder briefKomplett = new StringBuilder();
		briefKomplett.append(emailAbsaenderBlock());
		briefKomplett.append(emailEmpfaengerBlock());
		briefKomplett.append(emailHauptBlock());
		return briefKomplett.toString();
	}
	
	public String emailAbsaenderBlock() {
		Adresse sender = einzelBrief.getSender();
		StringBuilder absaenderBlock = new StringBuilder();
		absaenderBlock.insert(0, "###########################################################################################################################################################################\n\n");
		absaenderBlock.append(sender.getVorname()).append("\n");
		absaenderBlock.append(sender.getNachname()).append("\n");
		absaenderBlock.append(sender.getStrasse() + " " + sender.getHausnummer()).append("\n");
		absaenderBlock.append(sender.getPlz() + " " + sender.getOrt()).append("\n\n");
		return absaenderBlock.toString();
	}
	
	public String emailEmpfaengerBlock() {
		Adresse empfaenger = einzelBrief.getEmpfaenger();
		StringBuilder empfaengerBlock = new StringBuilder();
		empfaengerBlock.append(empfaenger.getVorname()).append("\n");
		empfaengerBlock.append(empfaenger.getNachname()).append("\n");
		empfaengerBlock.append(empfaenger.getStrasse() + " " + empfaenger.getHausnummer()).append("\n");
		empfaengerBlock.append(empfaenger.getPlz() + " " + empfaenger.getOrt()).append("\n\n");
        return empfaengerBlock.toString();
	}
	
	public String emailHauptBlock() {
		Inhalt inhalt = einzelBrief.getInhalt();
		Adresse sender = einzelBrief.getSender();
		Adresse empfaenger = einzelBrief.getEmpfaenger();
		StringBuilder hauptBlock = new StringBuilder();
		hauptBlock.append(inhalt.getDatum().getTime()).append("\n\n");
		hauptBlock.append(inhalt.getTitel()).append("\n\n");
		hauptBlock.append(einzelBrief.generateAnrede() + " " + empfaenger.getNachname()).append("\n\n");;
		hauptBlock.append(inhalt.getText()).append("\n\n");
		hauptBlock.append("Freundliche Grüsse\n");
		hauptBlock.append(sender.getVorname() + " " + sender.getNachname()).append("\n\n");
		hauptBlock.append("Dieses Schreiben ist gültig ohne Unterschrift\n\n");
		return hauptBlock.toString();
	}
	
}