package questionthree;

import java.util.Random;
import util.Printer;
import util.Rastgele;

public class Main {

	public static void main(String[] args) {
		int[] randomArr = fillArr();
		Printer.print("Rastgele oluþturulan Dizinin ortamalasý = "+findAvgArr(randomArr),true);

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
		Random random = Rastgele.getInstance();
		for(int i = 0 ; i<arr.length;i++) {
			arr[i] = random.nextInt();
			//Burada dilersek programýn verdiði random sayý aralýðýný azaltarak ortalamanýn daha düþük bir rakam gelmesini saðlayabiliriz
			//arr[i] = random.nextInt(1000); gibi
		}
		return arr;
	}
}
