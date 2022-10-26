package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boissonFav, int nbArgent) {
		super(nom, boissonFav, nbArgent);

	}

	public int seFaireExtorquer(int argent) {
		this.perdreArgent(argent);
		this.parler("J'ai tout perdu! Le monde est trop injuste...");
		return argent;
	}

	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		this.parler(argent + " sous! Je te remercie généreux donateur!");
	}
}
