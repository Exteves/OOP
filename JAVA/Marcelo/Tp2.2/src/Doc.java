
public class Doc {

  double quantia;
  Cliente c1,c2,saldo;
   
    
  public double getQuantia() {
		return quantia;
	}
	
	public void setQuantia (double quantia) {
		this.quantia = quantia;
	}
  
  
   
  public void transferir (Cliente c1, Cliente c2, double quantia ) {
	  
	  /*Implemente, tamb�m, uma classe Doc que possui o m�todo
	  transferir(Cliente c1, Cliente c2, double quantia) que saca
	  uma quantia de c1, se este tiver saldo, e deposita na conta de c2.*/
	  
	  
	  System.out.println("Transferencia DOC");

	  			
	  
	  c1.sacar(quantia);
				c2.depositar(quantia);
				c2.getSaldo();
				
				
				  
  }
			
		  
	  
  }
  
  
  
  

