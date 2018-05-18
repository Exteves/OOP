package br.com.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Estante {
	private String nome;
	private CategoriaLivro categoria;
	private List<Livro> livros = new ArrayList<>();
	
	public Estante(String nome, String cat) {
		this.categoria = CategoriaLivro.valueOf(cat);
		this.nome = nome;
	}
	public Estante() {};
	
	public void inserirLivro(Livro l) {
		livros.add(l);
	}
	public void removerLivro(Livro l) {
		livros.remove(l);
	}
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public CategoriaLivro getCategoria() {
		return categoria;
	}



	public void setCategoria(CategoriaLivro categoria) {
		this.categoria = categoria;
	}



	public List<Livro> getLivros() {
		return livros;
	}


	@Override
	public String toString() {
		return "Estante [nome=" + nome + ", categoria=" + categoria + ", livros=" + livros + "]";
	}
	
	
	
}
