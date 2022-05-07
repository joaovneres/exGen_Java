/*
Faça um sistema que leia as 3 notas de um aluno e calcule a 
média final deste aluno. Considerar que a média é ponderada e 
que o peso das notas é: 2,3 e 5, respectivamente.
*/ 
package G52;

import java.util.Scanner;

public class Ex09 {
	public static void main(String args[]) {
		double nota1, nota2, nota3, media;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = scan.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = scan.nextDouble();
		media = ((nota1*2)+(nota2*3)+(nota3*5))/10;
		System.out.printf("A média final foi: %.2f", media);
	}

}
