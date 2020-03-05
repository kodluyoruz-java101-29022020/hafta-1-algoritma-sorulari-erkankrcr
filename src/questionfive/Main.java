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
				Printer.print(i+" Sayýsý çift bir sayýdýr.",true);
			}else {
				Printer.print(i+" Sayýsý tek bir sayýdýr.",true);
			}
		}
	}

	private static int[] fillArr() {
		int[] arr = new int[100];
		Random random = Rastgele.getInstance();
		for(int i = 0; i<arr.length;i++) {
			arr[i] = random.nextInt();
			//Burada dilersek programýn verdiði random sayý aralýðýný azaltarak sayý aralýðýnýn daha düþük bir rakam gelmesini saðlayabiliriz
			//arr[i] = random.nextInt(1000); gibi
		}
		return arr;
	}

}
