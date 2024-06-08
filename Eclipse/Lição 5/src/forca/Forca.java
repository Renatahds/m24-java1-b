package forca;

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
public void mostrarForca() {
	
	String linSup = erros == 0 ? "  " :
		erros == 1 ? " O ":
	    erros == 2 ? "\\O ":
	    	erros > 2 ? "\\O/": " " );
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

}
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
		return erros>=6;
	}
	
}

