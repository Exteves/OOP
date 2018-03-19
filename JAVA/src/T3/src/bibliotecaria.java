import java.util.Scanner;

public class bibliotecaria {
	Scanner s = new Scanner(System.in);
	
	public bibliotecaria() {
		s = new Scanner(System.in);
	}
	
	public void principal() {
		System.out.println("Digite o nome do livro ");
		String nomeLivro = s.next();
		System.out.println("Digite o tipo de livro: ");
		String tipoStr = s.next();
		tipoLivro tipo = tipoLivro.valueOf(tipoStr.toUpperCase());
		Livro book = new Livro(nomeLivro, tipo);
		System.out.println("O Preço deste livro é "+book.getPreco());
	}
}
