package sampleprogram;

import java.util.ArrayList;

public class Arraylist {
	
	public static void main(String[]args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("pink");
		color.add("black");
		color.add("red");
		color.add("orange");
//		color.remove(0);
		color.set(0,"violet");
		
		
		System.out.println(color);
		System.out.println(color.get(0));
	}

}
