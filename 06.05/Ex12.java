/*
O custo ao consumidor de um carro novo � a soma do custo de 
f�brica com a percentagem do distribuidor e dos impostos 
(aplicados ao custo de f�brica). Supondo que a percentagem do 
distribuidor seja de 28% e os impostos de 45%, 
 */
package G52;

import java.util.Scanner;

public class Ex12 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double custo, valortotal;
		System.out.println("Calcular o custo do consumidor.");
		System.out.println("\nDigite o valor de custo de f�brica: ");
		custo = scan.nextDouble();
		valortotal = (1.73*custo);
		System.out.printf("O valor de custo do consumidor �: %.2f", valortotal);
	}
}
