package sampleprogram;

public class Leafyear {
	
	public static void main(String[]args) {
		int year = 20;
		
		if((year % 4 == 0) || (year % 100 == 0)){
			System.out.println("its a leapyear");
		}else {
			System.out.println("its not a leapyear");
		}
		
	}

}
