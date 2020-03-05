package questionfive;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		findSingleAndDouble(fillArr());

	}
	
	private static void findSingleAndDouble(int[] fillArr) {
		for(int i : fillArr) {
			if(i%2 == 0) {
				printer(i+" Say�s� �ift bir say�d�r.",true);
			}else {
				printer(i+" Say�s� tek bir say�d�r.",true);
			}
		}
	}

	private static int[] fillArr() {
		int[] arr = new int[100];
		Random random = new Random();
		for(int i = 0; i<arr.length;i++) {
			arr[i] = random.nextInt();
			//Burada dilersek program�n verdi�i random say� aral���n� azaltarak ortalaman�n daha d���k bir rakam gelmesini sa�layabiliriz
			//arr[i] = random.nextInt(1000); gibi
		}
		return arr;
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
