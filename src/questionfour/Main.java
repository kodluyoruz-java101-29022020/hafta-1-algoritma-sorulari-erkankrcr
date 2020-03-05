package questionfour;

import java.util.InputMismatchException;
import java.util.Scanner;

import util.Keyboard;
import util.Printer;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = Keyboard.getInstance();
		while(floorSize(scanner));

	}

	private static boolean floorSize(Scanner scanner) {
		Printer.print("Kaç katlý yýldýz istersiniz ?",true);
		Printer.print("Çýkmak için 0'a basýn : ",false);
		
		try {
			int input = scanner.nextInt();
			
			if(input == 0) {
				return false;
			}else if(input < 0.0) {
				Printer.print("Negatif tamsayýlar geçersizdir",true);
				return true;
			}else {
				verticalStar(input);	
			}
			
		}catch(InputMismatchException e) {
			Printer.print("Tamsayý giriþi yapmadýðýnýz için iþlem iptal edilmiþtir.",true);
			return false;
		}
		return true;
	}

	private static void verticalStar(int floor) {
		if(floor == 1) {
			Printer.print("*",true);
		}else {
			for(int i = 1 ; i<=floor; i++) {
				horizontalStar(i);
				Printer.print("",true);
			}
		}
	}

	private static void horizontalStar(int i) {
		for(int j = 0; j<i ;j++) {
			Printer.print("*",false);
		}
	}
}
