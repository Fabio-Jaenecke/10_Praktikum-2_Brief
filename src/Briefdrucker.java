import java.util.ArrayList;
import java.util.Calendar;

/**
 * Diese Klasse implementiert einen Briefdrucker
 * 
 * Hiermit hat der Drucker ein Modul für jeder der Druckkombinationen:
 * 
 * 1. Einen einzelnen Druck im Standard
 * 2. Einen einzelnen Druck im Fensterformat
 * 3. Einen Seriendruck im Standard
 * 4. Einen Seriendruck im Fensterformat
 * 
 * 
 * @author tebe, fabio jaenecke, daniellerch
 * @version 1.1
 */
public class Briefdrucker {
	private ArrayList<Brief> briefe = new ArrayList<Brief>();
	private Brief einzelBrief;
	
	/**
	 * Ermöglicht das Aufsetzten eines Einzeldrucks. Es muss zwischen StandardBriefdruckStrategie
	 * und FensterBriefdruckStrategie ausgewählt werden.
	 * 
	 * @param brief Ein einzelner Brief der Klasse Brief.
	 * @param istFensterBriefDruck Wenn True, dann FensterBriefdruckStrategie, wenn False dann StandardBriefdruckStrategie.
	 */
	public Briefdrucker(Brief brief, boolean istFensterBriefDruck) {
		einzelBrief = brief;
		if (!istFensterBriefDruck) {
			Briefdruckstrategie briefdruckstrategie = new StandardBriefdruckStrategie(brief);
			briefdruckstrategie.druckeBrief();
		} else {
			Briefdruckstrategie briefdruckstrategie = new FensterBriefdruckStrategie(brief);
			briefdruckstrategie.druckeBrief();
		}
	}	
	
	/**
	 * Ermöglicht das Aufsetzten von Serienbriefen. Es muss zwischen StandardBriefdruckStrategie
	 * und FensterBriefdruckStrategie ausgewählt werden.
	 * 
	 * @param briefe Ein SerienBrief der Klasse Brief.
	 * @param istFensterBriefDruck Wenn True, dann FensterBriefdruckStrategie, wenn False dann StandardBriefdruckStrategie.
	 */
	public Briefdrucker(ArrayList<Brief> briefe, boolean istFensterBriefDruck) {
		this.briefe = briefe;
		if (!istFensterBriefDruck) {
			Briefdruckstrategie briefdruckstrategie = new StandardBriefdruckStrategie(briefe);
			briefdruckstrategie.serienDruck();
		} else {
			Briefdruckstrategie briefdruckstrategie = new FensterBriefdruckStrategie(briefe);
			briefdruckstrategie.serienDruck();
		}
	}

	/**
	 * @return the briefe bei Serienbriefen
	 */
	public ArrayList<Brief> getBriefe() {
		return briefe;
	}

	/**
	 * @param briefe the briefe to set
	 */
	public void setBriefe(ArrayList<Brief> briefe) {
		this.briefe = briefe;
	}

	/**
	 * @return the einzelBrief bei Einzelbriefen
	 */
	public Brief getEinzelBrief() {
		return einzelBrief;
	}

	/**
	 * @param einzelBrief the einzelBrief to set
	 */
	public void setEinzelBrief(Brief einzelBrief) {
		this.einzelBrief = einzelBrief;
	}
}
