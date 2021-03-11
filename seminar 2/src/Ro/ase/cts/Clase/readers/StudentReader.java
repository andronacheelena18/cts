package Ro.ase.cts.Clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Ro.ase.cts.Clase.Student;

import Ro.ase.cts.Clase.Aplicant;


public class StudentReader extends Reader {
	
	
	
	public StudentReader(String fileName) {
		super(fileName);
	
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
		
		
		Scanner input = new Scanner(new File(super.fileName));
		input.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Student s=new Student();
			
		super.readAplicant(s, input);
			String facultate = (input.next()).toString();
			int an_studii=input.nextInt();
		
			s.setAn_studii(an_studii);
			s.setFacultate(facultate);
			
			studenti.add(s);
		}
		input.close();
		return studenti;
	}

}
