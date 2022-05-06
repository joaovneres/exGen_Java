/*
3-	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
•	10-14 infantil
•	15-17 juvenil
•	18-25 adulto

 */
package G52;

import java.util.Scanner;

public class Ex03 {
public static void main(String args[]) {
	int idade;
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite a sua idade em anos: ");
	idade = scan.nextInt();
	if(idade<10) {
		System.out.println("Criança muito jovem, não se enquadra em nenhuma categoria.");
	}else if(idade<=14) {
		System.out.println("Categoria infantil. 10-14 anos");
	}else if(idade<=17) {
		System.out.println("Categoria juvenil. 15-17 anos");
	}else if(idade<=25) {
		System.out.println("Categoria adulto. 18-25 anos");
	}else {
		System.out.println("Sua idade é muito alta para se enquandrar em alguma categoria.");
	}
	
}
}
