
public class Produto {

		
		private String nome;
		private double preco;
		public double valorliquido;
		

		public Produto (String nome, double preco) {
			
			this.nome=nome;
			this.preco=preco;
						
		}
				
				
		public String getNome() {
			return nome;
		}

		

		

		
		public double getPreco() {
			return preco;
		}

		public void mostrarProduto() {
			
						
			System.out.println();
			System.out.println("Produto:");
			System.out.println("Nome: " + this.getNome());
			System.out.println("Preco: " + this.getPreco());

			
			
			
			
			
			
		}

		
		
		
	}




	
	

