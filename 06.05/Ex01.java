/*
Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
package G52;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = scan.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = scan.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("O número " + num1 + " é o maior dos três.");
		}else if(num2>num1 && num2>num3) {
			System.out.println("O número " + num2 + " é o maior dos três.");
		}else if(num3>num2 && num3>num1) {
			System.out.println("O número " + num3 + " é o maior dos três.");
		}else {
			System.out.println("Todos são iguais.");
		}

	}

}
