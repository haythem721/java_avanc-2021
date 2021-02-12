package lesinterfaces;

public class Personne implements Homme {
	
	private String nom,prenom;
	

	public Personne(String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
	}


	@Override
	public void identite() {
		
		System.out.println("nom="+nom+" prenom="+prenom);
		
	}
	
}
