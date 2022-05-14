/*
1-	Crie uma hierarquia de classes conforme abaixo com os seguintes 
atributos e comportamentos (observe a tabela), utilize os seus 
conhecimentos e distribua as características de forma que tudo o que 
for comum a todos os animais fique na classe Animal: 
 */
package Animais;

import java.util.Scanner;

public abstract class Animal {
	private String nome;
	private int idade;
	private String som;

	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Animal() {
		this.nome = null;
		this.idade = 0;
		this.som = null;
	}

	abstract public String emitirSom();

	public void criar(Animal objeto) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		objeto.setNome(scan.next());
		System.out.println("Digite a idade: ");
		objeto.setIdade(scan.nextInt());
	}
	
	public void imprimirInfo(Animal objeto) {
		System.out.println("\nNome do animal: "+objeto.getNome()+"\nIdade do animal: "+objeto.getIdade());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;

	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

}
