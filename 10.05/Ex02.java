/*
 Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.

 */
package Vetor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int contPar=0, contImpar = 0, num, somaPar = 0;
		List<Integer> matrizPar = new ArrayList<>(); // criar vetor sem tamanho definido
		List<Integer> matrizImpar = new ArrayList<>();
		for (int cont = 0; cont < 6; cont++) {
			System.out.println("Digite um n�mero inteiro: \n");
			num = scan.nextInt();
			if (num % 2 == 0) {
				contPar++;
				matrizPar.add(num);
				somaPar += num;
			} else {
				contImpar++;
				matrizImpar.add(num);
			}
		}
		System.out.println("N�meros pares: "+matrizPar+".\n");
		System.out.println("A soma dos n�meros pares �: " + somaPar + ".\n");
		System.out.println("N�meros �mpares: "+matrizImpar+".\n");
		System.out.println("Foram digitados " + contImpar + " n�meros �mpares.");
	}
}
