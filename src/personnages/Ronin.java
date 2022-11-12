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
	
	public void provoquer(Yakuza adversaire) {
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (this.honneur*2 >= adversaire.getReputation()) {
			this.parler("Je t'ai eu petit yakusa !");
			int gain = adversaire.perdre();
			this.gagnerArgent(gain);
			this.honneur ++;
		} else {
			this.honneur --;
			int perte = this.getNbArgent();
			this.perdreArgent(getNbArgent());
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(perte);
		}
	}
	
}
