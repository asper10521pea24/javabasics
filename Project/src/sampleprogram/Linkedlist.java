package sampleprogram;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[]args) {
		LinkedList<String> color = new LinkedList<String>();
		color.add("pink");
		color.add("black");
		color.add("orange");
		color.add("white");
		color.addFirst("violet");
		color.addLast("red");
		color.removeFirst();
		color.removeLast();
		
		System.out.println(color);
		System.out.println(color.getFirst());
		System.out.println(color.get(3));
	}

}
