package Document;

public class DocumentPDF implements Document{

	ComposantPDF composantPDF;
	
	public DocumentPDF() {
		this.composantPDF = new ComposantPDF();
	}
	@Override
	public void setContenu(String contenu) {
		this.composantPDF.pdfFixeContneu(contenu);
		
	}

	@Override
	public void dessine() {
		composantPDF.pdfPrepareAffichage();
		composantPDF.pdfRafraichir();
		composantPDF.pdfTermineAffichage();
		
	}

	@Override
	public void imprime() {
		composantPDF.pdfEnvoieImprimante();
		
	}
	
}
