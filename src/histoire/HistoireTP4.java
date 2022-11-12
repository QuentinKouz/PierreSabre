package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", "thé", 20);
		marco.direBonjour();
		marco.seFaireExtorquer(20);
		marco.recevoir(15);
		marco.boire();
	}
}
