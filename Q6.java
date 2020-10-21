package lab_2;
import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		System.out.println("enter the amount purchase");
		Scanner scan = new Scanner(System.in);
		double price = scan.nextInt();
		taxcalculator(price);
	}

	public static void taxcalculator(double a) {
		double state = 0.04*a;
		double county = 0.02*a;
		System.out.println("amount of the purchase is: "+a+"\nthe state sales tax: "+state+"\ncounty sales charge: "+county+"\ntotal sales tax: "+(county+state)+"\ntotal sale: "+(a+county+state));
		
	}

}
