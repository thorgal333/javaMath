package test;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import fonctions.*;

public class TestFonctions {

	@Test
	public void testFonction1() {
		Fonction1 f1 = new Fonction1();
		 assertEquals(187, f1.Calcul());
	}

	@Test
	public void testFonction2() {
		Fonction2 f2 = new Fonction2();
		 assertEquals(1, f2.Calcul());
	}

	@Test
	public void testFonction3() {
		Fonction3 f3 = new Fonction3();
		List<Integer> liste = f3.Calcul();
		int nombre = liste.get(0);
		 assertEquals("erreur avec 1" , 2, nombre);
		 nombre = liste.get(4);
		 assertEquals("erreur avec 5" , 0, nombre);
		 

	}

	@Test
	public void testFonction4() {
		Fonction4 f4 = new Fonction4(155);
		List<Integer> liste = f4.Calcul();
		int nombre = liste.get(0);
		 assertEquals("erreur avec le premier terme" , 466, nombre);
		 nombre = liste.get(1);
		 assertEquals("erreur avec le deuxième terme" , 233, nombre);

	}

	@Test
	public void testFonction6() {
		Fonction6 f6 = new Fonction6(5,3);

		 assertEquals("erreur avec 5 , 3" ,125, f6.Calcul());
		 f6 = new Fonction6(4,2);
		 assertEquals("erreur avec 4 , 2" ,16, f6.Calcul());


	}


}
