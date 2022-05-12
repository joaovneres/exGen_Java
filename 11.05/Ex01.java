/*
Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package Classes;

public class Ex01 {
	public static void main(String[] args) {
		Cliente oCliente = new Cliente(1,"João Neres","30/07/2003",2500.50,"Masculino","São Paulo - Brasil");
		oCliente.imprimirInfoCliente();
	}
}
