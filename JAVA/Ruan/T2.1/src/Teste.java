
public class Teste {
	
	 public static void main(String[] args) {
	        PartidoPolitico PT = new PartidoPolitico("Partido dos trabalhadores","Socialista","PT",13);
	        PartidoPolitico PSDB = new PartidoPolitico("Partido da Social Democracia Brasileira","Social-Democracia","PSDB",45);
	        PartidoPolitico PSOL = new PartidoPolitico("Partido Socialista","Socialista Central","PSOL",50);
	        
	        Candidato c1 = new Candidato("Lula",PT);
	        Candidato c2 = new Candidato("Alckimin",PSDB);
	        Candidato c3 = new Candidato("Marina",PSOL);
	        
	        c1.apresentaCandidato();
	        c2.apresentaCandidato();
	        c3.apresentaCandidato();	        
	        
	    }

}
