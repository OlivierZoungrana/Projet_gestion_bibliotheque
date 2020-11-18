package co.simplon.exo3;

import java.time.LocalDate;

public class Adherent1 {
	
	String nom;
	String prenom;
	String email;
	String adresse;
	LocalDate dateNaissance;
	
	
	public Adherent1(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}


	public Adherent1(String nom, String prenom, LocalDate dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}


	public Adherent1(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}
	
	
	
	

}
