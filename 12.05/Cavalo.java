package Animais;

public class Cavalo extends Animal {
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	public Cavalo() {
		super();
	}

	public String cGalopar() {
		return "Cavalo começou galopar.";
	}

	public String pGalopar() {
		return "Cavalo parou de galopar.";
	}
}
