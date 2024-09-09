package sampleprogram;

public class Comparelogical {
	
	public static void main(String[]args) {
		int a = 80;
		int b = 90;
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		
		System.out.println((a<b)&&(a==b));
		System.out.println((a<b)||(a==b));
		System.out.println(!((a<b)&&(a==b)));
		System.out.println(!((a<b)||(a==b)));
		
		
				
	}

}
