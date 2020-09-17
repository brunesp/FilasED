package exemplo04;

import java.util.LinkedList;
import java.util.Queue;

public class ListaExemplo4 {
	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<>();
		
		for(int i = 0; i<5; i++)
			fila.add(i);
		
	System.out.println("Elementos da Fila: "+fila);
	
	int elemento_removido = fila.remove();
	System.out.println("Elemento removido: "+elemento_removido);
	
	int head = fila.peek();
	System.out.println("Cabeça da fila: "+head);
	
	int tamanho = fila.size();
	System.out.println("Tamanho da fila: "+tamanho);

}
}