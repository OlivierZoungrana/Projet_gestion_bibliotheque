package co.simplon.exo3;

public class Auteur {
	
	int id_auteur;
	String nom;
	String prenom;
	
	
	public Auteur() {
		super();
	}


	public Auteur(int id_auteur, String nom, String prenom) {
		super();
		this.id_auteur = id_auteur;
		this.nom = nom;
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	
	

}
