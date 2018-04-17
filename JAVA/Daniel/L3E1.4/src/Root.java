
public class Root extends Usuario {

	public Root(String login) {
		super(login);
		
		while(super.opt != "sair") {
			
			System.out.println("Escolha uma ação \n"
					+ "1- DESCREVER MINHAS AÇÕES \n"
					+ "2- EXCLUIR TODOS USUÁRIOS \n"
					+ "3- SAIR");
			super.opt = s.nextLine();
			
			switch(super.opt){
				
				case "1":
					this.descreverAcoes();
				break;
				
				case "2":
					this.excluirTodos();
				break;
				
				case "3":
					this.despedidaRoot();
					super.opt = "sair";
				break;
				
				default:
					System.out.println("OPÇÃO INVÁLIDA");
			}
			
		}
		
	}
	
	public void despedidaRoot() {
		System.out.println("Tchau " + super.getLogin());
	}
	
	public void descreverAcoes() {
		System.out.println("Como usuário root você pode ler e escrever todos arquivos do sistema");
	}
	
	public void excluirTodos() {
		System.out.println("Você tem a permissão de excluir todos os usuários do sistema");
	}
	
	
}
