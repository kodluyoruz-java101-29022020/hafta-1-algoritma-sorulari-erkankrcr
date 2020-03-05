package util;

import java.util.Random;

//Singleton pattern i�in

public class Rastgele {
	private static Random random;
	public static Random getInstance() {
		if(random == null) {
			random = new Random();
		}
		return random;
	}
}
