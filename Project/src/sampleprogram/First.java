package sampleprogram;

public class First {
	
	public void studentName() {
		System.out.println("dhanush");
	}
	public void studentAge() {
		System.out.println("18");
	}
	public void studentId() {
		System.out.println("04");
	}
	public static void main(String[]args) {
		First obj = new First();//object create
		obj.studentName();
		obj.studentAge();
		obj.studentId();
	}

}
