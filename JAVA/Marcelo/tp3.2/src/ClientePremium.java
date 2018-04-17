
public class ClientePremium extends Cliente{

	private double tarifa;
	
	
	
	
	public double getTarifa() {
		return tarifa;
	}


	
	

	public void tarifa2() {
		
		
		this.tarifa=this.getSaldo()*0.02;
		
		
		System.out.println("O valor da tarifa é:"+ this.getTarifa());
		
		
		
		
		
		
	}


	
	
}

