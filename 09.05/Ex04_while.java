/*
4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
 */
package LacoRepeticao;

import java.util.Scanner;

public class Ex04_while {
	public static void main(String[] args) {
		int idade, sexo, opcao, cont = 0, calma = 0, oCalma = 0, iCalma = 0, mNervosa = 0, iNervoso = 0, hAgressivo = 0;
		Scanner scan = new Scanner(System.in);
		while (cont < 150) {
			System.out.println("Qual a sua idade (anos): ");
			idade = scan.nextInt();
			System.out.println("Sexo:\n1- Masculino\n2- Feminino\n3- Outres\nQual o seu sexo (1-3)?");
			sexo = scan.nextInt();
			System.out.println("Temperamento:\n1- Calme\n2- Nervose\n3- Agressive\nQual o seu temperamento (1-3)?");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				calma++;
				if (sexo == 3) {
					oCalma++;
				}
				if (idade < 18) {
					iCalma++;
				}
				break;
			case 2:
				if (sexo == 2) {
					mNervosa++;
				}
				if (idade > 40) {
					iNervoso++;
				}
				break;
			case 3:
				if (sexo == 1) {
					hAgressivo++;
				}
			}
			cont++;
		}
		System.out.println("O número de pessoas calmas é: " + calma);
		System.out.println("O número de mulheres nervosas é: " + mNervosa);
		System.out.println("O número de homens agressivos é: " + hAgressivo);
		System.out.println("O número de outres calmes é: " + oCalma);
		System.out.println("O número de pessoas com mais de 40 anos e nervosas é: " + iNervoso);
		System.out.println("O número de pessoas com menos de 18 anos e calmas é: " + iCalma);
	}
}
