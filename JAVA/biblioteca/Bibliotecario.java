package br.com.biblioteca;

import javax.swing.JOptionPane;

public class Bibliotecario extends Usuario{

	private Biblioteca b;
	public Bibliotecario(Login nome, Senha senha) {
		super(nome, senha);
	}
	@Override
	public void menu() {
		
		b = new Biblioteca();
		
		int opc = 0;
			System.out.println("Menu");
			System.out.println("1 - Inserir Livro");
			System.out.println("2 - Sair");		
		switch (opc) {
		case 1:
			System.out.println("Nome do livro:");
			String nomeLivro = JOptionPane.showInputDialog("Nome do livro:");
			System.out.println("Autor do livro:");
			String autorLivro = JOptionPane.showInputDialog("Autor do Livro:");
			System.out.println("Ano de publicacao:");
			String strAnoPub = JOptionPane.showInputDialog("Ano de publicacao:");
			int anoPub = Integer.parseInt(strAnoPub);
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
