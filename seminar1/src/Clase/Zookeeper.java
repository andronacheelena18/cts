package Clase;

public class Zookeeper {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Zookeeper() {
		super();
	}

	public void feed(Animal a) {

		System.out.println(name + " hraneste animalul" + a.getName());
	}
}
