package sampleprogram;

public class Task {
	
	public static void main(String[]args) {
		int sum = 0;
		for(int i=1;i<=50;i++) {
			
//			System.out.println(i);
//			if(i % 2 ==0 ) {
//				System.out.println("even");
//			}
//			else {
//				System.out.println("odd");
//
//			}
			sum = i + sum;
			System.out.println(i);
			
		}
		System.out.println("sum is : " + sum);
		
		
	}

}
