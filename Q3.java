package lab_2;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		System.out.println("enter a positive number");
		Scanner scan = new Scanner(System.in);
		
		int attempt = 0;
		do {
			int num = scan.nextInt();
			if(num>0) {
			calculator(num);
			break;
			}else {
				attempt++;
				if (attempt==3) {
					System.out.println("sorry thats enough");
					break;
				}
				System.out.println("invalid entry try again");
			}
		}while(true);
		}
		
	

	public static void calculator(int number) {
		int sum =0;
		for(int i = 1;i<=number;i++) {
			sum = sum+i;
	}
		System.out.println("sum is "+sum);
	}
	}

