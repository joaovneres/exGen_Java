/*
Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */
package LacoRepeticao;

import java.util.Scanner;

public class Ex02_For {
	public static void main(String[] args) {
		int numPar = 0, numImpar = 0, num;
		Scanner scan = new Scanner(System.in);
		for (int x = 0; x < 10; x++) {
			System.out.println("Digite um n�mero inteiro: ");
			num = scan.nextInt();
			if (num % 2 == 0) {
				numPar++;
			} else {
				numImpar++;
			}
		}
		System.out.println("Voc� digitou "+numPar+" n�meros pares e "+numImpar+" �mpares.");
	}
}
