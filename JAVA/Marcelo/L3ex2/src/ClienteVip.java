
public class ClienteVip extends Cliente{
	
	
	

    public void calcularTarifa() {
		
	   		   
		this.tarifa =this.getSaldo()*0.04;
		
	
		System.out.println("O valor da tarifa é:"+ this.getTarifa());
		
		
	}

}
