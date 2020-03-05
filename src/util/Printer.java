package util;

import questionsix.IDocument;

public class Printer {
	//Android uygulama geli�tirmesi yaparken s�rekli kulland���m log yada kullan�c�ya mesaj g�sterme al��kanl���m olan metod
	public static void print(String print, boolean newLine) {
		if(newLine) {
			System.out.println(print);
		}else {
			System.out.print(print);
		}
	}
	
	/*
	 * Burada print metodunu static yapmam�z�n sebebi s�rekli birden fazla ve farkl� konumlarda kullan�ca��m�z bir metoda
	 * ilgili oldu�u objeyi olu�turmadan istedi�imiz yerde istedi�imiz gibi �al��t�rabilmemiz i�in ekledi�imiz bir �zelliktir.
	 * 
	 * Ayn� zamanda bu metodu static yaparak ilgili objenin referans�n� yapmaktan kurtularak bellek y�netimine de katk� sa�lam�� oldum.
	 * 
	 *
	 */
	
	public static void print(IDocument document) {
		System.out.println("Printer Yazd�r�yor : "+document.getBody());
	}
}
