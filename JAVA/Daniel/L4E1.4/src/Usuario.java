public class Usuario {
	
	
	private String login;
	public String opt;
	private Usuario tipoUsuario;
	
	public Usuario(String login) {
		this.login = login;
	}
	
	public void login(Usuario usuario) {}

	public String getLogin() {
		return login;
	}
	
	public void descreverAcoes() {
		System.out.println("Esse usuário não possui nenhuma ação disponível");
	}
	
	public void despedida() {
		System.out.println("Tchau " + this.login);
	}
	
	
}
