package co.simplon.exo1;
import java.time.LocalDate;
import java.util.*;
import co.simplon.exo2.Exemplaire;


public class Adherent  {
	
	String nom;
	String prenom;
	String email;
	String adresse;
	LocalDate dateNaissance;
	List<Exemplaire> Lemprunter = new ArrayList<Exemplaire>();
	
	
	
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
	
	
	public List<Exemplaire> emprunter(Exemplaire exemplaire, Date date) {
		
		Lemprunter.add(exemplaire);
		
		return Lemprunter;
			
	} 

	
	
	
	

	
	

}
