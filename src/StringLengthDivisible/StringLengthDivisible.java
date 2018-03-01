package StringLengthDivisible;
import java.util.Scanner;
public class StringLengthDivisible {

	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String text=scanner.nextLine();
		
		System.out.println(Divisible(text));
	}
	
	public static String Divisible(String word){
		
		int c1=word.length();
		
		int length=c1-2;
		
		if(length%2==0){
			
			return "True";
		}
		
		else{
			
			return "False";
		}
		
	}
}


