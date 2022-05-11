/*
 Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

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
			System.out.println("Digite um número inteiro: \n");
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
		System.out.println("Números pares: "+matrizPar+".\n");
		System.out.println("A soma dos números pares é: " + somaPar + ".\n");
		System.out.println("Números Ímpares: "+matrizImpar+".\n");
		System.out.println("Foram digitados " + contImpar + " números ímpares.");
	}
}
