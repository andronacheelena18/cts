package Ro.ase.cts.Clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static float suma=30;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		
			StringBuilder str=new StringBuilder( "Elevul:");
			str.append(super.toString()).append("clasa").append(clasa).append("tutore").append(tutore);
			return str.toString();
		}
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public int finantare() {
		int s=30;
		System.out.println("Elevul "+getNume()+" "+getPrenume()+" primeste"+s+" Euro/zi in proiect.");
		return s;
	}
@Override
	public float getSumaFinantata() {
		
		return suma;
	}
	
	public static float getSuma() {
		return suma;
	}
	public static void setSuma(float suma) {
		Elev.suma = suma;
	}
	
	
}
