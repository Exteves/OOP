
public abstract class Imposto extends Produto{
	
	public double imposto;
	
	
	
	
	

	 public double getImposto() {
		return imposto;
	}




	public Imposto(String nome, double preco) {
			super(nome, preco);
		
		}
	
	

		public abstract void calcularImposto();
}
