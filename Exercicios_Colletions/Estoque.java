package Exercicios_Colletions;

public class Estoque {
	
	private String nome;
	private int preco;
	private int quantidade;
	public Estoque(String nome, int preco, int quantidade) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "Descrição: " + nome + " | Valor R$ " + preco + " | Quantidade: " + quantidade;
	}
	
	

}
