/*
Faça um programa que entre com três números e coloque em ordem crescente.
 */
package G52;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = scan.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = scan.nextInt();
		if (num1 < num2 && num1 < num3) {
			if (num2 < num3) {
				System.out.println("A ordem crescente destes números é:\n" + num1 + "\n" + num2 + "\n" + num3 + "\n");
			} else {
				System.out.println("A ordem crescente destes números é:\n" + num1 + "\n" + num3 + "\n" + num2 + "\n");
			}
		} else if (num2 < num3 && num2 < num1) {
			if (num1 < num3) {
				System.out.println("A ordem crescente destes números é:\n" + num2 + "\n" + num1 + "\n" + num3 + "\n");
			} else {
				System.out.println("A ordem crescente destes números é:\n" + num2 + "\n" + num3 + "\n" + num1 + "\n");
			}
		} else if (num3 < num2 && num3 < num1) {
			if (num2 < num1) {
				System.out.println("A ordem crescente destes números é:\n" + num3 + "\n" + num2 + "\n" + num1 + "\n");
			} else {
				System.out.println("A ordem crescente destes números é:\n" + num3 + "\n" + num1 + "\n" + num2 + "\n");
			}
		}else {
			System.out.println("São todos iguais.");
		}
	}
}
