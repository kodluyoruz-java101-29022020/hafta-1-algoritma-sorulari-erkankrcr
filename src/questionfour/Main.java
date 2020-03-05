package questionfour;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(floorSize(scanner));

	}

	private static boolean floorSize(Scanner scanner) {
		printer("Kaç katlý yýldýz istersiniz ?",true);
		printer("Çýkmak için 0'a basýn : ",false);
		
		try {
			int input = scanner.nextInt();
			
			if(input == 0) {
				return false;
			}else if(input < 0.0) {
				printer("Negatif tamsayýlar geçersizdir",true);
				return true;
			}else {
				verticalStar(input);	
			}
			
		}catch(InputMismatchException e) {
			printer("Tamsayý giriþi yapmadýðýnýz için iþlem iptal edilmiþtir.",true);
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
	
	//Android uygulama geliþtirmesi yaparken sürekli kullandýðým log yada kullanýcýya mesaj gösterme alýþkanlýðým olan metod
	private static void printer(String print, boolean newLine) {
		if(newLine) {
			System.out.println(print);
		}else {
			System.out.print(print);
		}
	}

}
