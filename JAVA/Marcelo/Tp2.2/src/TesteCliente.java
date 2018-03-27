
public class TesteCliente {

	Doc doc;
	
	
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Marcelo",500, 500);
		Cliente c2 = new Cliente("Rodrigo",500,500);		
		Doc d1=new Doc();		
		
		c1.checarSaldo();
		c2.checarSaldo();
		
		
		d1.transferir(c1, c2, 300);
		
		System.out.println("");
		System.out.println("======================NOVO SALDO=======================");		
		
		c1.checarSaldo();
		c2.checarSaldo();
		
		
		
		
		

				
		
	}







}
