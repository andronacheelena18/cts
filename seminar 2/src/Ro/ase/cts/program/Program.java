package Ro.ase.cts.program;
 import Ro.ase.cts.Clase.UniversalReader;

import Ro.ase.cts.Clase.Angajat;
import Ro.ase.cts.Clase.Aplicant;
import Ro.ase.cts.Clase.Proiect;
import Ro.ase.cts.Clase.Student;
import Ro.ase.cts.Clase.readers.*;
import Ro.ase.cts.Clase.readers.EmployeeReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		
		System.out.println (Student.getSuma());
		System.out.println (Angajat.getSuma());
		
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = UniversalReader.readAplicant(new EmployeeReader("angajati.txt"));
			Proiect p=new Proiect(80);
			for(Aplicant aplicant:listaAplicanti)
			{
			System.out.print(aplicant.toString());					
			System.out.println(aplicant.getSumaFinantata());
			aplicant.AfisareStatusProiect(p);
			}}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}
