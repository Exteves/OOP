
public class Bateria {
	
	private int carga;
	
	public Bateria(int carga) {
		this.carga = carga;
	}
	
	public void decarregar(int carga) {
		if(this.carga > 0 && this.carga > carga)
			this.carga -= carga;
		else
			this.carga = 0;
	}
	
	public void carregar(int carga) {
		if(this.carga < 100)
			this.carga += carga;
	}

	public int getCarga() {
		return carga;
	}
	
}
