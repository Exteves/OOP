
public class ProdutoIPI extends Imposto {



	

    public ProdutoIPI(String nome, double preco) {
		super(nome, preco);
		
	}

	@Override
    public void calcularImposto() {
		
	   	   	
    	this.imposto=this.getPreco()*0.05;
		
				
		this.valorliquido=this.getPreco()-this.getImposto();
		
		System.out.println("IPI 5% :"+ this.imposto);
		System.out.println("valor liquido - imposto :"+ this.valorliquido);
		
		
		
		
	}


}
