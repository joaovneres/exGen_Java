package Animais;

public class Cachorro extends Animal {
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	public Cachorro() {
		super();
	}

	public String cCorrer() {
		return "Cachorro come�ou correr.";
	}

	public String pCorrer() {
		return "Cachorro parou de correr.";
	}
}
