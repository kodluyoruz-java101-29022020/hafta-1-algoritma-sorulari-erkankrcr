package util;

import questionsix.IDocument;

public class Printer {
	//Android uygulama geliştirmesi yaparken sürekli kullandığım log yada kullanıcıya mesaj gösterme alışkanlığıma benzer olan metod
	public static void print(String print, boolean newLine) {
		if(newLine) {
			System.out.println(print);
		}else {
			System.out.print(print);
		}
	}
	
	/*
	 * Burada print metodunu static yapmamızın sebebi sürekli birden fazla ve farklı konumlarda kullanıcağımız bir metoda
	 * ilgili olduğu objeyi oluşturmadan istediğimiz yerde istediğimiz gibi çalıştırabilmemiz için eklediğimiz bir özelliktir.
	 * 
	 * Aynı zamanda bu metodu static yaparak ilgili objenin referansını yapmaktan kurtularak bellek yönetimine de katkı sağlamış oldum.
	 * 
	 *
	 */
	
	public static void print(IDocument document) {
		System.out.println("Printer Yazdırıyor : "+document.getBody());
	}
}
