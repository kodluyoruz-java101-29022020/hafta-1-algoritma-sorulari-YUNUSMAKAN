package algoritmalar;

import java.util.Random;

public class SORU3 
{
	
	
	public static void average(int n)
	{
		Random random= new Random();
		float total=0;
		
		for(int i=0; i<n; i++) 
		{
			int num =random.nextInt(n);
			System.out.println(num);
			
			total+=num;
		}
		
		System.out.println("Average: "+ (total/n));
		
		
	}
	public static void main(String[] args) 
	{
	
	    average(100);
	
	
	
	}

}



