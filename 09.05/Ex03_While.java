/*
Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */
package LacoRepeticao;

import java.util.Scanner;

public class Ex03_While {
	public static void main(String[] args) {
		int menos = 0, mais = 0, num = 0;
		Scanner scan = new Scanner(System.in);
		while (num != -99) {
			System.out.println("Digite uma idade (anos): ");
			num = scan.nextInt();
			if (num < 21) {
				menos++;
			} else if (num > 50) {
				mais++;
			}
		}
		menos--;
		System.out.println(menos + " pesoas tem menos de 21 anos");
		System.out.println(mais + " pesoas tem mais de 50 anos");
	}
}
