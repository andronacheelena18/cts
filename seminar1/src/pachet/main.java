package pachet;

import Clase.Zoo;
import Clase.Giraffe;
import Clase.Zebra;

public class main {
	
	public static void main(String[] args) {
	
		Zoo zoo=new Zoo();
		Giraffe g1= new Giraffe("Gifi",300);
		Giraffe g2=new Giraffe("Lola");
		Zebra z1=new Zebra("zebri",100);
		Zebra z2=new Zebra("zebriiiii");
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		
		zoo.addAnimal(z1);
		zoo.addAnimal(z2);
		
		zoo.feedAllAnimals();
	}

}
