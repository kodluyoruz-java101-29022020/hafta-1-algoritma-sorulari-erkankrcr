package questiontwo;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import util.Keyboard;
import util.Printer;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = Keyboard.getInstance();
		while(input(scanner));
		

	}

	private static boolean input(Scanner scanner) {
		try {
			Printer.print("/*************/",true);
			Printer.print("��lemi se�iniz ?",true);
			Printer.print("Toplama i�lemi i�in +'ya,",true);
			Printer.print("��karma i�lemi i�in -'ye,",true);
			Printer.print("�arpma i�lemi i�in *'a,",true);
			Printer.print("B�lme i�lemi i�in /'ya",true);
			Printer.print("��k�� yapmak i�in e'ye",true);
			Printer.print("bas�n�z :",false);
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
					Printer.print("Hatal� karakter giri�i yapt�n�z",true);
					return true;
			}		
		}catch(InputMismatchException e){
			Printer.print("��leminiz Tamsay� girmedi�inizden dolay� iptal edilmi�tir.",true);
			return true;
		}catch(NoSuchElementException e) {
			Printer.print("��leminiz say� girmedi�inizden dolay� iptal edilmi�tir.",true);
			return true;
		}catch(ArithmeticException e) {
			Printer.print("��lem sonucunuz tan�ms�zd�r.",true);
			return true;
		}catch(Exception e) {
			Printer.print("Bilinmeyen bir hata",true);
			return true;
		}
	}
	
	
	private static void bolme(Scanner scanner) throws InputMismatchException , NoSuchElementException , ArithmeticException , Exception {
		long[] arr = getInput(scanner);
		Printer.print(arr[0]+" / "+arr[1]+" = "+(arr[0]/arr[1]),true);
	}

	private static void carpma(Scanner scanner) throws InputMismatchException , NoSuchElementException , Exception {
		long[] arr = getInput(scanner);
		Printer.print(arr[0]+" * "+arr[1]+" = "+(arr[0]*arr[1]),true);
	}

	private static void cikarma(Scanner scanner)  throws InputMismatchException , NoSuchElementException , Exception{
		long[] arr = getInput(scanner);
		Printer.print(arr[0]+" - "+arr[1]+" = "+(arr[0]-arr[1]),true);
	}

	private static void toplama(Scanner scanner) throws InputMismatchException , NoSuchElementException , Exception {
		long[] arr = getInput(scanner);
		Printer.print(arr[0]+" + "+arr[1]+" = "+(arr[0]+arr[1]),true);
	}
	
	private static long[] getInput(Scanner scanner) {
		Printer.print("1.Say�y� giriniz : ",false);
		long numberOne = scanner.nextLong();
		Printer.print("2.Say�y� giriniz : ",false);
		long numberTwo = scanner.nextLong();
		return new long[] {numberOne,numberTwo};
	}
}
