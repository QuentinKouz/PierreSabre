package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int nbArgent;

	public Humain(String nom, String boissonFav, int nbArgent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.nbArgent = nbArgent;
	}

	public String getNom() {
		return this.nom;
	}

	public int getNbArgent() {
		return this.nbArgent;
	}

	public void parler(String texte) {
		System.out.println("(" + getNom() + ") - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! je m'appelle " + getNom() + " et j'aime boire du " + this.boissonFav);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + this.boissonFav + " ! GLOUPS !");
	}

	public void gagnerArgent(int gain) {
		this.nbArgent = getNbArgent() + gain;
	}

	public void perdreArgent(int perte) {
		this.nbArgent = getNbArgent() - perte;
	}

	public void acheter(String bien, int prix) {
		if (getNbArgent() >= prix) {
			parler("j'ai " + getNbArgent() + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix
					+ " sous");
			this.perdreArgent(prix);
		} else {
			parler("je n'ai plus que " + getNbArgent() + " sous en poche. Je ne peux même pas m'offrir " + bien + " à "
					+ prix + " sous");
		}
	}



}
