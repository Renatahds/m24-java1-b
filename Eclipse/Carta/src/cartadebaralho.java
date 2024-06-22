
public class cartadebaralho {
public static final NAIPES [] = {"♦","♠","♥","♣"};
public static final String [] = {
		"A","2","3","4","5",
		"6","7","8","9","10",
		"J","Q","K"
};

private String naipe;
private String numero;
//contructor 
public Carta (int np,int vl) {
	if (np<1 || np>4) {
		System.out.println("Naipe Invalido!");
		
	}
	if (vl<1 || vl>13) {
		System.out.println("Numero da carta invalida!");
		
	}
	naipe = NAIPES [np-1];
	numero = NUMERO [vl-1];
	
}
toString() {
	
	
}
public String to string ();
String txt = "______ \n"+
             "|##   |\n"+
		     "|  §  |\n"+
             "|   ##|\n";
             "|_____|\n";
             txt = txt.replaceFirst("##", numero);
             txt = txt.replace("§", naipe);
             txt = txt.replaceFirst("##",numero);
return txt;


}
