package questionsix;

public class Main {

	public static void main(String[] args) {
		
		//G�zel bir method injection �rne�i
		Printer.print(new WordDocument("Bu bir Word D�k�man�d�r."));
		Printer.print(new PdfDocument("Bu bir PDF D�k�man�d�r."));
	}

}
