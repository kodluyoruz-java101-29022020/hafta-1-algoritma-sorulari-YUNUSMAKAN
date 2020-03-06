package algoritmalar;

import java.util.Random;

public class SORU5 
{
    	
    
	public static void main(String[] args) 
	{
		
		int[] arr = new int[100]; 		 
		 Random r = new Random(); 		 
		 for(int i=0; i<100; i++) 
		 {
		 arr[i] = r.nextInt(100); 
		 System.out.print(arr[i]+ "-");
		 }
		 System.out.println();
		 
		 
		 for(int i=0; i<arr.length; i++) 
		 {
		 if(arr[i]%2==0) 
		 { 		
		 
			 System.out.print("Even Number:" + arr[i]+ "\n");
		 }
		 else { 
			 System.out.print("Odd: number:" + arr[i]+ "\n");
		 }	
		
		}
        		
		 	 
	}
}

