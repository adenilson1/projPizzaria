import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

public class TestePizza {

	/**
	 * Depois de qualquer teste, será zerado a quantidade de ingredientes
	 * 
	 */
	@After
	public void zerarListaDeINgredientes() {
		Pizza.zerarIngredientes();
		
		assertEquals(0,Pizza.totalDeIngrediente);
	}
	
	/**
	 * Primeiro teste: Verificando se a quantidade de ingreidiente adicionados
	 * está de acordo com o tamanho da quantidade de ingredientes
	 */
	@Test
	public void testQuantidadeDeIngredientePizza() {
		Pizza pizza = new Pizza();
		
		pizza.adiconarIngredientes("tomate");
		pizza.adiconarIngredientes("calabreza");
		
		//Verificacao: Qunatidade esperada - resultado
		assertEquals(2,pizza.getIngrediente().size());

	}
	

	/**
	 * Segundo teste: Verificando se o preço da pizza
	 * está de acordo com a quandidade de ingrediente
	 * nota:
	 * entre 1 a 2 ingredientes -> 15,00
	 * entre 3 a 5 ingredientes -> 20,00
	 * acima de 5 ingredintes -> 23,00
	 */
	@Test
	public void testValorDaPizza() {
		Pizza pizza = new Pizza();
		
		pizza.adiconarIngredientes("cebola");
		pizza.adiconarIngredientes("carne seca");
		pizza.adiconarIngredientes("carne seca");

		
//      Verificar resultado		
//		Parâmetros: esperado - valor esperado
//		real - o valor a verificar em relação ao esperado
//		delta - o delta máximo entre o esperado e o real
//		para o qual os dois números ainda são considerados iguais.
	
		
		assertEquals(20.0,pizza.getPreco(),0);	
		
	}


}
