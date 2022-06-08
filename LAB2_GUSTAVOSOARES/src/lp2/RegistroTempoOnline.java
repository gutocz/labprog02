/* Pacote onde est�o armazenadas todas as Classes do Projeto; */
package lp2;

/**
 * @author Gustavo Soares - 121110455
 *
 * Classe que registra o tempo de estudo em uma disciplina e retorna se o tempo meta foi batido ou n�o;
 */
public class RegistroTempoOnline {
	/* Armazena o nome da disciplina; */
	private String nomeDisciplina;
	/* Armazena o n�mero de horas da disciplina; */
	private int horasDisciplina = 0;
	/* Armazena quantas horas s�o necess�rias para bater a meta da disciplina; */
	private int horasNecessarias = 120;
	
	/**
	 * Construtor que recebe apenas o nome da disciplina;
	 * 
	 * @param nomeDisciplina
	 */
	public RegistroTempoOnline(String nomeDisciplina) {
		/* Atualiza o nome da disciplina com base no par�mentro nomeDiciplina */
		this.nomeDisciplina = nomeDisciplina;
	}
	
	/**
	 * Construtor que recebe o nome da disciplina e o tempo esperado, no caso a meta;
	 * 
	 * @param nomeDisciplina
	 * @param tempoOnlineEsperado
	 */
	public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
		/* Atualiza o nome da disciplina com base no par�metro "nomeDisciplina"; */
		this.nomeDisciplina = nomeDisciplina;
		/* Atualiza a meta das horas com base no par�metro "tempoOnlineEsperado"; */
		horasNecessarias = tempoOnlineEsperado;
	}
	
	/**
	 * Fun��o sem retorno que recebe a quantidade de horas online do aluno;
	 * 
	 * @param tempo
	 */
	public void adicionaTempoOnline(int tempo) {
		/* Atualiza as horas online da disciplina com base no par�metro "tempo" */
		horasDisciplina += tempo;
	}
	
	/**
	 * Fun��o que retorna o nome da disciplina com o n�mero de horas estudadas pelo aluno junto com o n�mero que era esperava alcan�ar;
	 * 
	 * @return Resumo horas da disciplina;
	 */
	public String toString() {
		return(nomeDisciplina + " " + horasDisciplina + "/" + horasNecessarias);
	}
	
	/**
	 * Fun��o que verifica caso o aluno tenha atingido ou n�o a meta com base nas horas de estudo;
	 * 
	 * @return true caso esteja dentro da meta, false caso n�o;
	 */
	public boolean atingiuMetaTempoOnline() {
		/* Verificando caso seja maior ou igual a meta; */
		if(horasDisciplina >= horasNecessarias) {
			/* Caso seja maior ou igual, retorna que SIM a meta foi cumprida */
			return true;
		} else {
			/* Caso n�o, N�O foi cumprida */
			return false;
		}
	}
}