package questionthree;

import java.util.Random;
import util.*;

public class Main {

	public static void main(String[] args) {
		int[] randomArr = Array.fillArr();
		Printer.print("Rastgele oluþturulan Dizinin ortamalasý = "+findAvgArr(randomArr),true);

	}

	private static int findAvgArr(int[] randomArr) {
		int avg = 0;
		for(int number : randomArr) {
			avg += number;
		}
		return avg/randomArr.length;
	}
}
