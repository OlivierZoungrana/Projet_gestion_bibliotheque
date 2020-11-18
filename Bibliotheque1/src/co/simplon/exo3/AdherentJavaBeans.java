package co.simplon.exo3;

import java.time.LocalDate;

public class AdherentJavaBeans {
	
	String nom;
	String prenom;
	String email;
	String adresse;
	LocalDate dateNaissance;
	
	public AdherentJavaBeans() {
		super();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "AdherentJavaBeans [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", adresse=" + adresse
				+ ", dateNaissance=" + dateNaissance + "]";
	}
	
	

}
