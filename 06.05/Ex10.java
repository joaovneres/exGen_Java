/*
Construa um programa em c que, tendo como dados de entrada 
dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), System.out.println 
a distância entre eles. A fórmula que efetua tal cálculo é:
  d=raiz((x2-x1)^2+(y2-y1)^2)
 */
package G52;

import java.util.Scanner;

public class Ex10 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double x1, y1, x2, y2, d;
		System.out.println("Calcular distância entre dois pontos no plano.");
		System.out.println("\nPonto 01 P(x1, y1)");
		System.out.println("\nx1: ");
		x1 = scan.nextDouble();
		System.out.println("y1: ");
		y1 = scan.nextDouble();
		System.out.println("\nPonto 02 P(x2, y2)");
		System.out.println("\nx2: ");
		x2 = scan.nextDouble();
		System.out.println("y2: ");
		y2 = scan.nextDouble();
		d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.printf("A distância (d) entre esses dois pontos é: %.2f", d);
	}

}
