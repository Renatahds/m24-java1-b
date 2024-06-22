package exemplo04;
import java.util.InputMismatchException;
import java.util.Scanner;
public class exemplo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
int vlr01,vlr02;
// GARANTINDO A ENTRADA DO PRIMEIRO VALOR 
do {
	System.out.println("Digite o " + "primeiro valor:");
	try {
		vlr01 = sc.nextInt();
	} catch (InputMismatchException e) {
		System.out.println ("Valor deve " + " ser inteiro!");
		sc.nextLine(); //captura do enter
		vlr01 = 0 ;
	}
}while(vlr01<=0);

	}

}
