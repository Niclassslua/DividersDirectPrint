package uebung02;

import static pr.MakeItSimple.print;
import static pr.MakeItSimple.println;
import static pr.MakeItSimple.readInt;

public class DividersDirectPrint {
	public static void main(String[] args) {
		println("Bitte geben Sie eine ganze Zahl > 0 ein: ");
		int number = readInt();
		if (number < 0) {
			println("Eingabe ungueltig!");
		} else {
			int counter = number;
			while (counter > 0) {
				if (number % counter == 0) {
					print(counter);
					if (counter != 1) {
						print(", ");
					}
				}
				counter--;
			}
		}
	}
}
