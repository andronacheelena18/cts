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
	

}
