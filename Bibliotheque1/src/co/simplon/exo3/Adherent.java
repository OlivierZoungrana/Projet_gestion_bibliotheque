package co.simplon.exo3;
import java.time.LocalDate;


public class Adherent  {
	
	String nom;
	String prenom;
	String email;
	String adresse;
	LocalDate dateNaissance;
	//Adherent toto;
	
	
	public Adherent() {
		//super();
	}
	
	public Adherent(String nom, String prenom, String email, String adresse, LocalDate dateNaissance) {
		//super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
	}
	
	

	public String getNom() {
		return nom;
	}

	public Adherent setNom(Adherent adherent) {
		return adherent;
	}
	
	
	
	

	public String toString() {
		return  nom +" " + prenom+ " "  + email+ " " + adresse+ " "
				+   dateNaissance ;
	}

	
	
	
	

	
	

}
