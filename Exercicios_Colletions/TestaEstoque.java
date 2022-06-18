package Exercicios_Colletions;

import java.util.ArrayList;

public class TestaEstoque {

	public static void main(String[] args) {
		
		ArrayList<Estoque> listaEstoque = new ArrayList <>();
		
		//Armazenar dados 
		Estoque produto1 = new Estoque("Celular Iphone 13", 13000, 8);
		Estoque produto2 = new Estoque("Celular Iphone 12", 13000, 8);
		
		listaEstoque.add(produto1);
		listaEstoque.add(produto2);
		
		// System.out.println(listaEstoque);
		
		//Remover dados
		listaEstoque.remove(1);
		// System.out.println(listaEstoque);
		
		//Atualizar dados
		listaEstoque.set(0, new Estoque("Celular Iphone 11", 3500, 9));
		// System.out.println(listaEstoque);
		
		//Apresentar dados
		for(Estoque i: listaEstoque) {
			System.out.println(listaEstoque);
	}

}
}
