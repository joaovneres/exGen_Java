/*
Faça um sistema que leia a idade de uma pessoa expressa
em dias e mostre-a expressa em anos, meses e dias. 
 */
package G52;

import java.util.Scanner;

public class Ex06 {
	public static void main(String args[]) {
		int dias, meses, ano;
		Scanner scan = new Scanner(System.in);
		System.out.println("Sistema para ler idade em dias e converter para anos, meses e dias.");
		System.out.println("\nDigite a sua idade em dias: ");
		dias = scan.nextInt();
		ano = (dias / 365);
		dias = (dias % 365);
		meses = (dias / 30);
		dias = (dias % 30);
		System.out.println("Você tem:");
		System.out.println("\nAno(s): " + ano);
		System.out.println("\nMês(es): " + meses);
		System.out.println("\nDia(s): " + dias);
	}

}
