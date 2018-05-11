
public class ProdutoICMS extends Imposto{
	

	
    public ProdutoICMS(String nome, double preco) {
		super(nome, preco);
    }
	
	
    	@Override	
		public void calcularImposto () {
		
	   	 
    	
    	this.imposto= getPreco()*0.10;
					
		this.valorliquido=this.getPreco()-this.getImposto();
		
		System.out.println("ICMS 10% :"+ this.imposto);
		System.out.println("valor liquido - imposto :"+ this.valorliquido);
		
				
		
	}


}


	

