package util;

import java.util.Random;

public class Array {
	public static int[] fillArr() {
		int[] arr = new int[100];
		Random random = Rastgele.getInstance();
		for(int i = 0; i<arr.length;i++) {
			arr[i] = random.nextInt(1000);
			//Burada dilersek program�n verdi�i random say� aral���n� azaltarak say� aral���n�n daha d���k bir rakam gelmesini sa�layabiliriz
			//arr[i] = random.nextInt(10); gibi
		}
		return arr;
	}

}
