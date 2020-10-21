package lab_2;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		System.out.println("enter the numbers of girls");
		Scanner scan = new Scanner(System.in);
		double girls = scan.nextInt();
		System.out.println("enter the numbers of boys");
		double boys = scan.nextInt();
		calculator(girls,boys);
		

	}

	private static void calculator(double girls, double boys) {
		System.out.println("percentage of girls : "+(girls/(girls+boys)*100));
		System.out.println("percentage of boys : "+(boys/(girls+boys)*100));
		
	}

}
