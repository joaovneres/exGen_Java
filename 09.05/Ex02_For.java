/*
Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
package LacoRepeticao;

import java.util.Scanner;

public class Ex02_For {
	public static void main(String[] args) {
		int numPar = 0, numImpar = 0, num;
		Scanner scan = new Scanner(System.in);
		for (int x = 0; x < 10; x++) {
			System.out.println("Digite um número inteiro: ");
			num = scan.nextInt();
			if (num % 2 == 0) {
				numPar++;
			} else {
				numImpar++;
			}
		}
		System.out.println("Você digitou "+numPar+" números pares e "+numImpar+" ímpares.");
	}
}
