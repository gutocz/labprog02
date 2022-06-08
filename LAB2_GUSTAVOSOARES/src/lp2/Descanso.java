/* Pacote onde est�o armazenadas todas as Classes do Projeto; */
package lp2;

/**
 * 
 * @author Gustavo da Silva Soares - 121110455;
 *
 * Declarando classe Descanso que � chamada para armazenar os dados de estado de cansa�o do aluno.
 * 
 */
public class Descanso {
	private int horasDescanso = 0; // Horas de descanso do aluno com dado inicial zerado;
	private int numeroSemanas = 1; // Numero de semanas de estudo do aluno com n�mero inicial sendo 1;
	private String emoji = ""; // Emoji inicial com seu valor vazio para uma p�s definic�o;
	private String estadoAluno = "cansado"; // Definindo o estado inicial como cansado por padr�o;
	
	
	/**
	 * Fun��o definirEmoji que recebe como par�metro "valor", atualizando assim, os dados na vari�vel "emoji";
	 * 
	 * @param valor
	 * 
	 */
	public void definirEmoji(String valor) { // Classe sem retorno pois � utilizada apenas para atualizar o valor de "emoji"
		emoji = " - " + valor; // Exemplifica��o da Formata��o quando um emoji � declarado: "cansado - :("
	}
	
	/**
	 * Fun��o para retorno final do estado do aluno, com ou sem emojis;
	 * 
	 * @return descansado + emoji ou cansado + emoji;
	 */
	public String getStatusGeral() {
		calculaEstado();
		return estadoAluno + emoji;
	}
	
	/**
	 * Fun��o que verifica se ocorreu alguma mudan�a do estado anterior do aluno para o atual;
	 * Caso haja mudan�a, reseta o valor do emoji para vazio;
	 * 
	 */
	public void verificaMudanca() { // Definindo a fun��o;
		/**
		 * Como esta fun��o est� sendo chamada em defineNumeroSemanas(), ja temos as vari�veis horasDescanso e numeroSemanas atualizadas,
		 * por�m o estado ainda n�o foi calculado, sendo assim, temos as vari�veis atualizadas e o estado desatualizado, ou o anterior;
		 * Com isto, ocorre uma compara��o se o estado desatualizado difere ou n�o do c�lculo das vari�veis atuais.
		 * 
		 */
		if (estadoAluno == "descansado" && horasDescanso / numeroSemanas < 26) { // Verifica��o se o estado atual difere do anteior;
			emoji = ""; // Resetando "emoji" caso sejam diferentes;
 		} else if (estadoAluno == "cansado" && horasDescanso / numeroSemanas >= 26) { // Verifica��o se o estado atual difere do anteior;
			emoji = ""; // Resetando "emoji" caso sejam diferentes;
		}
	}
	
	/**
	 * Fun��o que calcula o estado atual do aluno com base em suas horas de descanso e o numero de semanas;
	 * 
	 */
	
	public void calculaEstado() { // Invocando a fun��o sem par�mentros e retorno;
		if (horasDescanso / numeroSemanas >= 26) { // Realizando a m�dia de horas por semana;
			estadoAluno = "descansado"; // Atualizando o estado na vari�vel master;
		} else {
			estadoAluno = "cansado"; // Atualizando o estado na vari�vel master;
		}
	}
	
	/**
	 * Fun��o que armazena o n�mero de horas de descanso do aluno, armazenando o valor do par�metro na vari�vel master.
	 * 
	 * @param valor
	 */
	public void defineHorasDescanso(int valor) {
		horasDescanso = valor; // Redefinindo a vari�vel Master;
	}
	/**
	 * Fun��o que armazena o n�mero de semanas do aluno, armazenando o valor do par�metro na vari�vel master.
	 * 
	 * @param valor
	 */
	public void defineNumeroSemanas(int valor) {
		numeroSemanas = valor; // Redefinindo a vari�vel Master;
		verificaMudanca(); // Execu��o da verifica��o de mudan�as;
	}
}