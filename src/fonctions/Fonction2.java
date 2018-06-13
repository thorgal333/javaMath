package fonctions;
public class Fonction2 {
	private int[] Tab;
	public Fonction2()
	{
		Tab= new int[]{53, 56, 1, 130, 45, 58};
	}

	/**
	 * Cherche la valeur minimum d'un tableau
	 * @return la valeur minimum
	 */
	public int Calcul()
	{
		int min = Tab[0];
		for(int i=1; i < Tab.length; i++)
		{
			if (Tab[i] < min) min = Tab[i];
		}
		return min;
	}
}

