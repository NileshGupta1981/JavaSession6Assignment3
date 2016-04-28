import java.util.Scanner;

public class Area {
	
	public static void main (String args[]){
		Triangle tri = new Triangle();
		Rectanlge rect = new Rectanlge();
		Scanner scnr = new Scanner (System.in);
		tri.draw();
		System.out.println ("Enter the base length of triangle");
		double basetri = scnr.nextDouble();
		System.out.println ("Enter the height lenght of triangle");
		double heighttri = scnr.nextDouble();
		tri.getarea(basetri, heighttri);
		rect.draw();
		System.out.println ("Enter the base length of rectangle");
		double rectbase = scnr.nextDouble();
		System.out.println ("Enter the height length of rectangle");
		double rectheight = scnr.nextDouble();
		rect.getarea(rectbase, rectheight);
		scnr.close();
	}
	
	
}



