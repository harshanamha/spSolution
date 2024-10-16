package problem1;

import java.util.*;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> charList = new ArrayList<>();
		
		charList.add("a");
		charList.add("b");
		charList.add("c");
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		List<String> newList = new ArrayList<>();
		
		
		
//		newList.addAll(charList);
//		newList.addAll(intList);
		
		for(String s:charList) {
			newList.add(s);
		}
		
		for(Integer d:intList) {
			newList.add(d.toString());
		}
		
		System.out.println(newList);
	}

}
