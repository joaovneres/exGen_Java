/*
4-	Fa�a um programa em que permita a entrada de um n�mero qualquer e
	exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz 
	quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */
package G52;

import java.util.Scanner;

public class Ex04 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int numero;
		double res;
		System.out.println("Digite um n�mero: ");
		numero = scan.nextInt();
		if(numero%2==0) {
			res = Math.sqrt(numero);
			System.out.printf("Este n�mero � par e sua ra�z �: %.2f", res);
		}else {
			res = Math.pow(numero, 2);
			System.out.printf("Este n�mero � �mpar e seu quadrado �: %.0f", res);
		}
			
	}

}
