package DividersDirectPrint;

public class DividersDirectPrint {
	public static void main(String[] args) {
		
		System.out.println("Bitte geben Sie eine ganze Zahl > 0 ein: ");
		
		int number = readInt();
		
		if (number < 0) {
			System.out.println("Eingabe ungueltig!");
		} else {
			int counter = number;
			while (counter > 0) {
				if (number % counter == 0) {
					System.out.print(counter);
					if (counter != 1) {
						System.out.print(", ");
					}
				}
				counter--;
			}
		}
		
	}
}
