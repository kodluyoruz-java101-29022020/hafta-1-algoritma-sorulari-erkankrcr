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
			printer("Ýþlemi seçiniz ?",true);
			printer("Toplama iþlemi için +'ya,",true);
			printer("Çýkarma iþlemi için -'ye,",true);
			printer("Çarpma iþlemi için *'a,",true);
			printer("Bölme iþlemi için /'ya",true);
			printer("Çýkýþ yapmak için e'ye",true);
			printer("basýnýz :",false);
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
					printer("Hatalý karakter giriþi yaptýnýz",true);
					return true;
			}		
		}catch(InputMismatchException e){
			printer("Ýþleminiz Tamsayý girmediðinizden dolayý iptal edilmiþtir.",true);
			return true;
		}catch(NoSuchElementException e) {
			printer("Ýþleminiz sayý girmediðinizden dolayý iptal edilmiþtir.",true);
			return true;
		}catch(ArithmeticException e) {
			printer("Ýþlem sonucunuz tanýmsýzdýr.",true);
			return true;
		}
	}
	
	private static void bolme(Scanner scanner) throws InputMismatchException , NoSuchElementException , ArithmeticException {
		printer("1.Sayýyý giriniz : ",false);
		long numberOne = scanner.nextLong();
		printer("2.Sayýyý giriniz : ",false);
		long numberTwo = scanner.nextLong();
		printer(numberOne+" / "+numberTwo+" = "+(numberOne/numberTwo),true);
	}

	private static void carpma(Scanner scanner) throws InputMismatchException , NoSuchElementException {
		printer("1.Sayýyý giriniz : ",false);
		long numberOne = scanner.nextLong();
		printer("2.Sayýyý giriniz : ",false);
		long numberTwo = scanner.nextLong();
		printer(numberOne+" * "+numberTwo+" = "+(numberOne*numberTwo),true);
	}

	private static void cikarma(Scanner scanner)  throws InputMismatchException , NoSuchElementException{
		printer("1.Sayýyý giriniz : ",false);
		long numberOne = scanner.nextLong();
		printer("2.Sayýyý giriniz : ",false);
		long numberTwo = scanner.nextLong();
		printer(numberOne+" - "+numberTwo+" = "+(numberOne-numberTwo),true);
	}

	private static void toplama(Scanner scanner) throws InputMismatchException , NoSuchElementException {
		printer("1.Sayýyý giriniz : ",false);
		long numberOne = scanner.nextLong();
		printer("2.Sayýyý giriniz : ",false);
		long numberTwo = scanner.nextLong();
		printer(numberOne+" + "+numberTwo+" = "+(numberOne+numberTwo),true);
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
