/*
Fa�a um sistema que leia o tempo de dura��o de
um evento em uma f�brica expressa em segundos e
mostre-o expresso em horas, minutos e segundos. 
 */
package G52;

import java.util.Scanner;

public class Ex07 {
	public static void main(String args[]) {
		int hora, minuto, segundo;
		Scanner scan = new Scanner(System.in);
		System.out.println("Sistema para converter segundos em horas, minutos e segundos.");
		System.out.println("\nDigite quantos segundos durar� o evento: ");
		segundo = scan.nextInt();
		hora = (segundo/3600);
		segundo = (segundo%3600);
		minuto = (segundo/60);
		segundo = (segundo%60);
		System.out.println("O evento durar�: ");
		System.out.println("\nHora(s): "+ hora);
		System.out.println("\nMinuto(s): "+ minuto);
		System.out.println("\nSegundo(s): "+ segundo);
	}

}
