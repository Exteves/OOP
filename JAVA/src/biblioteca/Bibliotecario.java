package br.com.biblioteca;

import java.util.Scanner;

public class Bibliotecario extends Usuario{

	private Scanner s;
	private Biblioteca b;
	public Bibliotecario(Login nome, String senha) {
		super(nome, senha);
	}
	@Override
	public void menu() {
		s = new Scanner(System.in);
		
		b = new Biblioteca();
		
		int opc = 0;
			System.out.println("Menu");
			System.out.println("1 - Inserir Livro");
			System.out.println("2 - Sair");		
		switch (opc) {
		case 1:
			System.out.println("Nome do livro:");
			String nomeLivro = s.next();
			System.out.println("Autor do livro:");
			String autorLivro = s.next();
			System.out.println("Ano de publicacao:");
			int anoPub = s.nextInt();
			new Estante().inserirLivro(new Livro(nomeLivro, autorLivro, anoPub));
			menu();
			break;
		case 2:
			System.exit(0);
		default:
			System.out.println("Escolha uma das opcoes acima!");
			menu();
			break;
		}
		
	}

}
