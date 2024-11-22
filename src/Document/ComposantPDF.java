package Document;

public class ComposantPDF {
	protected String contenu;
	
	public void pdfFixeContneu(String contenu) {
		this.contenu = contenu;
	}
	
	public void pdfPrepareAffichage() {
		
	}
	
	public void pdfRafraichir() {
		
	}
	
	public void pdfTermineAffichage() {
		System.out.println(this.contenu);
	}
	
	public void pdfEnvoieImprimante() {
		System.out.println(this.contenu);
	}
}
