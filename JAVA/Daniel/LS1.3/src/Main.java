import java.util.Scanner;

public class Main {
	
/*
 * Exercício 1.3. 
 * 
 * Uma bateria é composto por um número que representa
 * sua carga (de 0 a 100).
 * 
 * Toda bateria pode ser descarregada a cada momento
 * em 10 unidades e carregada em 5. Um celular é composto de
 * um número (identificador),
 *  um nome de usuário e uma bateria. Cada
 * vez que um celular liga, dever-se-á mostrar na tela o nome do usuá-
 * rio e seu nome na tela,
 * 
 * porém se não houver bateria (ou esta estiver
 * sem carga) nada deverá ser mostrado
 * 
 * e se a carga estiver abaixo de
 * 20 a mensagem bateria fraca deverá ser mostrada.
 * 
 * Para desligar, uma
 * mensagem de despedida deverá ser mostrada na tela, caso não haja
 * bateria (ou a bateria estiver com carga baixa), nada deverá ser mostrado.
 * 
 * Cada vez que liga, 20 unidades de bateria deverão ser gastos (se
 * houver menos, nada deverá ser feito) e quando desliga 10.
 * 
 *  Um celular só desliga se estiver ligado e vice-versa. 
 *  
 *  Um celular também pode tocar um som se estiver ligado e com bateria com carga suficiente (ao
 * menos 10 unidades)
 * 
 * Podemos também trocar a bateria de um celular
 * quando quisermos
 * 
 * Implemente todas as classes envolvidas nessa
 * situação, lembre-se de usar construtores e metodos get, se necessário.
 * Implemente também alguns testes. É proíbido usar conceitos que ainda
 * não foram abordados.
 */

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome: ");
		String nome = s.nextLine();
		System.out.println("Digite seu numero de celular: ");
		String numero = s.nextLine();
		
		
		

		Celular celular = new Celular(nome,numero);
	
		int a = 0;
		
		while(a != -1) {
			System.out.println(""
					+ "1. Ligar \n"
					+ "2. Desligar \n"
					+ "3. Tocar Som \n"
					+ "4. Carregar \n"
					+ "5. Descarregar \n"
					+ "6. Trocar bateria \n"
					+ "7. Checar bateria \n"
					+ "8. Checar status \n"
					+ "9. Sair");
			a = s.nextInt();
			switch (a) {
				case 1: celular.ligar();
				break;
				case 2: celular.desligar();
				break;
				case 3: celular.tocarSom();
				break;
				case 4: celular.carregar();
				break;
				case 5: celular.descarregar();
				break;
				case 6: celular.trocarBateria();
				break;
				case 7: System.out.println(celular.bateria.getCarga());
				break;
				case 8: System.out.println(celular.status);
				break;
				case 9: a = -1;
				break;
				default: System.out.println("OPÇÃO INVÁLIDA!");
			}
			
			System.out.println("\n \n");
			
		}
		
		
		
		
	}

}
