package fonctions;

public class Fonction1 {
	private int[] Tab;
	public Fonction1()
	{
		Tab= new int[]{5, 78, 23, 13, 12, 56};
	}
	
	/**
	 * Calcule la somme d'un tableau
	 * @return la somme du tableau
	 */
	public int Calcul()
	{
		int result = 0;
		for(int i=0; i < Tab.length; i++)
		{
			result += Tab[i];
		}
		return result;
	}
}
