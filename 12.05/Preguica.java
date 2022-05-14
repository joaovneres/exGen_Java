package Animais;

public class Preguica extends Animal {
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	public Preguica() {
		super();
	}

	public String emitirSom() {
		return "AAAAAAAAAAAAAAAA";
	}
	public String subirArvore() {
		return "Preguiça começou subir na árvore.";
	}

	public String descerArvore() {
		return "Preguiça começou descer da árvore.";
	}
}
