package co.simplon.exo3;

import java.time.LocalDate;
import java.time.Month;

public class GestionAdherents {

	public static void main(String[] args) {
		
		Adherent lolo=null;
		Adherent toto;
		Adherent jero;
		Adherent poua;
		
		Bibliotheque BiblioKids;
		
		LocalDate dateNaissance= LocalDate.of(2018, Month.AUGUST, 18);
		lolo = new Adherent("Lisa", "moa", "pou@yahoo.fr", "bp",dateNaissance );
		toto = new Adherent("Aimee", "moa", "pou@.yahoo.fr", "bp",dateNaissance);
		jero = new Adherent("lucie", "tyu", "p@gmail.com", "bp",dateNaissance);
		poua = new Adherent("Ai", "moa", "pou@hotmail.fr", "bp",dateNaissance);
		
		BiblioKids = new Bibliotheque("aa", "bb");
		BiblioKids.inscrire(lolo);
		BiblioKids.inscrire(toto);
		BiblioKids.inscrire(jero);
		BiblioKids.inscrire(poua);
		BiblioKids.toString();
		
		BiblioKids.desinscrire(toto);
		
		//System.out.println(BiblioKids);
		
		
		//lolo.toString();
		//toto.toString();
		
		toto.setNom(lolo);
		toto.toString();
		
		//System.out.println(lolo);
		System.out.println(toto);
		//System.out.println(lolo==toto);
		
	}

}
