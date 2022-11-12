package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFav, int nbArgent) {
		super(nom, boissonFav, nbArgent);
	}

	public void donner(Commercant beneficiaire) {
		int argentDonne = this.getNbArgent() / 10;
		this.perdreArgent(argentDonne); 
		this.parler(beneficiaire.getNom() + " prends ces " + argentDonne + " sous");
		beneficiaire.recevoir(argentDonne);
	}
	
	
}
