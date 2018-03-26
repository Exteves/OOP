
public class Celular {
	Boolean status = false; // true = ligado, false = desligado
	String nome, numero;
	Bateria bateria;
	
	public Celular(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
		bateria = new Bateria(100);
	}
	
	public void ligar() {
		if(bateria.getCarga() > 20 && status == false) {
			this.bateria.decarregar(20);
			this.status = true;
			
			System.out.println("Nome: " + this.nome);
			System.out.println("Número: " + this.numero);
		}
	}
	
	public void checarBateriaFraca() {
		if(bateria.getCarga() < 20) {
			System.out.println("* BATERIA FRACA *");
			System.out.println("Bateria: " + this.bateria.getCarga() + "%");
		}
	}
	
	public void desligar() {
		this.bateria.decarregar(10);
		if(this.status == true && this.bateria.getCarga() > 20) {
			System.out.println("Desligando o celular...");
			checarBateriaFraca();
		}
		this.status = false;
	}
	
	public void tocarSom() {
			this.bateria.decarregar(10);
			checarBateriaFraca();
			
			if(this.bateria.getCarga() == 0)
				this.status = false;
			
	}
	
	public void carregar() {
		this.bateria.carregar(5);
	}
	
	public void descarregar() {
		this.bateria.decarregar(10);
		checarBateriaFraca();
		
		if(this.bateria.getCarga() == 0)
			this.status = false;
	}
	
	public void trocarBateria() {
		this.desligar();
		bateria = new Bateria(100);
	}
	
}
