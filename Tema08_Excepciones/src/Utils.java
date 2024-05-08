import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {

	public static double readDouble(Scanner sc) {
		double numero = 0;

		try{
			numero=sc.nextDouble();
			sc.nextLine();
		}catch(InputMismatchException e) {
			System.out.println("Debe introducir un tipo double.");
		}
		
		
		
		return numero;
	}
	
	public static int readInt(Scanner sc) {
		int numero = 0;

		try{
			numero=sc.nextInt();
			sc.nextLine();
		}catch(InputMismatchException e) {
			System.out.println("Debe introducir un tipo int.");
		}
		
		return numero;
	}

}
