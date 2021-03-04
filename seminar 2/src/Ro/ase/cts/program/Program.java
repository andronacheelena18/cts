package Ro.ase.cts.program;
 import Ro.ase.cts.Clase.Angajat;
import Ro.ase.cts.Clase.Utils;
import Ro.ase.cts.Clase.Aplicant;
import Ro.ase.cts.program.*;
import Ro.ase.cts.Clase.readers.*;

import java.io.FileNotFoundException;
import java.util.List;



public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = EmployeeReader.readAngajati("angajati.txt");
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}