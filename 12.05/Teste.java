package Animais;

public class Teste {
	public static void main(String[] args) {
		Cachorro oCachorro = new Cachorro();
		Cavalo oCavalo = new Cavalo();
		Preguica oPreguica = new Preguica();
		System.out.println("Criar cachorro.");
		oCachorro.criar(oCachorro);
		System.out.println("Criar cavalo.");
		oCavalo.criar(oCavalo);
		System.out.println("Criar preguiça.");
		oPreguica.criar(oPreguica);
		System.out.println("\nImprimir cachorro.");
		oCachorro.imprimirInfo(oCachorro);
		System.out.println("\nImprimir cavalo.");
		oCavalo.imprimirInfo(oCavalo);
		System.out.println("\nImprimir preguiça.");
		oPreguica.imprimirInfo(oPreguica);
		System.out.println("\nSom do cachorro.\n"+oCachorro.emitirSom());
		System.out.println("\nSom do cavalo.\n"+oCavalo.emitirSom());
		System.out.println("\nSom do preguiça.\n"+oPreguica.emitirSom());
	}

}
