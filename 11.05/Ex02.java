/*
Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
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
