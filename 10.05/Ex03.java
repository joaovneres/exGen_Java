/*
Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */
package Vetor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		double[][] matriz = new double[3][3];
		double numero;
		int cont = 0;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Digite um número: ");
				numero = scan.nextDouble();
				if (numero > 10) {
					cont++;
				}
			}
		}
		System.out.println("Foram escritos " + cont + " números maiores que 10.");
	}
}
