package problem1;

import java.util.*;
public class problem5 {


		

		    public static void main(String[] args) {
		        
		        generateExpressions(1, "1", 1);
		    }

		    private static void generateExpressions(int index, String currentExpression, int currentValue) {
		   
		        if (index == 9) {
		           
		            if (currentValue == 100) {
		                System.out.println(currentExpression);
		            }
		            return;
		        }

		        int nextNumber = index + 1;

		       
		        generateExpressions(index + 1, currentExpression + "+" + nextNumber, currentValue + nextNumber);

		       
		        generateExpressions(index + 1, currentExpression + "-" + nextNumber, currentValue - nextNumber);

		        
		        if (index > 0) {  
		            String lastNumberStr = currentExpression.substring(currentExpression.length() - 1);
		            int lastNumber = Integer.parseInt(lastNumberStr);
		            int newNumber = lastNumber * 10 + nextNumber; 
		            String newExpression = currentExpression.substring(0, currentExpression.length() - 1) + newNumber;

		            int newValue = currentValue - lastNumber + newNumber;
		            generateExpressions(index + 1, newExpression, newValue);
		        }
		    }
		}


	
