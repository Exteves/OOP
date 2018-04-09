import java.util.HashMap;
import java.util.Map.Entry;

public class Constelacao {
	private String nome;
	private HashMap<String,Estrela> stars;
	
	public Constelacao(String nome) {
		this.nome = nome;
		this.stars = new HashMap<String,Estrela>();
	
	}
	
	public void adicionar(String temp, Estrela e) {
		stars.put(temp, e);
	}
	
	public Estrela buscarAluno(String temp) {
		return stars.get(temp);
	}
	
	public void listarEstrelas() {
		for(Entry<String, Estrela> reg: stars.entrySet()) {
			System.out.println(reg.getKey());
			reg.getValue().mostrarEstrela();
		}
	}
}