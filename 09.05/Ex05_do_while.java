/*
Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
 */
package LacoRepeticao;

import java.util.Scanner;

public class Ex05_do_while {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num, somaNum = 0;
		do {
			System.out.println("Digite um n�mero: ");
			num = scan.nextDouble();
			somaNum += num;
		} while (num != 0);
		System.out.println("A soma dos n�meros digitados �: "+somaNum);
	}
}
