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
		Printer.print("Ka� katl� y�ld�z istersiniz ?",true);
		Printer.print("��kmak i�in 0'a bas�n : ",false);
		
		try {
			int input = scanner.nextInt();
			
			if(input == 0) {
				return false;
			}else if(input < 0.0) {
				Printer.print("Negatif tamsay�lar ge�ersizdir",true);
				return true;
			}else {
				verticalStar(input);	
			}
			
		}catch(InputMismatchException e) {
			Printer.print("Tamsay� giri�i yapmad���n�z i�in i�lem iptal edilmi�tir.",true);
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
