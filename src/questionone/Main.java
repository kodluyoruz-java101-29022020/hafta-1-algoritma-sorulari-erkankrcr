package questionone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String password = "kodluyoruz";
	
		Scanner scanner = new Scanner(System.in);
		
		while(auth(scanner,password)); 
	}

	private static boolean auth(Scanner scanner, String password) {
		printer("Þifreyi Giriniz :",false);
		if(password.equals(scanner.next())) {
			printer("Giriþ baþarýlý!!",true);
			return false;
		}else {
			printer("Giriþ baþarýsýz tekrardan deneyiniz!!",true);
			return true;
		}
	}
	
	//Android uygulama geliþtirmesi yaparken sürekli kullandýðým log yada kullanýcýya mesaj gösterme alýþkanlýðým olan metod
	private static void printer(String print, boolean newLine) {
		if(newLine) {
			System.out.println(print);
		}else {
			System.out.print(print);
		}
	}
}
