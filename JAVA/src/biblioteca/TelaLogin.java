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
		
		if (username.equals(Login.DANIEL)) {
			Usuario a = new Admin(username, strSenha);
		}else if (username.equals(Login.GARCIA)) { 
			Usuario biblio = new Bibliotecario(username, strSenha);
		}else {
			username.equals(Login.RENAN);			
			Usuario c = new Convidado(username, strSenha);
		}
		
	}
}
