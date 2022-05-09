/*
Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */
package LacoRepeticao;

import java.util.Scanner;

public class Ex06_do_while {
	public static void main(String[] args) {
		int num, somaNum = 0;
		double cont = 0, media;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Digite um número inteiro: ");
			num = scan.nextInt();
			if (num % 3 == 0) {
				somaNum += num;
				cont++;
			}
		} while (num != 0);
		if (cont != 0) {
			cont--;
			media = somaNum / cont;
			System.out.println("A média dos números múltiplos de 3 é: " + media);
		} else {
			System.out.println("Não é possível dividir por 0.");
		}
	}
}
