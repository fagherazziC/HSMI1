// import utility you need. use * if you want to load all
import java.util.*;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte Länge in Inch eingeben:");
		
		//wait for input (length)
		double length = sc.nextDouble();
		
		//calculate length from Inch to cm
		System.out.println("\n enstpricht:" + length*2.5 + " cm");
		
	}

}
