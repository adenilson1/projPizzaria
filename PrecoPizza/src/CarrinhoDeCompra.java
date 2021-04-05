import java.util.ArrayList;

/**
 * Essa classe recebera os objetos da classe pizza
 * e que terá os metodos que ira retorna o valor total
 * de todas as pizzas
 *
 */
public class CarrinhoDeCompra {
	
	public ArrayList<Pizza> listaPizza = new ArrayList<Pizza>(); // lista de pizzas no carrinho 
	public double precoTotalPizza = 0;
	
	/**
	 * Esse metodo verifica se ha ingreidite.
	 * Caso não, a pizza não sera adicionada ao carrinho.
	 */
	
	public void adicionarPizza(Pizza pizza) {
		if(pizza.getIngrediente().isEmpty()) { // caso estiver vazia
			listaPizza.clear();
			
	}else {
		
		listaPizza.add(pizza); 
	}
  }
	
	/**
	 * Quantidade total de pizzas adicionada ao carrinho
	 */
	public int quantidadeTotalPizza() {
		return listaPizza.size();
	}
	
	/**
	 * Calculo do preço da pizza
	 */
	public double getPrecoTotalPizza() {
		for (int i = 0; i < listaPizza.size(); i++) {
			precoTotalPizza += listaPizza.get(i).getPreco();
		}
		return precoTotalPizza;
	}
}
