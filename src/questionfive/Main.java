package questionfive;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		findSingleAndDouble(fillArr());

	}
	
	private static void findSingleAndDouble(int[] fillArr) {
		for(int i : fillArr) {
			if(i%2 == 0) {
				printer(i+" Sayýsý çift bir sayýdýr.",true);
			}else {
				printer(i+" Sayýsý tek bir sayýdýr.",true);
			}
		}
	}

	private static int[] fillArr() {
		int[] arr = new int[100];
		Random random = new Random();
		for(int i = 0; i<arr.length;i++) {
			arr[i] = random.nextInt();
			//Burada dilersek programýn verdiði random sayý aralýðýný azaltarak ortalamanýn daha düþük bir rakam gelmesini saðlayabiliriz
			//arr[i] = random.nextInt(1000); gibi
		}
		return arr;
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
