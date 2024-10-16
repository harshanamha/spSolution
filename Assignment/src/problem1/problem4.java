package problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(5);
		intList.add(8);
		intList.add(9);
		
		 Collections.sort(intList);
		 String max = "";
		 Collections.reverse(intList);
		 
		 for(int a:intList) {
			 max = max + a;
		 }
		 
		 System.out.println("formated Number is:"+max);

	}

}
