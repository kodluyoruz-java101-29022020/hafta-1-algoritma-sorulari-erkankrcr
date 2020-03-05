package questionfive;

import java.util.Random;

import util.*;

public class Main {

	public static void main(String[] args) {
		findSingleAndDouble(fillArr());

	}
	
	private static void findSingleAndDouble(int[] fillArr) {
		for(int i : fillArr) {
			if(i%2 == 0) {
				Printer.print(i+" Say�s� �ift bir say�d�r.",true);
			}else {
				Printer.print(i+" Say�s� tek bir say�d�r.",true);
			}
		}
	}

	private static int[] fillArr() {
		int[] arr = new int[100];
		Random random = Rastgele.getInstance();
		for(int i = 0; i<arr.length;i++) {
			arr[i] = random.nextInt();
			//Burada dilersek program�n verdi�i random say� aral���n� azaltarak say� aral���n�n daha d���k bir rakam gelmesini sa�layabiliriz
			//arr[i] = random.nextInt(1000); gibi
		}
		return arr;
	}

}
