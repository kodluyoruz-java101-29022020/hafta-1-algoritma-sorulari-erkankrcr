package questionthree;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] randomArr = fillArr();
		System.out.println("Rastgele olu�turulan Dizinin ortamalas� = "+findAvgArr(randomArr));

	}

	private static int findAvgArr(int[] randomArr) {
		int avg = 0;
		for(int number : randomArr) {
			avg += number;
		}
		return avg/randomArr.length;
	}

	private static int[] fillArr() {
		int[] arr = new int[100];
		Random random = new Random();
		for(int i = 0 ; i<arr.length;i++) {
			arr[i] = random.nextInt();
			//Burada dilersek program�n verdi�i random say� aral���n� azaltarak ortalaman�n daha d���k bir rakam gelmesini sa�layabiliriz
			//arr[i] = random.nextInt(1000); gibi
		}
		return arr;
	}

}
