package br.com.senaisp.bauru.renata.licao02;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn = new Scanner (System.in);
     String nome;
     
     //Mostrando a mensagem para o usuario
     
     System.out.println ("Digite seu nome completo:");
    
     nome = scn.nextLine() + " ";
     
     //vamos separa nome de sobrenome 
     String primNome = nome.substring(nome.indexOf(" "));
     // Pegar ultimo sobrenome
     String lastName = nome.substring (nome.lastIndexOf(" "));
     
     //Mostrando o nome 
     System.out.println(primNome);
     System.out.println(lastName);
     //Fechando Scanner
     scn.close();

		
	}

}
