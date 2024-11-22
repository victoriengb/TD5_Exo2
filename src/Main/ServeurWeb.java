package Main;

import Document.Document;
import Document.DocumentHTML;
import Document.DocumentPDF;

public class ServeurWeb {

	public static void main(String[] args) {
		Document document1, document2; 
		
		document1 = new DocumentHTML(); 
		document1.setContenu("Hello") ; 
		document1.dessine() ; 
		System.out.println() ; 
		
		document2 = new DocumentPDF(); 
		document2.setContenu("Bonjour") ; 
		document2.dessine() ; 
	}
}
