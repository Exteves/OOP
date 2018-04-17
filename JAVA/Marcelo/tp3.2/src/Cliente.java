
public abstract class Cliente {


	
	private String nome;
	private double saldo;
		
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void controlaCc() {
		
		System.out.println();
		System.out.println("Controla Conta Corrente");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Saldo: " + this.getSaldo());
		
		
		
		
		
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", saldo=" + saldo + "]";
	}








}
