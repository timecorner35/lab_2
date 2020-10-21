package lab_2;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		
		System.out.println("enter your first number");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		System.out.println("enter your next number");
		int num2 = scan.nextInt();
		int smallest, largest;
		if (num1<=num2) {smallest = num1; largest = num2;}
		else {smallest = num2; largest = num1;}
		System.out.println("do you wanna enter another one?		0:No	1:Yes");
		int answer = scan.nextInt();
		if (answer==1)
		do{
		
			
			System.out.println("enter your next number");
			int inp1 = scan.nextInt();
			if(inp1<smallest) {
				smallest = inp1;
			}
			else if(inp1>largest) {
				largest = inp1;
			}
			
			System.out.println("do you wanna enter another one?		0:No	1:Yes");
			int secanswer = scan.nextInt();
			if (secanswer==0) {
				System.out.println("smallest number is :"+smallest+"\nlargest number is: "+largest);
				return;
				}
			
		}while(answer==1);
		
		System.out.println("smallest number is :"+smallest+"\nlargest number is: "+largest);
		
	
		
		
		}

	}
