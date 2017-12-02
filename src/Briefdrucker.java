import java.util.ArrayList;
import java.util.Calendar;

/**
 * Diese Klasse implementiert einen Briefdrucker
 * Darf nicht verändert werden, falls sich die Druckstategie verändert.
 * 
 * @author tebe
 */
public class Briefdrucker {
	private ArrayList<Brief> briefe = new ArrayList<>();
	private Brief einzelBrief;
	
	public Briefdrucker(ArrayList<Brief> briefe) {
		this.briefe = briefe;
	}
	
	public Briefdrucker(Brief brief) {
		einzelBrief = brief;
	}
  
	public void serieDruck () {
		for (Brief brief : briefe) {
			einzelBrief = brief;
			druckeBrief();
		}
	}
	public void druckeBrief () {
		Adresse sender = einzelBrief.getSender();
		Adresse empfaenger = einzelBrief.getEmpfaenger();
		Inhalt inhalt = einzelBrief.getInhalt();
		System.out.println(sender.getVorname());
		System.out.println(sender.getNachname());
		System.out.println(sender.getStrasse() + " " + sender.getHausnummer());
		System.out.println(sender.getPlz() + " " + sender.getOrt());
		System.out.println();
		System.out.println();
		System.out.println(empfaenger.getVorname());
		System.out.println(empfaenger.getNachname());
		System.out.println(empfaenger.getStrasse() + " " + empfaenger.getHausnummer());
		System.out.println(empfaenger.getPlz() + " " + empfaenger.getOrt());
		System.out.println();
		System.out.println(inhalt.getDatum().getTime());
		System.out.println();
		System.out.println(inhalt.getTitel());
		System.out.println();
		System.out.println(einzelBrief.generateAnrede() + " " + empfaenger.getNachname());
		System.out.println();
		System.out.println(inhalt.getText());
		System.out.println();
		System.out.println("Freundliche Grüsse");
		System.out.println(sender.getVorname() + " " + sender.getNachname());
		System.out.println();
		System.out.println("Dieses Schreiben ist gültig ohne Unterschrift");
		System.out.println();
		System.out.println();	
	}
	
}
