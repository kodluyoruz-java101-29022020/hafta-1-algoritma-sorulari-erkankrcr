package questionone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String password = "kodluyoruz";
	
		Scanner scanner = new Scanner(System.in);
		
		while(auth(scanner,password)); 
	}

	private static boolean auth(Scanner scanner, String password) {
		printer("�ifreyi Giriniz :",false);
		if(password.equals(scanner.next())) {
			printer("Giri� ba�ar�l�!!",true);
			return false;
		}else {
			printer("Giri� ba�ar�s�z tekrardan deneyiniz!!",true);
			return true;
		}
	}
	
	//Android uygulama geli�tirmesi yaparken s�rekli kulland���m log yada kullan�c�ya mesaj g�sterme al��kanl���m olan metod
	private static void printer(String print, boolean newLine) {
		if(newLine) {
			System.out.println(print);
		}else {
			System.out.print(print);
		}
	}
}
