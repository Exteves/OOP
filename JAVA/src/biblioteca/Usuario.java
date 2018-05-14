package br.com.biblioteca;

import java.util.Scanner;

public abstract class Usuario {
	Login nome;
	String senha;
	public Usuario(Login nome, String senha) {
		this.nome = nome;
		this.senha = senha;
		menu();
	}
	public void menu() {
		Scanner s = new Scanner(System.in);
		
		Biblioteca b = new Biblioteca();
		
		int opc = 0;
			System.out.println("Menu");
			System.out.println("1 - Inserir Estante");
			System.out.println("2 - Inserir Livro");
			System.out.println("3 - Listar livros de filosofia");
			System.out.println("4 - Contar livros de Ciencias");
			System.out.println("5 - Listar todos os livros");
			System.out.println("6 - Remover livro");
			System.out.println("7 - Listar autores");
			System.out.println("8 - Sair");
		switch (opc) {
		case 1:
			System.out.println("Nome da estante:");
			String nomeEstante = s.next();
			System.out.println("Categoria da Estante:");
			String catEstante = s.next();			
			b.inserirEstante(new Estante(nomeEstante, catEstante));
			menu();
			break;
		case 2:
			System.out.println("Nome do livro:");
			String nomeLivro = s.next();
			System.out.println("Autor do livro:");
			String autorLivro = s.next();
			System.out.println("Ano de publicacao:");
			int anoPub = s.nextInt();
			new Estante().inserirLivro(new Livro(nomeLivro, autorLivro, anoPub));
			menu();
			break;
		case 3:
			b.listarFilosofia();
			menu();
			break;
		case 4:
			b.contarCiencia();
			menu();
			break;
		case 5:
			b.listarTudo();
			menu();
			break;
		case 6:
			System.out.println("Nome do livro:");
			String nomeRmLivro = s.next();
			System.out.println("Autor do livro:");
			String autorRmLivro = s.next();
			System.out.println("Ano de publicacao:");
			int anoRmPub = s.nextInt();
			new Estante().removerLivro(new Livro(nomeRmLivro, autorRmLivro, anoRmPub));
			menu();
			break;
		case 7:
			System.out.println("Digite a categoria desejada:");
			String catAutor = s.next();
			b.listarAutores(CategoriaLivro.valueOf(catAutor.toUpperCase()));
			menu();
			break;
		case 8:
			System.exit(0);
			break;
		default:
			System.out.println("Escolha uma das opcoes acima!");
			menu();
			break;
		}
		
	}
}
