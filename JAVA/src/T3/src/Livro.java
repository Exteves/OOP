
public class Livro {
	public String nomeLivro;
	private double preco;
	private tipoLivro tipo;

	public Livro(String nomeLivro, tipoLivro tipo) {
		switch (tipo) {
		case EPUB:
			this.preco = 20;
			break;
		case PDF:
			this.preco = 40;
			break;
		case FISICO:
			this.preco = 80;
			break;
		default:
			this.preco = 0;
			break;
		}
		nomeLivro = this.nomeLivro;
	}

	public double getPreco() {
		return this.preco;
	}

	public tipoLivro getTipo() {
		return this.tipo;
	}
}
