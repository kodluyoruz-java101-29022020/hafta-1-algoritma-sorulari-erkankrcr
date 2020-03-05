package util;

import java.util.*;

//Singleton pattern i�in

public class Keyboard {
	private static Scanner scanner;
	public static Scanner getInstance() {
		if(scanner == null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
	
}
