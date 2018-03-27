
public class Cliente {


	String nome;
	double saldo,limite;
	
		
	public Cliente ( String nome, double saldo, double limite) {
		
		this.nome=nome;
		this.saldo=saldo;
		this.limite=limite;
		
		}
	
		
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite (double limite) {
		this.limite = limite;
	}

		
		
	public void checarSaldo(){
		
		double saldototal=saldo+limite;
		
				
		System.out.println("Saldo do " +this.nome +" : "+ this.saldo);
		System.out.println("limite: " + this.limite);
		System.out.println("Saldo + Limite : "+ saldototal);
		System.out.println("=======================================================" );
	
	
	}
	
	public void depositar(double quantia){
		
		this.setSaldo(this.getSaldo() + quantia);
		System.out.println("Deposito realizado na conta do " + this.nome +" :  "+ quantia);

		
		}
	
	
	public void sacar (double val){
		
	
		if (this.getSaldo() + getLimite() >=val){ 
				
					this.setSaldo (this.getSaldo() - val);
				System.out.println("Saque realizado na conta de "+ this.getNome()+ " "+val);
					}else {
					System.out.println("Saldo insuficiente impossivel sacar");
					}
				
				}
			}




	
	
	
	
	



