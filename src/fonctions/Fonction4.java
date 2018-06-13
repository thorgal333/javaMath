package fonctions;


import java.util.ArrayList;
import java.util.List;

public class Fonction4 {

	private int Nombre;
	public Fonction4(int nombre)
	{
		this.Nombre = nombre;
	}
	/**
	 * Calcule les 20 premiers termes de la suite de syracuse
	 * @return une chaîne contenant les 20 premiers termes
	 */
	public List<Integer> Calcul()
	{
		List<Integer> lesNombres = new ArrayList<Integer>();
		for (int i = 0; i < 20; i++)
		{
		if (Nombre % 2 == 0)
		{
			Nombre = Nombre / 2;
		}
		else
		{
			Nombre = (Nombre * 3) + 1;
		}
			lesNombres.add(Nombre);
		}
		
		return lesNombres;
	}
}
