package sampleprogram;
import java.util.Scanner;

public class Userinput {
	

	public static void main(String[]args) {
		
		
	
		Scanner obj = new Scanner(System.in);
		System.out.println("enter your details");
		String name = obj.nextLine();
		System.out.println("my name is "+ name);
		
	}

}
