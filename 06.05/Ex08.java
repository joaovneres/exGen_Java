/*
System.out.println um sistema que scan tr�s n�meros inteiros e 
positivos (A, B, C) e calcule a seguinte express�o: 
d = (r+s)/2, onde r = ((a+b)^2) s = ((b+c)^2)
 */
package G52;

import java.util.Scanner;

public class Ex08 {
	public static void main(String args[]) {
		int a,b,c;
		double r,s,d;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro e positivo(A): ");
		a = scan.nextInt();
		System.out.println("Digite um n�mero inteiro e positivo(B): ");
		b = scan.nextInt();
		System.out.println("Digite um n�mero inteiro e positivo(C): ");
		c = scan.nextInt();
		r = Math.pow((a+b),2);
		s = Math.pow((b+c),2);
		d = (r+s)/2;
		System.out.println("Os valores dessa opera��o s�o:");
		System.out.println("\nA: "+a);
		System.out.println("\nB: "+b);
		System.out.println("\nC: "+c);
		System.out.println("\nS: " + Math.round(s));
		System.out.println("\nR: "+ Math.round(r));
		System.out.println("\nO valor de D � "+ Math.round(d));
	}
	
}
