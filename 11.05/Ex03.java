/*
Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.
 */
package Classes;

public class Ex03 {
	public static void main(String[] args) {
		ProdutoEletronico oProdutoEletronico = new ProdutoEletronico("Liquidificador","220V","Mondial",2021);
		oProdutoEletronico.imprimirProduto();
		oProdutoEletronico.ligar();
		oProdutoEletronico.desligar();
	}
}
