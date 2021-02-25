package pachet;

import Clase.Zoo;
import Clase.Giraffe;

public class main {
	
	public static void main(String[] args) {
	
		Zoo zoo=new Zoo();
		Giraffe g1= new Giraffe("Gifi",300);
		Giraffe g2=new Giraffe("Lola");
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		
		zoo.feedAllAnimals();
	}

}
