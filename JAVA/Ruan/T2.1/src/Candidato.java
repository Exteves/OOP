

public class Candidato {
	
	private String nome;
	private PartidoPolitico partidoPolitico;
	private String nacionalidade;
	
	    public Candidato(String nome, PartidoPolitico partidoPolitico, String nacionalidade) {
	    	if (nacionalidade == "Brasileira") && (partidoPolitico == null) {
	    		System.out.println("Voce deve escolher um partido");
	    }
	    	else {
	    			this.nome = nome;
	    			this.partidoPolitico = partidoPolitico;
	    			this.nacionalidade = nacionalidade;
	    		}
	    	}
	    
	    public void apresentaCandidato(){
	        System.out.println(this.nome + "\n" +this.partidoPolitico.getNome() +"\n"
	                + this.partidoPolitico.getIdeologia() +"\n"+this.partidoPolitico.getSigla()+"\n"
	        		+ this.partidoPolitico.getNumero()+"\n");    
	    }
	    public String getNome() {
	        return nome;
	    }
	    
	    public PartidoPolitico getPartidoPolitico() {
	        return partidoPolitico;
	    }
}
