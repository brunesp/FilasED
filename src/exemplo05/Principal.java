package exemplo05;

public class Principal {

	public static void main(String[] args) {

		Fila fila = new Fila();
		try {
			fila.enfilera("Matheus");
			fila.enfilera("Marcos");
			fila.enfilera("Lucas");
			fila.enfilera("João");
			fila.enfilera("Paulo");
			fila.enfilera("Felipe");
			fila.enfilera("Timóteo");

			fila.imprime();

			System.out.println("Desenfileirou: " + fila.desenfileira());

			fila.imprime();

			fila.enfilera("James");
			fila.enfilera("Tito");

			System.out.println("Desenfileirou: " + fila.desenfileira());
			System.out.println("Desenfileirou: " + fila.desenfileira());
			System.out.println("Desenfileirou: " + fila.desenfileira());
			System.out.println("Desenfileirou: " + fila.desenfileira());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		fila.imprime();
	}

}
