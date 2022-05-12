/*
Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package Classes;

public class Cliente {
	private int idCliente;
	private String nomeCliente;
	private String dataNascimentoCliente;
	private double salarioCliente;
	private String sexoCliente;
	private String enderecoCliente;

	public Cliente(int idCliente, String nomeCliente, String dataNascimentoCliente, double salarioCliente, String sexoCliente, String enderecoCliente) {
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.dataNascimentoCliente = dataNascimentoCliente;
		this.salarioCliente = salarioCliente;
		this.sexoCliente = sexoCliente;
		this.enderecoCliente = enderecoCliente;
	}

	public Cliente() { //metodo construtor vazio
		this.idCliente = 0;
		this.nomeCliente = null;
		this.dataNascimentoCliente = null;
		this.salarioCliente = 0;
		this.sexoCliente = null;
		this.enderecoCliente = null;
	}

	public void imprimirInfoCliente() {
		System.out.println("Nome cliente: " + nomeCliente + "\nData de nascimento: " + dataNascimentoCliente
				+ "\nSalário: " + salarioCliente + "\n" + "Sexo: " + sexoCliente + "\nEndereço: " + enderecoCliente);
	}
	
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getDataNascimentoCliente() {
		return dataNascimentoCliente;
	}

	public void setDataNascimentoCliente(String dataNascimentoCliente) {
		this.dataNascimentoCliente = dataNascimentoCliente;
	}

	public double getSalarioCliente() {
		return salarioCliente;
	}

	public void setSalarioCliente(double salarioCliente) {
		this.salarioCliente = salarioCliente;
	}

	public String getSexoCliente() {
		return sexoCliente;
	}

	public void setSexoCliente(String sexoCliente) {
		this.sexoCliente = sexoCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

}
