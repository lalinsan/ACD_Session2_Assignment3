/*
 * Student: Eduardo Aguirre
 * Session 2
 * Assignment 2
 * Java program that uses a Loop to print a pattern
 */


public class LoopToPrintNumbers {
 
	public static void main (String[] args)
	{
		
		int i, j, k, l; //Declare Variables used by the Loops
		
		for (i = 1; i < 6; i++)  //set variable i to 1, while i < 6 executes next loop, increments variable i by 1
		{
            for (j = 1; j < i + 1; j++) { //set variable j to 1, while variable j< variable i prints j, increments variable j by 1
                System.out.print(j); //Prints variable j
                
            } System.out.println(); //Adds return
        } 
				  
	        for(k = 6; k > 1; k--) { //set variable k to 6, while k < 1 executes next loop, decrements variable k by 1
	            for(l = 1; l < k - 1; l++){ //set variable l to 1, while variable l< variable k prints l, increments variable l by 1
	                System.out.print(l);//Adds a return
	            }
	            System.out.println();//Adds a return
	        }
		    
	}
	
}
