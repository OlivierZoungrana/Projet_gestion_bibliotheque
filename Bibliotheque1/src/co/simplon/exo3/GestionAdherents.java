package co.simplon.exo3;

import java.time.LocalDate;
import java.time.Month;

public class GestionAdherents {

	public static void main(String[] args) {
		
		AdherentJavaBeans toto = new AdherentJavaBeans();
		
		 toto.setNom("Dupont");
		 toto.setDateNaissance(LocalDate.of(2002, Month.JANUARY, 12));
		
		 toto.setAdresse("1, av. des Champs-Elysées, 75008 Paris");
		 
		 toto.toString();
		 System.out.println(toto);
		 
		 
		 }
		 }
		
		
	


