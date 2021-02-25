package pachet;

import Clase.Zoo;

public class main {
	
	public static void main(String[] args) {
	
		Zoo zoo=new Zoo();
		Giraffe g1= new Girrafe("Gifi",300);
		Giraffe g2=new Giraffe("Lola");
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
	}

}
