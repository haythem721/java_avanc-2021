package lesinterfaces;

public class Test {
	

	public static void main(String[] args) {
		
		Peuple peuple=new Peuple();
		Homme h=new Personne("aa", "bb");
		Homme h1=new Client("aaa","bbb",1);
		Personne p=new Personne("a","b");
		Client c=new Client("abcd","xyz",5);
		peuple.naissance(h);
		peuple.naissance(h1);
		peuple.naissance(p);
		peuple.naissance(c);
		peuple.explorer();
		

	}

}
