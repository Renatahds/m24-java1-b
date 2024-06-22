package forca;
import java.util.Scanner;

public class Forca {
private String palavraSecreta;
private int erros;
private String visualizacao;
//constructor
public Forca() {
	

	palavraSecreta = "java";
	erros = 0;
	visualizacao ="";
	//Carregar os traços na visualização
	int i = 0;
	while (i<palavraSecreta.lengtn()) {
		visualizacao += "-";
		i++;
	}
}
private String sortearPalavra() {
	Scanner scA = new Scanner(Forca.class.getResourceAsStream("palavra.txt"));
	Random rnd = new Random ();
	int linSort = rnd.nextInt(180)+1;
	int lin = 0;
	String ret=" ";
	while (scA.hasNextLine()) {
		lin++;
		String linha = scA.nextLine();
		if (lin==linSort) {
			ret = linha;
			break; //forçando a saída do while
		
			
		}
	}
	
	scA.close();
	return ret;
}
public void mostrarForca() {
	
	String linSup = erros == 0 ? "  " :
		erros == 1 ? " O ":
	    erros == 2 ? "\\O ":
	    	erros > 2 ? "\\O/": " " ;
	    	String linBod = erros >=4 ? "|" : " ";
	    	String linInf = erros == 5 ? "/ " :
	    		erros >= 6 ? "/\\" : " ";
	    	System.out.println (" +-----+");
	    	System.out.println("    " + linSup);
	    	System.out.println ("     "+ linBod);
	    	System.out.println("   ");
	    	System.out.println (" +==========");
	    	System.out.println();
	    	System.out.println(visualizacao);
	    	
	    		
	
	
System.out.println (" +-----+");
System.out.println ("        ");

Forca fo = new Forca();
fo.mostrarForca();
String palavra="";
while (!fo.isTerminado()) {
	System.out.println("Digite uma letra:");
	palavra = sc.nextLine();
	if (fo.verificaLetra(palavra.charAt(0))) {
		System.out.println ("Letra não encontrada!");
	}
	fo.mostrarForca();
}
sc.close();
System.out.println("A palavra secreta era " + fo.mostrarPalavra());

public void mostraForca() {
	public boolean verificaLetra(char letra) {
		boolean ret = false 
				if (palavraSecreta.indexOf(letra)>-1) {
					int i = 0;
					String apoio ="";
					while (i<palavraSecreta.length()) {
						if (palavraSecreta.charAt (i)==letra) {
							apoio += ""+letra;
						}else {
							apoio += "" + visualizacao.charAt(i);
						}
						i ++;
					}
					visualizacao = apoio;
					ret = true;
				} else {
					erros++;
				}
		return ret;
		
					
							
				}
	public boolean isTerminado () {
		return erros>=6 || visualizacao.indexOf(('-') == -1;
	
		
	}
	public String mostrarPalavra() {
		return palavraSecreta;
		
	}
}

