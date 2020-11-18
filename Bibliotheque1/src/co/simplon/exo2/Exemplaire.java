package co.simplon.exo2;

public class Exemplaire {
	
	String editeur;
	int annee_edition;
	
	public Exemplaire() {
		super();
	}

	public Exemplaire(String editeur, int annee_edition) {
		super();
		this.editeur = editeur;
		this.annee_edition = annee_edition;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public int getAnnee_edition() {
		return annee_edition;
	}

	public void setAnnee_edition(int annee_edition) {
		this.annee_edition = annee_edition;
	}
	
	

}
