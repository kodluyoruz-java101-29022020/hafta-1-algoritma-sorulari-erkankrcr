package questiontwo;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(input(scanner));
		

	}

	private static boolean input(Scanner scanner) {
		try {
			printer("/*************/",true);
			printer("��lemi se�iniz ?",true);
			printer("Toplama i�lemi i�in +'ya,",true);
			printer("��karma i�lemi i�in -'ye,",true);
			printer("�arpma i�lemi i�in *'a,",true);
			printer("B�lme i�lemi i�in /'ya",true);
			printer("��k�� yapmak i�in e'ye",true);
			printer("bas�n�z :",false);
			switch(scanner.next()){
				case "+":
					toplama(scanner);
					return true;
				case "-":
					cikarma(scanner);
					return true;
				case "*":
					carpma(scanner);
					return true;
				case "/":
					bolme(scanner);
					return true;
				case "e":
					return false;
				default:
					printer("Hatal� karakter giri�i yapt�n�z",true);
					return true;
			}		
		}catch(InputMismatchException e){
			printer("��leminiz Tamsay� girmedi�inizden dolay� iptal edilmi�tir.",true);
			return true;
		}catch(NoSuchElementException e) {
			printer("��leminiz say� girmedi�inizden dolay� iptal edilmi�tir.",true);
			return true;
		}catch(ArithmeticException e) {
			printer("��lem sonucunuz tan�ms�zd�r.",true);
			return true;
		}
	}
	
	private static void bolme(Scanner scanner) throws InputMismatchException , NoSuchElementException , ArithmeticException {
		printer("1.Say�y� giriniz : ",false);
		long numberOne = scanner.nextLong();
		printer("2.Say�y� giriniz : ",false);
		long numberTwo = scanner.nextLong();
		printer(numberOne+" / "+numberTwo+" = "+(numberOne/numberTwo),true);
	}

	private static void carpma(Scanner scanner) throws InputMismatchException , NoSuchElementException {
		printer("1.Say�y� giriniz : ",false);
		long numberOne = scanner.nextLong();
		printer("2.Say�y� giriniz : ",false);
		long numberTwo = scanner.nextLong();
		printer(numberOne+" * "+numberTwo+" = "+(numberOne*numberTwo),true);
	}

	private static void cikarma(Scanner scanner)  throws InputMismatchException , NoSuchElementException{
		printer("1.Say�y� giriniz : ",false);
		long numberOne = scanner.nextLong();
		printer("2.Say�y� giriniz : ",false);
		long numberTwo = scanner.nextLong();
		printer(numberOne+" - "+numberTwo+" = "+(numberOne-numberTwo),true);
	}

	private static void toplama(Scanner scanner) throws InputMismatchException , NoSuchElementException {
		printer("1.Say�y� giriniz : ",false);
		long numberOne = scanner.nextLong();
		printer("2.Say�y� giriniz : ",false);
		long numberTwo = scanner.nextLong();
		printer(numberOne+" + "+numberTwo+" = "+(numberOne+numberTwo),true);
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
