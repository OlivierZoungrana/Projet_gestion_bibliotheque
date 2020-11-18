package co.simplon.exo2;

public class Livre {
	int id;
	String titre;
	Auteur auteur;
	
	
	public Livre() {
		super();
	}


	public Livre(int id, String titre, Auteur auteur) {
		super();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	
	
	

}
