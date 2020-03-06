package algoritmalar;

import java.util.Scanner;

public class SORU4 {

	public static void main(String[] args) 
	{
        //Kullanicidan sira sayisini almak istersek, yorum satirindaki islemler gerceklestirilecek.
		 /*System.out.println("Sira sayisini Giriniz!");
		Scanner x = new Scanner(System.in);
		int sira = x.nextInt();*/  
		 
		
		int sira=10;//Sira sayisini sabit deger atamasi ile yaparsak.
		for(int i=0; i<=sira; i++) 
		{
			
			for(int j=0; j<i; j++) 
			{
				
		   System.out.print("*");		
			
	        }
			
			System.out.println(" ");

			
		}
	}

}
