/*
Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.
 */
package Classes;

public class ProdutoEletronico {
	private String nome;
	private String modelo;
	private String marca;
	private int ano;

	public ProdutoEletronico(String nome, String modelo, String marca, int ano) {
		this.nome = nome;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}

	public ProdutoEletronico() {
		this.nome = null;
		this.modelo = null;
		this.marca = null;
		this.ano = 0;
	}

	public void imprimirProduto() {
		System.out.println("Nome: " + nome + "\nModelo: " + modelo + "\nMarca: " + marca + "\nAno: " + ano);
	}

	public void ligar() {
		System.out.println("Produto ligado!");
	}

	public void desligar() {
		System.out.println("Produto desligado!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
