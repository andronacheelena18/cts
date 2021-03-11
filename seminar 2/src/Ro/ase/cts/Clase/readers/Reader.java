package Ro.ase.cts.Clase.readers;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import Ro.ase.cts.Clase.Aplicant;

public abstract class Reader {
	protected String fileName;


	
	public Reader(String fileName) {
		super();
		this.fileName = fileName;
	}


	public abstract List<Aplicant> readAplicants()throws FileNotFoundException;
	
	public void readAplicant( Aplicant a,Scanner input)
	{
		String nume = input.next();
		String prenume = (input.next()).toString();
		int varsta = Integer.valueOf(input.nextInt());
		int punctaj = Integer.valueOf(input.nextInt());
		int nr = Integer.valueOf(input.nextInt());
		String[] vect = new String[nr];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();
		a.setNume(nume);
		a.setPrenume(prenume);
		a.setVarsta(varsta);
		a.setPunctaj(punctaj);
		
		a.setDenumiriProiecte(nr, vect);
	
		
		
	}

}
