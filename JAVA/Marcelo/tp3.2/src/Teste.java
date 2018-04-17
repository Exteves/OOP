import java.util.Scanner;

public class Teste {
	
		
	
	
        public static void main(String[] args) {
        	
        	
        	
              
        
        	
        	
        	
        	
		ClienteVip c1 = new ClienteVip ();
		ClienteRegular c2 = new ClienteRegular ();		
		ClientePremium c3 = new ClientePremium ();		
		
		
		
		
		
		
		
		
		
		
		
		
		
		c1.setNome("Marcelo");
		c1.setSaldo(500);
		c2.setNome("Renan");
		c2.setSaldo(200);
		c3.setNome("Rhuan");
		c3.setSaldo(300);
		
		c1.controlaCc();
		c1.tarifa4();
		
		c2.controlaCc();
		c2.tarifa1();
		
		c3.controlaCc();
		c3.tarifa2();
		
		
		
		

				
		
	}

	
	
	
	
	
	

}
