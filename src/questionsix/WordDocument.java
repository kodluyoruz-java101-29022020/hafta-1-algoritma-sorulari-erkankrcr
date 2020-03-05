package questionsix;

public class WordDocument implements IDocument {
	
	public String body = "";
	
	public WordDocument(String body) {
		this.body = body;
	}

	@Override
	public String getBody() {
		return this.body;
	}

}
