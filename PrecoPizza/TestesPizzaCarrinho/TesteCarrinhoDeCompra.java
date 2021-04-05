import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinhoDeCompra {

	
	
	/**
	 * Primeiro teste: Verificado a soma do preço da pizza
	 */
	@Test
	public void testSomaDaPizza() {
	
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		
		pizza1.adiconarIngredientes("tomate");
		pizza1.adiconarIngredientes("cebola");
		pizza1.adiconarIngredientes("queijo");
		
		pizza2.adiconarIngredientes("cebola");
		pizza2.adiconarIngredientes("queijo");
		
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.adicionarPizza(pizza1);
		carrinho.adicionarPizza(pizza2);
		
		//Verificavao valor esperado - resultado
		assertEquals(35, carrinho.getPrecoTotalPizza(),0);

				
	}
	
	/**
	 * Segundo teste: Verificando se não está adicionando pizza sem ingredientes
	 */
	@Test
	public void testPizzaSemIngrediente() {
		Pizza pizza1 = new Pizza();// pizza sem ingrediente
		Pizza pizza2 = new Pizza();
		
		pizza2.adiconarIngredientes("queijo");
		pizza2.adiconarIngredientes("pressunto");
		
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.adicionarPizza(pizza1);
		carrinho.adicionarPizza(pizza2);
		
		assertEquals(15, carrinho.getPrecoTotalPizza(),0);
		
	}

}
