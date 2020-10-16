package ca.socom;

public class Afficher  implements IAffiche{

	public static void main(String[] args) {
		Afficher aff=new Afficher();
		System.out.println(aff.ditBonjour("Lamine"));
		//aff.ditBonjour("Lamine");
		

	}

	@Override
	public String ditBonjour(String t1) {
		// TODO Auto-generated method stub
		return "Bonjour "+t1;
	}

}
