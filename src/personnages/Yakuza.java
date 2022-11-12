package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	
	public Yakuza(String nom, String boissonFav, int nbArgent, String clan) {
		super(nom, boissonFav, nbArgent);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentVole = victime.seFaireExtorquer(getNbArgent());
		this.gagnerArgent(argentVole);
		this.parler("J'ai piqué les " + argentVole + " sous de " + victime.getNom() +
				", ce qui me fait " + this.getNbArgent() + " dans ma poche. Hi ! Hi !" );
	}
}
