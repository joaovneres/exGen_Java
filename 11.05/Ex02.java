/*
Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */
package Classes;

public class Ex02 {
	public static void main(String[] args) {
		Aviao oAviao = new Aviao("Jato", 2020, "Tam", 1000, 1000, 30, 20, 0, 0);
		oAviao.imprimirInfoAviao();
		oAviao.reservarAssentos(5, 8);
		oAviao.imprimirInfoAviao();
		System.out.println(oAviao.ligar());
		System.out.println(oAviao.subir());
		System.out.println(oAviao.descer());
		System.out.println(oAviao.desligar());
	}
}
