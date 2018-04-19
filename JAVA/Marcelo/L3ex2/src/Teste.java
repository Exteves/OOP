
import java.util.Scanner;

public class Teste{

			
			 public static void main(String[] args) {
		     	
				 Scanner s = new Scanner(System.in);
				 
				    ClienteRegular 	c1 = new ClienteRegular ();
					ClientePremium 	c2 = new ClientePremium ();		
					ClienteVip 		c3 = new ClienteVip ();		
					
					c1.setNome("Marcelo");
					c1.setSaldo(400);				 
					c2.setNome("Renan");
					c2.setSaldo(200);
					c3.setNome("Rhuan");
					c3.setSaldo(300);
				 

				 
				 int menu;
				 
				 System.out.println("VOCÊ PODE FAZER SOMENTE 4 CONSULTAS!\n");
				 System.out.println("ESCOLHA O TIPO DE CONTA QUE DESEJA VISUALIZAR \n\n"
							+ "DIGITE 1 PARA:REGULAR \n"
							+ "DIGITE 2 PARA: PREMIUM\n"
							+ "DIGITE 3 PARA: VIP");
				
				 for (int i =0 ; i<4 ; i ++) {
				 
						 
					 
					 menu=s.nextInt();
				 
				 
				 		 
				 
				 if (menu==1){
																		 
					 c1.controleCc();
					 c1.calcularTarifa();
									 					 				 
				 }
				 
				 else if (menu==2){
									  					 
					 c2.controleCc();
					 c2.calcularTarifa();
										 
				 }
				 else if (menu==3){
									 
					c3.controleCc();
					c3.calcularTarifa();
				 }
				 else {
					 					 
					 System.out.println("OPÇÃO INVÁLIDA");
										 
				 				 
				 }
		     	
				 
					
				 }	
				 System.out.println("SEU LIMITE DE CONSULTA ESGOTOU");
			    		
					
										
				}
}
