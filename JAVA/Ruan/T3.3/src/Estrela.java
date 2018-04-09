public class Estrela {
	private String nome; 
	private String cor;
//	private double temperatura;
	
	public Estrela(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
//		this.temperatura = temperatura;
		}
	
	public String getNome() {
		return nome;
	}
	
	public String getCor() {
		return cor;
	}
		
//	public double getTemperatura() {
//		return temperatura;
//	}

	public void mostrarEstrela()	{
		System.out.println("Nome: "+ nome);
		System.out.println("Cor: "+ cor);	
//		System.out.println("Temperatura: " + temperatura);
	}
}
