



public class ClientePremium extends Cliente{

	
  	
	
	
	
    public void calcularTarifa() {
		
	   		   
		this.tarifa =this.getSaldo()*0.02;
		
	
		System.out.println("O valor da tarifa é:"+ this.getTarifa());
		
		
	}
}
	
		
		

