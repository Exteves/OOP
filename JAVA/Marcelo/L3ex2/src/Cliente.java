
public class Cliente {

	
		String nome;
		
		double saldo, tarifa;
		
				
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


		public double getTarifa() {
			return tarifa;
		}

		public void setTarifa(double tarifa) {
			this.tarifa = tarifa;
		}

		public void controleCc() {
			
			System.out.println();
			System.out.println("Controle Conta Corrente");
			System.out.println("Nome: " + this.getNome());
			System.out.println("Saldo: " + this.getSaldo());
			
		}


	}
	


		
		
		
		
		
		
