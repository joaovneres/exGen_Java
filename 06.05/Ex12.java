/*
O custo ao consumidor de um carro novo é a soma do custo de 
fábrica com a percentagem do distribuidor e dos impostos 
(aplicados ao custo de fábrica). Supondo que a percentagem do 
distribuidor seja de 28% e os impostos de 45%, 
 */
package G52;

import java.util.Scanner;

public class Ex12 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double custo, valortotal;
		System.out.println("Calcular o custo do consumidor.");
		System.out.println("\nDigite o valor de custo de fábrica: ");
		custo = scan.nextDouble();
		valortotal = (1.73*custo);
		System.out.printf("O valor de custo do consumidor é: %.2f", valortotal);
	}
}
