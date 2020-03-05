package questionsix;

public class PdfDocument implements IDocument {
	
	public String body = "";
	
	public PdfDocument(String body) {
		this.body = body;
	}

	@Override
	public String getBody() {
		return this.body;
	}

}
