import java.util.Scanner;

public class TesteProduto {



	public static void main(String[] args) {
     	
		 Scanner s = new Scanner(System.in);
		 
		 
		 	ProdutoIPI P1[] = new ProdutoIPI [6];
		 	ProdutoICMS  P2[] = new ProdutoICMS [6];
		 		 
		 	P1[0] = new ProdutoIPI ("Sansung",800.00);
			P1[1] = new ProdutoIPI ("LENOVO", 600.00);
			
			
			
			P2[0] = new ProdutoICMS ("DELL", 2000.00);
			P2[1] = new ProdutoICMS ("SONY", 3000.00);
			
						
						
			
		 int menu;
		 
		 System.out.println("*****  VOCÊ PODE FAZER SOMENTE 4 CONSULTAS!   *****\n");
		 System.out.println("ESCOLHA O TIPO DE PRODUTO QUE DESEJA VISUALIZAR \n\n"
					+ "DIGITE 1 PARA: CELULAR \n"
					+ "DIGITE 2 PARA: TABLET\n"
					+ "DIGITE 3 PARA: NOTEBOOK\n"
					+ "DIGITE 4 PARA:  TV LED"); 
		 				
		
		 for (int i =0 ; i<4 ; i ++) {
		 
				 
			 
			 menu=s.nextInt();
		 
		 
		 		 
		 
		 if (menu==1){
																 
			 P1[0].mostrarProduto();
			 P1[0].calcularImposto();
		 
		 }
		 
		 else if (menu==2){
							  					 
			 P1[1].mostrarProduto();
			 P1[1].calcularImposto();
								 
		 }
		 else if (menu==3){
							 
			 P2[0].mostrarProduto();
			 P2[0].calcularImposto();
			
		 }
		 else if (menu==4){
			 
			 P2[1].mostrarProduto();
			 P2[1].calcularImposto();
			
		 }
		 else {
			 					 
			 System.out.println("OPÇÃO INVÁLIDA");
								 
		 				 
		 }
    	
		 
			
		 }	
		 System.out.println("\n *****  SEU LIMITE DE CONSULTA ESGOTOU  *****");
	    		
			
								
		}
}





