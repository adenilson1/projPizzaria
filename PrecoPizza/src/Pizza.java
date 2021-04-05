// bilbiotecas importadas
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {
	private double precoQuantidadeIngrediente;
	private ArrayList<String> listaIngrediente = new ArrayList<String>();// lista para guardar os ingredientes
	/**
	 * HashMap: Interface é um objeto que mapeia valores para chaves, ou seja,
	 * através da chave consegue ser acessado o valor configurado, sendo que a
	 * chave não pode ser repetida ao contrário do valor, mas se caso
	 * tiver uma chave repetida é sobrescrito pela última chamada.
	 */
	public static Map<String, Integer> mapaDeIngrediente = new HashMap<String, Integer>();
	public static int totalDeIngrediente = 0;
	
	
	/**
	 * Metodo para retorno dos ingredientes, com isso de uma checagem da classe
	 * CarrinhoDeCompra para confirma se o objeto tem ou nao ingredientes
	 */
	public ArrayList<String> getIngrediente(){
		return listaIngrediente;
	}
	
	public static Map<String, Integer> getListaIngrediente(){
		return mapaDeIngrediente;
	}
	
	/**
	 * Metodo que adiciona ingredientes a lista
	 *
	 */
	public void adiconarIngredientes (String ingrediente) {
		this.listaIngrediente.add(ingrediente);
		
		//contabilizar d ingredientes adicionados 
		contabilizarIngrediente(ingrediente);
	}
	
	/**
	 * Contabilidade de ingredientes da lista
	 */
	public static void contabilizarIngrediente(String ingrediente) {
		if(mapaDeIngrediente.containsKey(ingrediente)) {
			int valorDoIngrediente = mapaDeIngrediente.get(ingrediente);
			mapaDeIngrediente.put(ingrediente, valorDoIngrediente+1);
		}else {
			mapaDeIngrediente.put(ingrediente, 1);
		}
		
		totalDeIngrediente++;
	}
	
	/**
	 * Calculo de preco, baseado no tamanho da lista de ingredientes
	 */
	
	public double getPreco() {
		
		if(listaIngrediente.size() >= 1 && listaIngrediente.size() <= 2) {
			precoQuantidadeIngrediente = 15.0;
		}
		
		if(listaIngrediente.size() >= 3 && listaIngrediente.size() <= 5) {
			precoQuantidadeIngrediente = 20.0;
		}
		
		if(listaIngrediente.size() > 5) {
			precoQuantidadeIngrediente = 23.0;
		}
		return precoQuantidadeIngrediente;
	}
	
	/**
	 * Metodo que vai zerar o registro do ingrediente
	 * da quantidade todal de ingredientes
	 */
	public static void zerarIngredientes() {
		totalDeIngrediente =0;
	}

	

	
}