package sampleprogram;

public class Function {
	
	public static int addition(int a , int b) {
		return a+b;
	}
	public static int subtraction(int a , int b) {
		return a-b;
	}
	public static int multiplication(int a , int b) {
		return a*b;
	}
	public static int division(int a , int b) {
		return a*b;
	}
	
	
	
	
	public static void main(String[]args) {
		int ad = addition(7,3);
		System.out.println(ad);
		int sub = subtraction(7,3);
		System.out.println(sub);
		int mul = multiplication(7,3);
		System.out.println(mul);
		int div = division(10,2);
		System.out.println(div);
	}

}
