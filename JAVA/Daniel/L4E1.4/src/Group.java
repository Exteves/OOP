import java.util.Scanner;

public class Group extends Usuario{

	public Scanner s = new Scanner(System.in);
	
	public Group(String login) {
		super(login);
		groupBoard();
	}

	public void groupBoard() {
		System.out.println("Bem vindo ao seu group board");
		
		

		while(super.opt != "sair") {
			
			System.out.println("Escolha uma ação \n"
					+ "1- DESCREVER MINHAS AÇÕES \n"
					+ "2- SAIR");
			super.opt = s.nextLine();
			
			switch(super.opt){
				
				case "1":
					this.descreverAcoes();
				break;
				
				case "2":
					this.despedida();
					super.opt = "sair";
				break;
				
				default:
					System.out.println("OPÇÃO INVÁLIDA");	
			}
			
		}
	}
	
	@Override
	public void descreverAcoes() {
		System.out.println("Como usuário GROUP você pode ler e editar os arquivos do sistema");
	}
	

}
