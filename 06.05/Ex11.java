/*
Um sistema de equações lineares do tipo: 
ax + by = c
dx + ey = f
, pode ser resolvido segundo mostrado abaixo : 
x = (((c*e)-(b*f))/((a*e)-(b*d)))
y = (((a*f)-(c*d))/((a*e)-(b*d)))
System.out.println um sistema que lê os coeficientes a,b,c,d,e e f 
e calcula e mostra os valores de x e y. 

 */
package G52;

import java.util.Scanner;

public class Ex11 {
	public static void main(String args[]) {
		double a,b,c,d,e,f,x,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nDigite os valores de A, B, C, D, E e F, para resolução da equação: ");
		System.out.println("\nA: ");
		a = scan.nextDouble();
		System.out.println("B: ");
		b = scan.nextDouble();
		System.out.println("C: ");
		c = scan.nextDouble();
		System.out.println("D: ");
		d = scan.nextDouble();
		System.out.println("E: ");
		e = scan.nextDouble();
		System.out.println("F: ");
		f = scan.nextDouble();
		x = (((c*e)-(b*f))/((a*e)-(b*d)));
		y = (((a*f)-(c*d))/((a*e)-(b*d)));
		System.out.println("Os valores são: ");
		System.out.printf("\nx = %.2f", x);
		System.out.printf("\ny = %.2f", y);
	}

}
