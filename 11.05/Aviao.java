/*
Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package Classes;

public class Aviao {
	private String modeloAviao;
	private int anoAviao;
	private String companhiaAviao;
	private int velocidadeMaximaAviao;
	private int alturaMaximaAviao;
	private int totalAssentosNormais;
	private int totalAssentosEspeciais;
	private int assentosNormaisReservados;
	private int assentosEspeciaisReservados;

	public Aviao(String modeloAviao, int anoAviao, String companhiaAviao, int velocidadeMaximaAviao,
			int alturaMaximaAviao, int totalAssentosNormais, int totalAssentosEspeciais, int assentosNormaisReservados,
			int assentosEspeciaisReservados) {
		this.modeloAviao = modeloAviao;
		this.anoAviao = anoAviao;
		this.companhiaAviao = companhiaAviao;
		this.velocidadeMaximaAviao = velocidadeMaximaAviao;
		this.alturaMaximaAviao = alturaMaximaAviao;
		this.totalAssentosNormais = totalAssentosNormais;
		this.totalAssentosEspeciais = totalAssentosEspeciais;
		this.assentosNormaisReservados = assentosNormaisReservados;
		this.assentosEspeciaisReservados = assentosEspeciaisReservados;
	}

	public Aviao() {
		this.modeloAviao = null;
		this.anoAviao = 0;
		this.companhiaAviao = null;
		this.velocidadeMaximaAviao = 0;
		this.alturaMaximaAviao = 0;
		this.totalAssentosNormais = 0;
		this.totalAssentosEspeciais = 0;
		this.assentosNormaisReservados = 0;
		this.assentosEspeciaisReservados = 0;
	}

	public void imprimirInfoAviao() {
		System.out.println("Modelo:" + modeloAviao + "\nAno:" + anoAviao + "\nCompanhia:" + companhiaAviao
				+ "\nVelocidade Maxima: " + velocidadeMaximaAviao + "\nAltura Maxima: " + alturaMaximaAviao
				+ "\nTotal Assentos Normais:" + totalAssentosNormais + "\nTotal Assentos Especiais: "
				+ totalAssentosEspeciais + "\nAssentos Normais Reservados: " + assentosNormaisReservados
				+ "\nAssentos Especiais Reservados: " + assentosEspeciaisReservados);

	}

	public void reservarAssentos(int assentos) {
		this.assentosNormaisReservados += assentos;
	}

	public int calcularAssentosDisponiveis() {
		return totalAssentosNormais - assentosNormaisReservados + totalAssentosEspeciais - assentosEspeciaisReservados;
	}

	public void reservarAssentos(int assentosNormais, int assentosEspeciais) {
		this.assentosNormaisReservados += assentosNormais;
		this.assentosEspeciaisReservados += assentosEspeciais;
	}

	public String ligar() {
		return "Avião ligado";
	}

	public String desligar() {
		return "Avião desligado";
	}

	public String subir() {
		return "Avião subindo";
	}

	public String descer() {
		return "Avião descendo";
	}

	public String getModeloAviao() {
		return modeloAviao;
	}

	public void setModeloAviao(String modeloAviao) {
		this.modeloAviao = modeloAviao;
	}

	public int getAnoAviao() {
		return anoAviao;
	}

	public void setAnoAviao(int anoAviao) {
		this.anoAviao = anoAviao;
	}

	public String getCompanhiaAviao() {
		return companhiaAviao;
	}

	public void setCompanhiaAviao(String companhiaAviao) {
		this.companhiaAviao = companhiaAviao;
	}

	public int getVelocidadeMaximaAviao() {
		return velocidadeMaximaAviao;
	}

	public void setVelocidadeMaximaAviao(int velocidadeMaximaAviao) {
		this.velocidadeMaximaAviao = velocidadeMaximaAviao;
	}

	public int getAlturaMaximaAviao() {
		return alturaMaximaAviao;
	}

	public void setAlturaMaximaAviao(int alturaMaximaAviao) {
		this.alturaMaximaAviao = alturaMaximaAviao;
	}

	public int getTotalAssentosNormais() {
		return totalAssentosNormais;
	}

	public void setTotalAssentosNormais(int totalAssentosNormais) {
		this.totalAssentosNormais = totalAssentosNormais;
	}

	public int getTotalAssentosEspeciais() {
		return totalAssentosEspeciais;
	}

	public void setTotalAssentosEspeciais(int totalAssentosEspeciais) {
		this.totalAssentosEspeciais = totalAssentosEspeciais;
	}

	public int getAssentosNormaisReservados() {
		return assentosNormaisReservados;
	}

	public void setAssentosNormaisReservados(int assentosNormaisReservados) {
		this.assentosNormaisReservados = assentosNormaisReservados;
	}

	public int getAssentosEspeciaisReservados() {
		return assentosEspeciaisReservados;
	}

	public void setAssentosEspeciaisReservados(int assentosEspeciaisReservados) {
		this.assentosEspeciaisReservados = assentosEspeciaisReservados;
	}

}