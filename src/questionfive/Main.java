package questionfive;

import java.util.Random;

import util.*;

public class Main {

	public static void main(String[] args) {
		findSingleAndDouble(Array.fillArr());

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
}
