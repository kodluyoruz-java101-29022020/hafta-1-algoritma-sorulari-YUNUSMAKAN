package soru6;

public class Soru6main {

	public static void main(String[] args) {

		PDFDocument pdf= new PDFDocument();
		WordDocument word= new WordDocument();
		
		System.out.println(pdf.getBody());
		System.out.println(word.getBody());

		
	}

}
