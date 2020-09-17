package exemplo05;

public class Fila {
	private static class No {
		Object item;
		No prox;
	}

	private No inicio;
	private No fim;

	public Fila() {
		this.inicio = new No();
		this.fim = this.inicio;
		this.inicio.prox = null;
	}

	public void enfilera(Object valor)  {
		this.fim.prox = new No();
		this.fim = this.fim.prox;
		this.fim.item = valor;
		this.fim.prox = null;
	}
	
	public Object desenfileira () throws Exception{
		Object valor = null;
		if (this.vazia()) {
			throw new Exception("Erro: A fila está vazia");
		}
		this.inicio = this.inicio.prox;
		valor = this.inicio.item;
		return valor;
	}
	
	public boolean vazia() {
		return(this.inicio == this.fim);
	}
	
	public void imprime() {
		No aux;
		aux = this.inicio.prox;
		while(aux != null) {
			System.out.println(" " + aux.item.toString());
			aux = aux.prox;
		}
		System.out.println();
	}
	
}
