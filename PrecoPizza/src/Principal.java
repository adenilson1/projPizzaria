/**
 * Esse é um projeto java de uma pizzaria
 * Onde são feita tres classe: Pizza, Carrinho de compra e Principal
 * São incluidos os elementos de cada pizza, e quantidade de 
 * ingredeintes vai determinar o preco da pizza.
 * @author adenilson
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		// instanciando so objetos da classe pizza
		
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		
		// Adicionando os ingredientes diferentes em cada pizza 
		
	
		pizza1.adiconarIngredientes("Carne seca");
		pizza1.adiconarIngredientes("tomate");
		
		pizza2.adiconarIngredientes("Calabressa");
		pizza2.adiconarIngredientes("Frango");
		pizza2.adiconarIngredientes("Cebola");
		
		pizza3.adiconarIngredientes("Azeitona");
		pizza3.adiconarIngredientes("Mussarela");
		pizza3.adiconarIngredientes("Ctupiry");
		pizza3.adiconarIngredientes("Cheddar");
		pizza3.adiconarIngredientes("Margherita");
		pizza3.adiconarIngredientes("Pepperone");
		pizza3.adiconarIngredientes("Presunto");
		
		//adicionar cada pizza ao carrinho de compra
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.adicionarPizza(pizza1);
		carrinho.adicionarPizza(pizza2);
		carrinho.adicionarPizza(pizza3);
		
		// Imprimir o total de pizza no carrinho de compra,
		//o preço da pizza e quantidade de ingredientes eme cada pizza
		System.out.println(
				"Toatal de pizza no carrinho: "+carrinho.quantidadeTotalPizza()+
				"\nValor total da compra: R$ "+carrinho.getPrecoTotalPizza()+
				"\nLista de ingredientes: "+Pizza.getListaIngrediente()
				);

		
		
	}

}
