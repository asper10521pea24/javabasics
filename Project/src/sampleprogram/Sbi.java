package sampleprogram;

public class Sbi extends Bank {
	
	public void current() {
		System.out.println("currents");
	}
	public void salary() {
		System.out.println("salarys");
	}
	
	public static void main(String[]args) {
		
		Sbi obj = new Sbi();
		obj.current();
		obj.salary();
		obj.savings();
	
	}

}
