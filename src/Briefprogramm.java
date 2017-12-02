import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;

import sun.util.resources.cldr.aa.CalendarData_aa_ER;

/**
 * Diese Klasse implementiert ein Briefprogramm.
 * 
 * @author tebe
 */
public class Briefprogramm {

  /**
   * main Methode.
   * @param args Es werden keine Kommandozeilenparameter verwendet
   */
	public static void main(String[] args) {
		
		Adresse sender1 = new Adresse("Frau", "Angelika", "Jager", "Scheidweg", 38, 6332, "Hagendorn");
		Adresse sender2 = new Adresse("Frau","Yvonne", "Frankfurter", "Möhe", 63, 6440, "Ingenbohl");
		Adresse sender3 = new Adresse("Frau", "Ursula", "Burger", "Casut", 115, 4253, "Liesberg");
		Adresse sender4 = new Adresse("Frau", "Yvonne", "Frankfurter", "Möhe", 63, 6440, "Ingenbohl");
		Adresse sender5 = new Adresse("Herr", "Erik", "Baader", "Spinatsch", 43, 4558, "Mösli");
		
		Adresse empfaenger1 = new Adresse("Frau", "Marina", "Bergmann", "Jakobstrasse", 106, 3367,  "Ochlenberg");
		Adresse empfaenger2 = new Adresse("Herr", "Bernd", "Eberhart", "Langwiesstrasse", 5, 7433, "Wergenstein");
		Adresse empfaenger3 = new Adresse("Herr", "Kristian", "Bohm", "Im Wingert", 41, 1345, "Le Lieu");
		Adresse empfaenger4 = new Adresse("Herr", "Philipp", "Werfel", "Erlenweg", 37, 8222, "Beringen");
		Adresse empfaenger5 = new Adresse("Herr", "Lucas", "Huber", "Lungolago", 8, 1295, "Tannay");
		Adresse empfaenger6 = new Adresse("Herr", "Erik", "Baader", "Spinatsch", 43, 4558, "Mösli");
		Adresse empfaenger7 = new Adresse("Herr", "Sebastian", "Abend", "Betburweg", 129, 6716, "Lottigna");
		Adresse empfaenger8 = new Adresse("Frau", "Johanna", "Eisenhauer", "Obere Bahnhofstrasse", 50, 1432, "Belmont-sur-Yverdon");
		Adresse empfaenger9 = new Adresse("Herr", "Marcel", "Huber", "Brunnacherstrasse", 121, 8048, "Zürich");
		Adresse empfaenger10 = new Adresse("Herr", "Leon", "Freud", "Pfaffacherweg", 37, 2556, "Scheuren");
		
		Inhalt inhalt1 = new Inhalt(Calendar.getInstance(), "Sie haben eine spannende Nachricht bekommen", "Lorem ipsum dolor sit amet,\n "
				+ "consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna \n"
				+ "aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet\n"
				+ "clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolo\n"
				+ "sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore\n "
				+ "magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum.\n "
				+ "Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.\n");
		Inhalt inhalt2 = new Inhalt(Calendar.getInstance(), "Schreiben ist unsere Lieblingsbeschäftigung", "Wir lieben Text.\n" + 
				"Wir verstehen uns als Dienstleister der Unternehmen für die Redaktion. Wir sind die Übersetzer der Themen für die Medien.\n" + 
				"Mit hoher Sprachkompetenz bereiten wir auch komplexe technische Inhalte verständlich und zielgruppenorientiert auf. Wir verknüpfen stilistische Qualität mit der ausgeprägten Darstellung von Vorteilen und Nutzen.\n" + 
				"Wir entwickeln mit dem Wissen über Lesegewohnheiten aus einem Text-Baustein die Adaptionen für Pressemitteilung, Newsletter oder suchmaschinenoptimiertem Text für die Website.\n" + 
				"Wir verstehen die Medien.\n" + 
				"Ein Text, ein Thema ist immer so gut, wie es in den Medien aufgenommen wird. Aus der inhaltlichen Kompetenz bei der Texterarbeitung und -erstellung entwickeln wir die Story, um das Thema proaktiv bei Medien zu platzieren.\n" + 
				"Unsere fundierte journalistische Ausbildung und Denke macht uns bei Medien zum Gesprächspartner auf Augenhöhe. Wir schreiben Texte, die von Ihrer Zielgruppe gelesen werden.\n" + 
				"Das ist unser Mehrwert.");
		Inhalt inhalt3 = new Inhalt(Calendar.getInstance(), "Sie haben noch weitere Abgaben bevorstehend", "Als Deadline (englisch „Todeslinie“;\n"
				+ "ein Zeitpunkt, der nicht überschritten werden darf, zu Deutsch etwa „Galgenfrist“) bezeichnet man den Ablaufzeitpunkt einer Frist\n"
				+ "oder Fälligkeit (juristisch), den Stichtag (Bilanzstichtag) oder das Schließen eines Zeitfensters (technisch).\n"
				+ "Der Begriff wurde zunächst im Zeitungsjournalismus verwendet, um den letztmöglichen Termin zu bezeichnen, zu dem die Druckzeilen (englisch lines)\n"
				+ "in die Setzerei gegeben und dort abschließend fixiert wurden.\n" + 
				"Allgemein spricht man bei Überschreiten des Termins von Verspätung, beim Einhalten von fristgemäß oder fristgerecht,\n"
				+ "beim Aufschub des Termins von Vertagung oder Verschiebung. Der Umstand, dass man einen Termin einhalten muss, wird Termindruck genannt.\n");
		Inhalt inhalt4 = new Inhalt(Calendar.getInstance(), "Wir haben Ihre Bestätigung bekommen", "Die Judenbuche« ist ein Klassiker der Weltliteratur.\n "
				+ "Der Stoff geht zurück auf eine wahre Begebenheit, die sich etwa fünfzig Jahre vor der Niederschrift in \n"
				+ "Westfalen zutrug. Die Dichterin Anette von Droste-Hülshoff entwirft das Bild einer Gesellschaft,\n"
				+ "die Recht nicht von Unrecht unterscheidet, was zum äußersten Verbrechen, nämlich zu Mord führt.\n"
				+ "Vor diesem Hintergrund schildert sie die Entwicklung eines jungen Menschen, für die sein Charakter\n"
				+ "ebenso maßgebend ist wie die Erziehung durch sein Umfeld. Die spannende Handlung, eine knappe\n"
				+ "Sprache sowie atmosphärisch dichte Naturbeschreibungen machen aus der Novelle ein besonderes\n"
				+ "Leseerlebnis.\n" + 
				"Quelle: Die Judenbuche - Anette von Droste-Hülshoff - Inhaltsangabe\n" + 
				"https://www.inhaltsangabe.de/droste-huelshoff/die-judenbuche/");
		Inhalt inhalt5 = new Inhalt(Calendar.getInstance(), "Sie sollten dieses interessante Literaturwerk lesen", "Das Drama »König Ödipus« von Sophokles wurde 425 v. Chr. uraufgeführt;\n"
				+ "es gründet auf dem Sagenzyklus um das Geschlecht der Labdakiden. Sophokles konnte auf viele Erzählvarianten und unterschiedliche\n"
				+ "literarische Bearbeitungen der Legende zurückgreifen, nach der Ödipus prophezeit wird, seinen Vater zu töten und mit seiner Mutter Kinder zu zeugen. Der Mythos wird\n"
				+ "beim Publikum als bekannt vorausgesetzt und der eigentliche Inhalt der Tragödie sind die Wahrheitssuche und Selbstenthüllung Ödipus‘, die zur Katastrophe seiner Selbstblendung\n"
				+ "führen. Das Stück spielt vor dem Königspalast in Theben.\n" +
				 "In der Stadt Theben wütet die Pest: Menschen und Tiere sterben, Felder werden unfruchtbar. Alle Hoffnungen richten sich auf den klugen und mitfühlenden König Ödipus, der die Stadt\n"
				+ "einst von der Sphinx befreit hat. Ödipus hat seinen Schwager Kreon nach Delphi geschickt, um das Orakel zu befragen, wie Theben von der Geißel befreit werden könne. Die Antwort des\n"
				+ "Apollon lautet, dass der Mörder von König Laios, Ödipus‘ Vorgänger auf dem Thron, gefunden und bestraft werden müsse. Ödipus verpflichtet sich zur rückhaltlosen Aufklärung\n"
				+ "des Verbrechens, das vor seiner Ankunft in Theben stattgefunden hat. Er droht dem Mörder die Verbannung an.");
		
		Brief brief1 = new Brief(sender1, empfaenger1, inhalt2);
		Brief brief2 = new Brief(sender1, empfaenger1, inhalt1);
		Brief brief3 = new Brief(sender1, empfaenger2, inhalt1);
		Brief brief4 = new Brief(sender1, empfaenger3, inhalt3);
		Brief brief5 = new Brief(sender1, empfaenger4, inhalt3);
		Brief brief6 = new Brief(sender1, empfaenger5, inhalt3);
		Brief brief7 = new Brief(sender1, empfaenger6, inhalt3);
		Brief brief8 = new Brief(sender1, empfaenger7, inhalt3);
		Brief brief9 = new Brief(sender1, empfaenger8, inhalt3);
		Brief brief10 = new Brief(sender1, empfaenger9, inhalt2);
		Brief brief11 = new Brief(sender1, empfaenger10, inhalt2);
		Brief brief12 = new Brief(sender2, empfaenger1, inhalt3);
		Brief brief13 = new Brief(sender3, empfaenger1, inhalt3);
		Brief brief14 = new Brief(sender4, empfaenger1, inhalt4);
		Brief brief15 = new Brief(sender5, empfaenger1, inhalt5);
		
		ArrayList<Brief> briefe = new ArrayList<>();
		briefe.add(brief1);
		briefe.add(brief2);
		briefe.add(brief3);
		briefe.add(brief4);
		briefe.add(brief5);
		briefe.add(brief6);
		briefe.add(brief7);
		briefe.add(brief8);
		briefe.add(brief9);
		briefe.add(brief10);
		briefe.add(brief11);
		briefe.add(brief12);
		briefe.add(brief13);
		briefe.add(brief14);
		briefe.add(brief15);
		
	    new Briefdrucker(briefe).serieDruck(); //Für einen Seriedruck
		new Briefdrucker(brief15).druckeBrief(); //Für einen einzelnen Druck
		
		// Ihr Code fuer das Briefprogramm:
		// Erzeugen Sie Inhalte und Adressen und drucken Sie 
		// einen Brief sowie einen Serienbrief
	  
	}
}