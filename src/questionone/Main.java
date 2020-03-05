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

	//Burada �ifreyi d��ar�dan almam�n sebebi sanki bu parola bir db den yada uzak sunucudan gelmesi durumunu g�stermek
	private static boolean auth(Scanner scanner, String password) {
		Printer.print("�ifreyi Giriniz :",false);
		try {
			if(password.equals(scanner.next())) {
				Printer.print("Giri� ba�ar�l�!!",true);
				return false;
			}else {
				Printer.print("Giri� ba�ar�s�z tekrardan deneyiniz!!",true);
				return true;
			}	
		}catch(Exception e) {
			Printer.print("Bilinmeyen bir hata",true);
			return true;
		}
	}
}
