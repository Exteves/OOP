

public class PartidoPolitico {
		
		private String nome;
		private String ideologia;
		private String sigla;
		private String numero;

		    public PartidoPolitico(String nome, String ideologia, String sigla, String numero) {
		        this.nome = nome;
		        this.ideologia = ideologia;
		        this.sigla = sigla;
		        this.numero = numero;
		    }

		    public String getNome() {
		        return nome;
		    }

		    public String getIdeologia() {
		        return ideologia;
		    }

		    public String getSigla() {
		        return sigla;
		    }

		    public String getNumero() {
		        return numero;
		 }
}
