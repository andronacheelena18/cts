package Ro.ase.cts.Clase;



import Ro.ase.cts.Clase.readers.Reader;
import Ro.ase.cts.Clase.readers.StudentReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversalReader {
	
	public static List<Aplicant> readAplicant(Reader reader) throws NumberFormatException, FileNotFoundException{
		return reader.readAplicants();
		
	}



}