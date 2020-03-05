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
			Printer.print("Ýþlemi seçiniz ?",true);
			Printer.print("Toplama iþlemi için +'ya,",true);
			Printer.print("Çýkarma iþlemi için -'ye,",true);
			Printer.print("Çarpma iþlemi için *'a,",true);
			Printer.print("Bölme iþlemi için /'ya",true);
			Printer.print("Çýkýþ yapmak için e'ye",true);
			Printer.print("basýnýz :",false);
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
					Printer.print("Hatalý karakter giriþi yaptýnýz",true);
					return true;
			}		
		}catch(InputMismatchException e){
			Printer.print("Ýþleminiz Tamsayý girmediðinizden dolayý iptal edilmiþtir.",true);
			return true;
		}catch(NoSuchElementException e) {
			Printer.print("Ýþleminiz sayý girmediðinizden dolayý iptal edilmiþtir.",true);
			return true;
		}catch(ArithmeticException e) {
			Printer.print("Ýþlem sonucunuz tanýmsýzdýr.",true);
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
		Printer.print("1.Sayýyý giriniz : ",false);
		long numberOne = scanner.nextLong();
		Printer.print("2.Sayýyý giriniz : ",false);
		long numberTwo = scanner.nextLong();
		return new long[] {numberOne,numberTwo};
	}
}
