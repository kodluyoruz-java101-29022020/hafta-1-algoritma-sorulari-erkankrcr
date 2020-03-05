package util;

import java.util.Random;

public class Array {
	public static int[] fillArr() {
		int[] arr = new int[100];
		Random random = Rastgele.getInstance();
		for(int i = 0; i<arr.length;i++) {
			arr[i] = random.nextInt(1000);
			//Burada dilersek programýn verdiði random sayý aralýðýný azaltarak sayý aralýðýnýn daha düþük bir rakam gelmesini saðlayabiliriz
			//arr[i] = random.nextInt(10); gibi
		}
		return arr;
	}

}
