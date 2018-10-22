/*************************************************************************

@brief Description: Currency Converter
Calculate Currency (Dollar>Euro and Euro>Dollar)

@return : Return if press no at the and of the calculation.

*************************************************************************/

//imports java utility
import java.util.*;

//Java class
public class currencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create new Scanner "sc"
		Scanner sc = new Scanner(System.in);

		// Start "Nein" loop
		do {
			// Start "Ja" loop
			do {

				// Wait for input (1 or 2) "Press Button to select 1 or 2"
				System.out.println("1 drücken für Euro > Dollar, 2 Drücken für Dollar > Euro");
				int i = sc.nextInt();

				// if and else Statement to branch the menu
				// First Branch
				if (i == 1) {

					// Euro to Dollar Converter
					// Text out put
					System.out.println("Bitte Euro(€) eingeben:");

					double currency = sc.nextDouble();

					// 1.Calculate the currency. (the exchange rate * the currency)
					System.out.println(currency * 1.34 + "$");

					// Second Branch
				} else if (i == 2) {

					// Dollar to Euro Converter
					// Text out put
					System.out.println("Bitte Dollar($) eingeben:");

					double currency = sc.nextDouble();

					// 2.Calculate the currency. (the exchange rate * the currency)
					System.out.println(currency * 0.66 + "€");

					// Wrong Button != 1,2
				} else {
					System.out.println("Keine gültige Eingabe");

				}
				System.out.println("Umwandlung wiederholen? J/N");

				// "sc.next" is the Scanner, toLowerCase for accepting lowercase and uppercase
				// letters (j,J).
				// "equal" compare the String with the input

			} while (sc.next().toLowerCase().equals("j"));
			// end "Ja" Loop

		} while (!sc.next().toLowerCase().equals("n"));
		// exit loop
		
		return;
	}
}
