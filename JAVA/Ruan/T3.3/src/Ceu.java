/**
 * @author ruani
 *
 */

public class Ceu {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Estrela e1 = new Estrela("Rigel",1050,"Amarela");
		Estrela e2 = new Estrela("Sol",1200,"Amarela");
		Estrela e3 = new Estrela("Pollux",3000,"Azul");
		Estrela e4 = new Estrela("Sirius",3500,"Black");
		Constelacao c = new Constelacao();									
		c.InfoConstelacao();
		c.adicionar(e1);
		c.adicionar(e2);
		c.adicionar(e3);
		c.adicionar(e4);
		e1.mostrar();
		e2.mostrar();
		e3.mostrar();
		e4.mostrar();
		c.infoEstrelas();
		c.tempConstelacao();
	}
}