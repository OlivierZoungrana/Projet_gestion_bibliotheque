package co.simplon.exo2;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
	
	String nom;
	String adresse;
	List<Adherent> inscription = new ArrayList<Adherent>();
	
	
	public Bibliotheque(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}

	
	public String toString() {
		//for(Adherent i: inscription) {
			
			//System.out.println(i);
			
	//	}
		
		return "Bibliotheque [inscription=" + inscription + "]";
	}


	public List<Adherent> inscrire(Adherent adherent) {
		
		inscription.add(adherent);
	
		return inscription;
			
	}
	
	public List<Adherent> desinscrire(Adherent adherent){
		
		inscription.remove(adherent);
		
		return inscription;
	}
	
	

}
