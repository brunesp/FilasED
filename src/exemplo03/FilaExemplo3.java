package exemplo03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo3 {
	public static void main(String[] args) {
		Queue<String> fila_de_espera = new LinkedList<>();
		
		fila_de_espera.add("Elias");
		fila_de_espera.add("Eliseu");
		fila_de_espera.add("Samuel");
		fila_de_espera.add("Davi");
		
		System.out.println("=== Iterações usando forEach()" + fila_de_espera +"===");
		fila_de_espera.forEach(name -> {
			System.out.println(name);
		});
		
		System.out.println("\n Iterações em uma fila usando iterator() ===");
		
		Iterator<String> fila_de_esperaIterator = fila_de_espera.iterator();
		while (fila_de_esperaIterator.hasNext()) {
			String name = fila_de_esperaIterator.next();
			System.out.println(name);
		}
		
		System.out.println("\n == Usando iterator e Java8 forEachRemaining()");
		fila_de_esperaIterator = fila_de_espera.iterator();
		fila_de_esperaIterator.forEachRemaining(name ->{
			System.out.println(name);
		});
		
		System.out.println("\n Iterações sobre uma fila usando loop for-each");
		for(String name: fila_de_espera) {
			System.out.println(name);
		}
		
	}
}
