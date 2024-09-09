package sampleprogram;

public class Son extends Father  {
	
	public void education() {
		System.out.println("school");
	}
	public static void main(String[]args) {
		Son obj = new Son();
		obj.studentName();
		obj.money();
		obj.education();
		obj.studentAge();
		obj.studentId();
		
	}

}
            