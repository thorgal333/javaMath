package fonctions;

import java.util.ArrayList;
import java.util.List;

public class Fonction3 {
	private int[] Tab;
	public Fonction3()
	{
		Tab= new int[]{1,4,	3,3,4,2,2,2,4,1};
	}

	/**
	 * Recherche le nombre d'occurrence des nombres compris entre 1 et 5 dans un tableau
	 * @return une chaine répresentant le nombre d'occurence de chaque élément
	 */
	public List<Integer> Calcul()
	{

		List<Integer> lesNombres = new ArrayList<Integer>();
		for(int j = 1; j < 6; j++)
		{
			int nb = 0;
			for(int i=0; i < Tab.length; i++)
			{
				if (j == Tab[i])nb ++;
			}
			lesNombres.add(nb);
		}
		return lesNombres;
	}
}
