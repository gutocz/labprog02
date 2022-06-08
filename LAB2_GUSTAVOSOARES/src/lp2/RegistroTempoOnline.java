/* Pacote onde estão armazenadas todas as Classes do Projeto; */
package lp2;

/**
 * @author Gustavo Soares - 121110455
 *
 * Classe que registra o tempo de estudo em uma disciplina e retorna se o tempo meta foi batido ou não;
 */
public class RegistroTempoOnline {
	/* Armazena o nome da disciplina; */
	private String nomeDisciplina;
	/* Armazena o número de horas da disciplina; */
	private int horasDisciplina = 0;
	/* Armazena quantas horas são necessárias para bater a meta da disciplina; */
	private int horasNecessarias = 120;
	
	/**
	 * Construtor que recebe apenas o nome da disciplina;
	 * 
	 * @param nomeDisciplina
	 */
	public RegistroTempoOnline(String nomeDisciplina) {
		/* Atualiza o nome da disciplina com base no parâmentro nomeDiciplina */
		this.nomeDisciplina = nomeDisciplina;
	}
	
	/**
	 * Construtor que recebe o nome da disciplina e o tempo esperado, no caso a meta;
	 * 
	 * @param nomeDisciplina
	 * @param tempoOnlineEsperado
	 */
	public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
		/* Atualiza o nome da disciplina com base no parâmetro "nomeDisciplina"; */
		this.nomeDisciplina = nomeDisciplina;
		/* Atualiza a meta das horas com base no parâmetro "tempoOnlineEsperado"; */
		horasNecessarias = tempoOnlineEsperado;
	}
	
	/**
	 * Função sem retorno que recebe a quantidade de horas online do aluno;
	 * 
	 * @param tempo
	 */
	public void adicionaTempoOnline(int tempo) {
		/* Atualiza as horas online da disciplina com base no parâmetro "tempo" */
		horasDisciplina += tempo;
	}
	
	/**
	 * Função que retorna o nome da disciplina com o número de horas estudadas pelo aluno junto com o número que era esperava alcançar;
	 * 
	 * @return Resumo horas da disciplina;
	 */
	public String toString() {
		return(nomeDisciplina + " " + horasDisciplina + "/" + horasNecessarias);
	}
	
	/**
	 * Função que verifica caso o aluno tenha atingido ou não a meta com base nas horas de estudo;
	 * 
	 * @return true caso esteja dentro da meta, false caso não;
	 */
	public boolean atingiuMetaTempoOnline() {
		/* Verificando caso seja maior ou igual a meta; */
		if(horasDisciplina >= horasNecessarias) {
			/* Caso seja maior ou igual, retorna que SIM a meta foi cumprida */
			return true;
		} else {
			/* Caso não, NÃO foi cumprida */
			return false;
		}
	}
}