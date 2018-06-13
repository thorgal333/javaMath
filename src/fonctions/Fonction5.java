package fonctions;
public class Fonction5 {

	public Fonction5()
	{		
	}
	/**
	 * Affiche un triangle avec des étoiles
	 */
	public void Calcul()
	{
		for(int i=0; i < 6; i++)
		{
			for(int j =0;  j < i+1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
