package questionsix;

public class Main {

	public static void main(String[] args) {
		
		//Güzel bir method injection örneði
		Printer.print(new WordDocument("Bu bir Word Dökümanýdýr."));
		Printer.print(new PdfDocument("Bu bir PDF Dökümanýdýr."));
	}

}
