package br.com.biblioteca;

import java.util.Scanner;

public class TelaLogin {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Usuario:");
		String strUsuario = sc.nextLine();
		System.out.println("Senha:");
		String strSenha = sc.nextLine();
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
