package algoritmalar;

import java.util.Scanner;

public class SORU1 
{

	public static void main(String[] args)
	{
			
	
	Scanner userpss = new Scanner(System.in);
	
    String password ="12345";
    
    int a =Integer.valueOf(password);
    

    System.out.println("Enter Your Passsword!");
    int input = userpss.nextInt();
    
   ;
    if (input == a)
    {
    	System.out.println("Login Successful!");
    	
    }
    else {
		System.out.println("Login Failed!");
		 
		 }
	}
		
		 	
			
			
	}


