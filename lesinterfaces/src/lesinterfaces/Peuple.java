package lesinterfaces;

public class Peuple {
	
	Homme tab[]=new Homme[100];
	int nbHommes;
	void naissance(Homme h)
	{
		if(nbHommes<tab.length)
			tab[nbHommes++]=h;
	}
	void explorer()
	{
		for (int i=0;i<nbHommes;i++)
		{
			tab[i].identite();
			System.out.println("************************");
		}
	}
	

}
