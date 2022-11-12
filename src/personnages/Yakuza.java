package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	
	public Yakuza(String nom, String boissonFav, int nbArgent, String clan) {
		super(nom, boissonFav, nbArgent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return this.reputation;
	}

	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentVole = victime.seFaireExtorquer(victime.getNbArgent());
		this.gagnerArgent(argentVole);
		this.parler("J'ai piqué les " + argentVole + " sous de " + victime.getNom() +
				", ce qui me fait " + this.getNbArgent() + " dans ma poche. Hi ! Hi !" );
	}
	
	public int perdre() {
		int argentPerdu = this.getNbArgent();
		this.perdreArgent(argentPerdu);
		this.reputation -= 1;
		this.parler("J'ai perdu mon duel et " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + this.clan);
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		this.reputation ++;
		this.parler("Ce ronin pensait vraiment battre " + this.getNom() + " du clan de " + this.clan +
				" ? Je l'ai dépouillé de ses " + gain + " sous.");
	}
	
}
