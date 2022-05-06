/*
4-	Faça um programa em que permita a entrada de um número qualquer e
	exiba se este número é par ou ímpar. Se for par exiba também a raiz 
	quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */
package G52;

import java.util.Scanner;

public class Ex04 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int numero;
		double res;
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		if(numero%2==0) {
			res = Math.sqrt(numero);
			System.out.printf("Este número é par e sua raíz é: %.2f", res);
		}else {
			res = Math.pow(numero, 2);
			System.out.printf("Este número é ímpar e seu quadrado é: %.0f", res);
		}
			
	}

}
