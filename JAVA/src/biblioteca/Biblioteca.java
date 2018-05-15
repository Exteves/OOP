package br.com.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private String nome;
	private List<Estante>estantes = new ArrayList<>();
	
	public Livro[] listarFilosofia() {		
		for (Estante estante : estantes) {
			if(estante.getCategoria().equals(CategoriaLivro.FILOSOFIA)) {
				return (Livro[]) estante.getLivros().toArray();
			}			
		}		
		return null;
	}
	
	public int contarCiencia() {
		int total = 0;
		
		for (Estante estante : estantes) {
			if(estante.getCategoria().equals(CategoriaLivro.CIENCIAS)) {
				total += estante.getLivros().size();
			}			
		}
		return total;
	}
	public void listarTudo() {
		for (Estante estante : estantes) {
			System.out.println(estante.getLivros());
		}
	}
	public ArrayList<String> listarAutores(CategoriaLivro cat){
		int i = 0;
		ArrayList<String> autores = new ArrayList<>();
		for (Estante estante : estantes) {
			if (estante.getCategoria().equals(cat)) {
				autores.add(estante.getLivros().get(i++).getAutor());
			}
		}
		return autores;		
	}
	
	
	public void inserirEstante(Estante e) {
		estantes.add(e);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Estante> getEstantes() {
		return estantes;
	}
	
	@Override
	public String toString() {
		return "Biblioteca [nome=" + nome + ", estantes=" + estantes + "]";
	}

}
