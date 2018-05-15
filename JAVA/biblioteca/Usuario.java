package br.com.biblioteca;

import javax.swing.JOptionPane;

public abstract class Usuario {
	private Login nome;
	private Senha senha;
	public Usuario(Login nome, Senha senha) {
		this.nome = nome;
		this.senha = senha;
	}
	public Senha getSenha() {
		return senha;
	}
	public Login getNome() {
		return nome;
	}
	public void menu() {
		
		Biblioteca b = new Biblioteca();

			System.out.println("Menu");
			String opcStr =JOptionPane.showInputDialog(
			"1 - Inserir Estante \n"+
			"2 - Inserir Livro \n" +
			"3 - Listar livros de filosofia \n" +
			"4 - Contar livros de Ciencias \n" +
			"5 - Listar todos os livros \n" +
			"6 - Remover livro \n" +
			"7 - Listar autores \n" +
			"8 - Sair");
			
			int opc = Integer.parseInt(opcStr);
			
		switch (opc) {
		case 1:
			System.out.println("Nome da estante:");
			String nomeEstante = JOptionPane.showInputDialog("Nome da estante:");
			System.out.println("Categoria da Estante:");
			String catEstante = JOptionPane.showInputDialog("Categoria da Estante:");			
			b.inserirEstante(new Estante(nomeEstante, catEstante));
			menu();
			break;
		case 2:
			System.out.println("Nome do livro:");
			String nomeLivro = JOptionPane.showInputDialog("Nome do Livro:");
			System.out.println("Autor do livro:");
			String autorLivro = JOptionPane.showInputDialog("Autor do Livro:");
			System.out.println("Ano de publicacao:");
			String anoPubStr;
			anoPubStr = JOptionPane.showInputDialog("Ano de publicacao:");
			int anoPub = Integer.parseInt(anoPubStr);
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
			String nomeRmLivro = JOptionPane.showInputDialog("Nome do Livro:");
			System.out.println("Autor do livro:");
			String autorRmLivro = JOptionPane.showInputDialog("Autor do Livro:");
			System.out.println("Ano de publicacao:");
			String anoRmPubStr = JOptionPane.showInputDialog("Ano de publicacao:");
			int anoRmPub = Integer.parseInt(anoRmPubStr);
			new Estante().removerLivro(new Livro(nomeRmLivro, autorRmLivro, anoRmPub));
			menu();
			break;
		case 7:
			System.out.println("Digite a categoria desejada:");
			String catAutor = JOptionPane.showInputDialog("Digite a categoria desejada:");
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
