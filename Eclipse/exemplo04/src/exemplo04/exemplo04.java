package exemplo04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exemplo04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
				System.out.println("Digite outro valor:");
		int vl01 = sc.nextInt();
		System.out.println("Digite outro valor:");
		int vl02 = sc.nextInt();
		//Calculando
		try {
		int vl03 = vl01 / vl02;
		System.out.println("Resultado :" + vl03);
	} catch (ArithmeticException e) {
		System.out.println(" Ocorreu uma" + "divisão por zero!");
		
	} catch(InputMismatchException e ) {
		System.out.println ("Digitar somente " + " numeros inteiros!");
	}
		sc.close();
		
	}

}
