package Ro.ase.cts.program;
 import Ro.ase.cts.Clase.Angajat;
import Ro.ase.cts.Clase.Utils;
import Ro.ase.cts.program.*;

import java.io.FileNotFoundException;
import java.util.List;



public class Program {

	public static void main(String[] args) {
		List<Angajat> listaAngajati;
		try {
			listaAngajati = Utils.readAngajati("angajati.txt");
			for(Angajat angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
