package br.com.biblioteca;

import java.util.Scanner;

public class Convidado extends Usuario{

	private Scanner s;
	public Convidado(Login nome, String senha) {
		super(nome, senha);
	}
	@Override
	public void menu() {
		s = new Scanner(System.in);
		
		Biblioteca b = new Biblioteca();
		
		int opc = 0;
			System.out.println("Menu");
			System.out.println("1 - Listar livros de filosofia");
			System.out.println("2 - Contar livros de Ciencias");
			System.out.println("3 - Listar todos os livros");
			System.out.println("4 - Listar autores");
			System.out.println("5 - Sair");
			menu();		
		switch (opc) {
		case 1:
			b.listarFilosofia();
			menu();
			break;
		case 2:
			b.contarCiencia();
			menu();
			break;
		case 3:
			b.listarTudo();
			menu();
			break;
		case 4:
			System.out.println("Digite a categoria desejada:");
			String catAutor = s.next();
			b.listarAutores(CategoriaLivro.valueOf(catAutor.toUpperCase()));
			menu();
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Escolha uma das opcoes acima!");
			menu();
			break;
		}
	}

}
