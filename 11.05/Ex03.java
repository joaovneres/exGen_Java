/*
Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
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
