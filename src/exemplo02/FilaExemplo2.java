package exemplo02;

import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo2 {
	public static void main(String[] args) {
		Queue <String> fila_de_espera = new LinkedList<>();
		
		fila_de_espera.add("Ana");
		fila_de_espera.add("Maria");
		fila_de_espera.add("Ester");
		fila_de_espera.add("Debora");
		
		System.out.println("Fila: "+fila_de_espera);
		
		System.out.println("A fila está vazia? "+fila_de_espera.isEmpty());
		
		System.out.println("Tamanho da fila: "+fila_de_espera.size());
		
		String nome = "Ester";
		if(fila_de_espera.contains(nome)) {
			System.out.println("Fila contem "+ nome);
		}else {
				System.out.println("Fila não contem "+nome);
			}
		
		
		String primeira_pessoa_na_fila = fila_de_espera.element();
		System.out.println("Primeira pessoa da fila (element()): "+ primeira_pessoa_na_fila);
		
		primeira_pessoa_na_fila = fila_de_espera.peek();
		System.out.println("Primeira pessoa da fila (peek()): "+primeira_pessoa_na_fila);
		
		System.out.println("Fila: "+fila_de_espera);
	}
		
	}

