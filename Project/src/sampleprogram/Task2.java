package sampleprogram;

public class Task2 {
	
	public static void main(String[]args) {
		int sum = 0;
		for(int i=1; i<=50; i++){
			while (i % 2 != 0) {
				System.out.println(i);
				sum = i + sum;
				break;
			}
			
		}
		System.out.println("sum is : " + sum);

	}

}
