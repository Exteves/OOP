
public class Regular extends Usuario {
	public Regular(String login) {
		super(login);
		this.dashBoard();
	}

	public void dashBoard() {
		System.out.println("Bem vindo ao seu dashboard");
		
		
		
		
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
					this.despedidaRegular();
					super.opt = "sair";
				break;
				
				default:
					System.out.println("OPÇÃO INVÁLIDA");	
			}
			
		}
	}
	
	public void descreverAcoes() {
		System.out.println("Como usuário regular você pode apenas ler os arquivos do sistema");
	}
	
	public void despedidaRegular() {
		System.out.println("Tchau " + super.getLogin());
	}
	
	
}
