package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", "thé", 20);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu" ,60);
		marco.direBonjour();
		marco.seFaireExtorquer(20);
		marco.recevoir(15);
		marco.boire();
		yaku.direBonjour();
		yaku.extorquer(marco);
		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(yaku);
	}
}
