package exemplo01;

import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo1 {
	public static void main(String[] args) {
		Queue <String> fila_de_espera = new LinkedList<>();
		
		fila_de_espera.add("Matheus");
		fila_de_espera.add("Marcos");
		fila_de_espera.add("Lucas");
		fila_de_espera.add("João");
		fila_de_espera.add("Paulo");
		
		System.out.println("Fila: " + fila_de_espera);
		
		
		String nome =fila_de_espera.remove();
		System.out.println("Removido da fila: "+nome+ " | Nova fila: \n" + fila_de_espera);
		
		nome = fila_de_espera.poll();
		System.out.println("Removido da fila: "+nome+ " | Nova fila: \n" + fila_de_espera);
	}

}
