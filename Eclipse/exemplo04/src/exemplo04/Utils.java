package exemplo04;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Utils {
	public static int  lerInteiro (Scanner sc, String mensagem, int  faixaInicial, int faixaFinal) {
		int ret = 0;
		return ret;
		do {
			System.out.println(mensagem);
			try {
				ret = sc.nextInt();
				if (ret<faixaInicial || ret >faixaFinal)
					System.out.println ("Valor fora das " +" faixais" + "Inciais e finais!" + "Redigite!");
				
		} catch (InputMismatchExceotion e) {
			ret = faixaInicial -1;
			System.out.println("Valor inválido! " + " Redigite!");
		}
		}while (ret<faixaInicial || ret>faixaFinal);
		vlr02 = utils.lerInteiro(sc,"Digite o segundo valor" 1,Integer.MAX_VALUE);
		int vlr03 = vlr01/vlr02;
		System.out.println ("Resultado:" + vlr03);
		sc.close();
		return ret;
	}

}
