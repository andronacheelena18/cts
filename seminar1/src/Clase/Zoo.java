package Clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	
	private Zookeeper zookeeper;
	private List<Animal> animals;
	
	public Zoo(Zookeeper zookeeper, List<Animal> animals) {
		super();
		this.zookeeper = zookeeper;
		this.animals = animals;
	}
	public Zoo() {
		
		this.zookeeper = new Zookeeper() ;
		this.zookeeper.setName("Gigel");
		this.animals = new ArrayList<>() ;
	}
	
	public void addAnimal(Animal animal)
	{
		this.animals.add(animal);
	}
	
	public void feedAllAnimals()
	{ 
		for(Animal a : this.animals)// pt fiecare obiect de tip animal din colectia animals, foreach
		{zookeeper.feed(a);
		}
		}
	}
	


