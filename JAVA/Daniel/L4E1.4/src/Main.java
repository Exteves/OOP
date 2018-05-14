import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		String opt = "", login;
		Usuario usuario;
		
		System.out.println("Digite seu login: ");
		login = s.nextLine();
		
		System.out.println("Escolha seu nível de usuário: \n"
				+ "1- REGULAR \n"
				+ "2- GROUP \n"
				+ "3- ROOT");
		opt= s.nextLine();
		
		switch(opt) {
		
			case "1":
				usuario = new Regular(login);
			break;
			
			case "2":
				usuario = new Group(login);
			break;
			
			case "3":
				usuario = new Root(login);
			break;
			
			default:
				System.out.println("OPÇÃO IVÁLIDA");
		}
		
	}
}