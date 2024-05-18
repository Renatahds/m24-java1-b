package br.com.senaisp.bauru.renata.licao01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		
		double galoes = 15;
		double litros = 0;
		double gal2lt = 3.785;
		//Solicitar a entrada via teclado pelo usuario
		System.out.println("Digite a quantidade de galões:");
		galoes = scn.nextDouble();
	
		//Fazendo as contas
		litros = galoes  * gal2lt;
        // Mostrar os resultado
		System.out.println(galoes + " galões equivale a  " + litros + "litros");
		scn.close();
	}

}
