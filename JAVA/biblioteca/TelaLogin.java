package br.com.biblioteca;

import javax.swing.JOptionPane;

public class TelaLogin {

	public static void main(String[] args) {
		System.out.println("Usuario:");
		String strUsuario = JOptionPane.showInputDialog("Usuario");
		System.out.println("Senha:");
		String strSenha = JOptionPane.showInputDialog("Senha");
		Login username = Login.valueOf(strUsuario.toUpperCase());
		Senha senha = Senha.valueOf(strSenha.toUpperCase());
		
		if	(username.equals(Login.DANIEL)&&senha.equals(Senha.PHP)) {
			Admin a = new Admin(username, senha);
			a.menu();
		}
		if	(username.equals(Login.GARCIA)&&senha.equals(Senha.HASKELL)) { 
			Bibliotecario biblio = new Bibliotecario(username, senha);
			biblio.menu();
		}
		if	(username.equals(Login.RENAN)&&senha.equals(Senha.GO)){ 						
			Convidado c = new Convidado(username, senha);
			c.menu();
		}
		
		
	}
}
