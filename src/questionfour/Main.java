package questionfour;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(floorSize(scanner));

	}

	private static boolean floorSize(Scanner scanner) {
		printer("Ka� katl� y�ld�z istersiniz ?",true);
		printer("��kmak i�in 0'a bas�n : ",false);
		
		try {
			int input = scanner.nextInt();
			
			if(input == 0) {
				return false;
			}else if(input < 0.0) {
				printer("Negatif tamsay�lar ge�ersizdir",true);
				return true;
			}else {
				verticalStar(input);	
			}
			
		}catch(InputMismatchException e) {
			printer("Tamsay� giri�i yapmad���n�z i�in i�lem iptal edilmi�tir.",true);
			return false;
		}
		return true;
	}

	private static void verticalStar(int floor) {
		if(floor == 1) {
			printer("*",true);
		}else {
			for(int i = 1 ; i<floor; i++) {
				horizontalStar(i);
				printer("",true);
			}
		}
	}

	private static void horizontalStar(int i) {
		for(int j = 0; j<i ;j++) {
			printer("*",false);
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
