//Scanner Klasse

import java.util.*;

public class testprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Temperatur in Kelvin");
		float kelvin = sc.nextFloat();

		float celsius = kelvin - 273;

		System.out.println("Die Temperatur in Celsius beträgt:" + celsius);

		if (celsius < -10) {
			System.out.println("uh ist das kalt");
		}
// Input functions for different datatypes

	}

}
