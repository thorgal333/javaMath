package fonctions;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quelle fonction désirez-vous ?");
		System.out.println("fonction 1 : Somme d'un tableau");
		System.out.println("fonction 2 : Minimum d'un tableau");
		System.out.println("fonction 3 : Présence 1 à 5");
		System.out.println("fonction 4 : Suite de Syracuse");
		System.out.println("fonction 5 : Etoile");
		System.out.println("fonction 6 : Puissance");

		System.out.print("Votre choix: ");
		int choix = sc.nextInt();
		
		//Appel de la fonction en fonction du choix
		switch(choix)
		{
		case 1:
			Fonction1 f1 = new Fonction1();
			System.out.println("Somme du tableau : " + f1.Calcul() );
			break;
		case 2:
			Fonction2 f2 = new Fonction2();
			System.out.println("Minimum du tableau : " + f2.Calcul() );
			break;
		case 3:
			Fonction3 f3 = new Fonction3();
			System.out.println("Présence dans le tableau : ");
			List<Integer> lesNombres1 = f3.Calcul();
			int num = 1;
			for(int x : lesNombres1)
			{
				System.out.println(num + " : " + x);
				num++;
			}
			break;
		case 4:
			Fonction4 f4 = new Fonction4(155);
			System.out.println("Suite de Syracuse : ");
			List<Integer> lesNombres2 = f4.Calcul();
			for(int x : lesNombres2)
			{
				System.out.println(x);
			}
			break;
		case 5:
			Fonction5 f5 = new Fonction5();
			System.out.println("dessin étoile : ");
			f5.Calcul();
			break;
		case 6:
			Fonction6 f6 = new Fonction6(5,3);
			System.out.println("Puissance: " + f6.Calcul());
			break;



		}

		sc.close();
	}

}
