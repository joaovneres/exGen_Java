/*
Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
package G52;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		num2 = scan.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		num3 = scan.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("O n�mero " + num1 + " � o maior dos tr�s.");
		}else if(num2>num1 && num2>num3) {
			System.out.println("O n�mero " + num2 + " � o maior dos tr�s.");
		}else if(num3>num2 && num3>num1) {
			System.out.println("O n�mero " + num3 + " � o maior dos tr�s.");
		}else {
			System.out.println("Todos s�o iguais.");
		}

	}

}
