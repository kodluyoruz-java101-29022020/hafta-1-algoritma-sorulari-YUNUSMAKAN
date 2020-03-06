package algoritmalar;

import java.util.Scanner;

public class SORU2 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
      System.out.println("1:Addition!");
      System.out.println("2:Subtraction!");
      System.out.println("3:Multiplication!");
      System.out.println("4:Divison!");
      System.out.println("Please enter two integer number!");
      int number1 =scan.nextInt();
      int number2 =scan.nextInt();
      System.out.println("Please select!");
      int select=scan.nextInt();
       
      switch(select) {
      
      case 1:System.out.println("Result=" + (number1 + number2));
      break;
      
      case 2:System.out.println("Result=" + (number1 - number2));
      break;
      
      case 3:System.out.println("Result=" + (number1*number2));
      break;
      
      case 4:System.out.println("Result=" + ((float)number1/((float)number2)));
    	
      break;
     
       }

      

      
      
      
      
      
	}

}
