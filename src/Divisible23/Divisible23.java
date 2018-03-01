package Divisible23;
import java.util.Scanner;	
public class Divisible23 {

	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);

		System.out.println("Please input a number.");
		int a=scanner.nextInt();

		if(a%2==0 && a%3==0){

			System.out.println("This number is divisible by 2 and 3");
		}

		else

		{

			System.out.println("This number is not divisible by 2 and 3");
		}
	}
}

