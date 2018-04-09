public class Ceu {
	public static void main(String[] args) {
		
		Estrela e1 = new Estrela("Rigel","Amarela");
		Estrela e2 = new Estrela("Sol","Amarela");
		Estrela e3 = new Estrela("Pollux","Branca");
		Estrela e4 = new Estrela("Sirius","Azul");
		Constelacao c = new Constelacao("Orion");
		c.adicionar("1050",e1);
		c.adicionar("1200",e2);
		c.adicionar("3000",e3);
		c.adicionar("3000",e4);
		c.listarEstrelas();		
		}
}