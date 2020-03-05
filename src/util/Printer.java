package util;

import questionsix.IDocument;

public class Printer {
	//Android uygulama geliþtirmesi yaparken sürekli kullandýðým log yada kullanýcýya mesaj gösterme alýþkanlýðým olan metod
	public static void print(String print, boolean newLine) {
		if(newLine) {
			System.out.println(print);
		}else {
			System.out.print(print);
		}
	}
	
	/*
	 * Burada print metodunu static yapmamýzýn sebebi sürekli birden fazla ve farklý konumlarda kullanýcaðýmýz bir metoda
	 * ilgili olduðu objeyi oluþturmadan istediðimiz yerde istediðimiz gibi çalýþtýrabilmemiz için eklediðimiz bir özelliktir.
	 * 
	 * Ayný zamanda bu metodu static yaparak ilgili objenin referansýný yapmaktan kurtularak bellek yönetimine de katký saðlamýþ oldum.
	 * 
	 *
	 */
	
	public static void print(IDocument document) {
		System.out.println("Printer Yazdýrýyor : "+document.getBody());
	}
}
