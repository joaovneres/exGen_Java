/*
Fa�a um sistema que leia a idade de uma pessoa expressa 
em anos, meses e dias e mostre-a expressa apenas em dias. 
 */
package G52;

import java.util.Scanner;

public class Ex05 {
	public static void main(String args[]) {
		int ano, mes, dia;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quantos anos voc� tem?");
		ano = scan.nextInt();
		System.out.println("Digite quantos meses se passaram desde o seu �ltimo anivers�rio: ");
		mes = scan.nextInt();
		System.out.println("Digite quantos dias se passaram desde o �ltimo m�s que se passou do \nseu anivers�rio (Ex: meu aniversario � dia 30 e hoje � dia 10, se passaram 11 dias): ");
		dia = scan.nextInt();
		dia = (ano*365) + (mes*30) + dia;
		System.out.println("Voc� possui "+dia+" dias.");
	}

}
