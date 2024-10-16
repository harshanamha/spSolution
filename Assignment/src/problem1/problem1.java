package problem1;

import java.util.*;

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,k;
		List<Integer>numbers = new ArrayList<>();
		
		numbers.add(23);
		numbers.add(12);
		numbers.add(15);
		numbers.add(1);
		numbers.add(34);
		numbers.add(54);
		numbers.add(76);
		
		Integer total1 = 0;
		Integer total2 = 0;
		
		k = numbers.size();
		
		
		//forloop
		for(i=0;i<k;i++) {
			total1 = total1+numbers.get(i);
		}
		
		System.out.println(total1);
		
		//while loop
		int j=0;
		while (j < k) {
			total2 = total2+numbers.get(j);
			  j++;
			}
		System.out.println(total2);
		
		//recursion
		
		int result = sum(numbers);
	    System.out.println(result);
		

	}
	
	 public static int sum(List<Integer> numList) {
		    if (numList.size() > 0) {
		    	int i,total=0;
		    	for(i=0;i<numList.size();i++) {
					total = total+numList.get(i);
				}
		    	
		    	return total;
		    } else {
		      return 0;
		    }
		  }

}
