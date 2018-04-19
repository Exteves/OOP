


	public class ClienteRegular extends Cliente{

	
      		
	
	
       public void calcularTarifa() {
		
	   		   
		this.tarifa =this.getSaldo()*0.01;
		
	
		System.out.println("O valor da tarifa é:"+ this.getTarifa());
		
	
		
		
	}
	
	
	
	
	
	
}
