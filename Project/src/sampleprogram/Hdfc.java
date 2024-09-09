package sampleprogram;

public class Hdfc implements Banking {
	
	public void animal() {
		System.out.println("pig");
	}
	
	public void salary() {
		System.out.println("twenty thousand");
	}
	public void current() {
		System.out.println("currents");
	}
	
	public static void main(String[]args) {
		Hdfc obj = new Hdfc();
		obj.salary();
		obj.current();
		obj.animal();
	}

}
