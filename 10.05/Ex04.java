/*
Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.

 */
package Vetor;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2];
		double[][] matriz3 = new double[2][2];
		double constante, num;
		int op = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Criando a primeira matriz: \n");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Entre com um valor: ");
				num = scan.nextDouble();
				matriz1[i][j] = num;
			}
		}
		System.out.println("Criando a segunda matriz: \n");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Entre com um valor: ");
				num = scan.nextDouble();
				matriz2[i][j] = num;
			}
		}
		do {
			System.out.println("\tMenu de opções:\n");
			System.out.println("(1) Somar as duas matrizes.\n");
			System.out.println("(2) Subtrair a primeira matriz da segunda.\n");
			System.out.println("(3) Adicionar uma constante as duas matrizes.\n");
			System.out.println("(4) Imprimir matrizes.\n");
			System.out.println("(5) Sair.\n");
			System.out.println("Digite uma opção:");
			op = scan.nextInt();
			switch (op) {
			case 1:
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 2; j++) {
						matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
					}
				}
				break;
			case 2:
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 2; j++) {
						matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
					}
				}

				break;
			case 3:
				System.out.println("Digite o valor da constante: ");
				constante = scan.nextDouble();
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 2; j++) {
						matriz1[i][j] += constante;
						matriz2[i][j] += constante;
					}
				}
				break;
			case 4:
				System.out.println("Matriz 1:");
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 1; j++) {
						System.out.println("[" + matriz1[i][j]+"\t"+matriz1[i][j++]+"]");
					}
				}
				System.out.println("\nMatriz 2:");
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 1; j++) {
						System.out.println("[" + matriz2[i][j]+"\t"+matriz2[i][j++]+"]");
					}
				}
				System.out.println("\nMatriz 3:");
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 1; j++) {
						System.out.println("[" + matriz3[i][j]+"\t"+matriz3[i][j++]+"]");
					}
				}
				break;
			default:
				if (op != 5) {
					System.out.println("Opção inválida.");
				}
			}
		} while (op != 5);
		System.out.println("Obrigado, até mais!");
	}
}
