package questionone;

import java.util.Scanner;

import util.Keyboard;
import util.Printer;

public class Main {

	public static void main(String[] args) {
		String password = "kodluyoruz";
	
		Scanner scanner = Keyboard.getInstance();
		
		while(auth(scanner,password)); 
	}

	//Burada þifreyi dýþarýdan almamýn sebebi sanki bu parola bir db den yada uzak sunucudan gelmesi durumunu göstermek
	private static boolean auth(Scanner scanner, String password) {
		Printer.print("Þifreyi Giriniz :",false);
		try {
			if(password.equals(scanner.next())) {
				Printer.print("Giriþ baþarýlý!!",true);
				return false;
			}else {
				Printer.print("Giriþ baþarýsýz tekrardan deneyiniz!!",true);
				return true;
			}	
		}catch(Exception e) {
			Printer.print("Bilinmeyen bir hata",true);
			return true;
		}
	}
}
