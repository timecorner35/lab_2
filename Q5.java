package lab_2;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		System.out.println("enter the charge for meal");
		Scanner scan = new Scanner(System.in);
		double charge = scan.nextInt();
		calcualator(charge);
		

	}

	public static void calcualator(double charge) {
		double taxincluded = 1.0675*charge;
		double total = taxincluded*1.2;
		System.out.println("meal charge is: "+charge+"\ntax amount: "+charge*0.0675+"\ntip: "+taxincluded*0.2+"\ntotal amount: "+total);
		
		
	}

}
