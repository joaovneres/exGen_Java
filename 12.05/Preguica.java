package Animais;

public class Preguica extends Animal {
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	public Preguica() {
		super();
	}

	public String subirArvore() {
		return "Pregui�a come�ou subir na �rvore.";
	}

	public String descerArvore() {
		return "Pregui�a come�ou descer da �rvore.";
	}
}
