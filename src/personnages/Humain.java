package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int nbArgent;
	protected int nbConnaissance;
	protected Humain[] memoire = new Humain[30];

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
	
	public void memoriser(Humain autreHumain) {
		if (this.nbConnaissance < this.memoire.length) {
			this.nbConnaissance ++;
			this.memoire[this.nbConnaissance -1] = autreHumain;
		}else {
			for (int i = 0;i < this.memoire.length-1;i++) {
				this.memoire[i] = this.memoire[i+1];
			}
			this.memoire[29] = autreHumain;
		}
	}
	
	public void repondre(Humain autreHumain) {
		this.direBonjour();
		this.memoriser(autreHumain);
	}
	
	public void faireConnaissance(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
	}

	public void listerConnaissance() {
		String texte = "" + this.memoire[0].getNom();
		for (int i = 1; i<this.nbConnaissance; i++) {
			texte = texte + ", " + this.memoire[i].getNom();
		}
		System.out.println("Je connais beaucoup de monde dont : " + texte);
	}

}
