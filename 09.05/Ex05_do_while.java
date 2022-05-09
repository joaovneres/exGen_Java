/*
Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 */
package LacoRepeticao;

import java.util.Scanner;

public class Ex05_do_while {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num, somaNum = 0;
		do {
			System.out.println("Digite um número: ");
			num = scan.nextDouble();
			somaNum += num;
		} while (num != 0);
		System.out.println("A soma dos números digitados é: "+somaNum);
	}
}
