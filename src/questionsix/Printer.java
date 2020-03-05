package questionsix;

public class Printer {
	
	/*
	 * Burada print metodunu static yapmamýzýn sebebi sürekli birden fazla ve farklý konumlarda kullanýcaðýmýz bir metoda
	 * ilgili olduðu objeyi oluþturmadan istediðimiz yerde istediðimiz gibi çalýþtýrabilmemiz için eklediðimiz bir özelliktir.
	 * 
	 * Ayný zamanda bu metodu static yaparak ilgili objenin referansýný yapmaktan kurtularak bellek yönetimine de katký saðlamýþ oldum.
	 */
	
	public static void print(IDocument document) {
		System.out.println("Printer Yazdýrýyor : "+document.getBody());
	}

}
