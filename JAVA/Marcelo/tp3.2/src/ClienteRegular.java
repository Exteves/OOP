
public class ClienteRegular extends Cliente{

	private double tarifa;
	
	
	
	public double getTarifa() {
		return tarifa;
	}


	
	
	
	public void tarifa1() {
		
		
		this.tarifa=this.getSaldo()*0.01;
		
		System.out.println("O valor da tarifa é:"+ this.getTarifa());
		
		
		
		
		
		
	}
	
	
	
}
