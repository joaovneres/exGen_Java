/*
Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */
package Classes;

public class Ex01 {
	public static void main(String[] args) {
		Cliente oCliente = new Cliente(1,"Jo�o Neres","30/07/2003",2500.50,"Masculino","S�o Paulo - Brasil");
		oCliente.imprimirInfoCliente();
	}
}
