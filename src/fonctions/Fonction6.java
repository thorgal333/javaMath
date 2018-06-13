package fonctions;
public class Fonction6 {

	private int Nombre;
	private int Puissance;
	public Fonction6(int nombre, int puissance)
	{		
		Nombre = nombre;
		Puissance = puissance;
	}
	/**
	 * Calcule la puissance d'un nombre
	 * @return la puissance du nombre
	 */
	public int Calcul()
	{
		int result = 1;
		for(int i = 1; i <= Puissance; i++)
		{
			result = result * Nombre;
		}
		
		return result;
	}
}
