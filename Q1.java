package lab_2;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		
		System.out.println("enter your first number");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int smallest, largest;
		smallest = num1;
		largest = num1;
		
		while(true) {
		System.out.println("enter your next number");
		int num2 = scan.nextInt();
		if (num2>largest)largest = num2;
		if(num2<smallest) smallest = num2;
		
		System.out.println("do you wanna enter another one?		0:No	1:Yes");
		int answer = scan.nextInt();
		if (answer==1) continue;
		else break;
		}
		
			
		
		System.out.println("smallest number is :"+smallest+"\nlargest number is: "+largest);
		
	
		
		
		}

	}
