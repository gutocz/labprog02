/* Pacote onde estão armazenadas todas as Classes do Projeto; */
package lp2;

/**
 * 
 * @author Gustavo da Silva Soares - 121110455;
 *
 * Declarando classe Descanso que é chamada para armazenar os dados de estado de cansaço do aluno.
 * 
 */
public class Descanso {
	private int horasDescanso = 0; // Horas de descanso do aluno com dado inicial zerado;
	private int numeroSemanas = 1; // Numero de semanas de estudo do aluno com número inicial sendo 1;
	private String emoji = ""; // Emoji inicial com seu valor vazio para uma pós definicão;
	private String estadoAluno = "cansado"; // Definindo o estado inicial como cansado por padrão;
	
	
	/**
	 * Função definirEmoji que recebe como parâmetro "valor", atualizando assim, os dados na variável "emoji";
	 * 
	 * @param valor
	 * 
	 */
	public void definirEmoji(String valor) { // Classe sem retorno pois é utilizada apenas para atualizar o valor de "emoji"
		emoji = " - " + valor; // Exemplificação da Formatação quando um emoji é declarado: "cansado - :("
	}
	
	/**
	 * Função para retorno final do estado do aluno, com ou sem emojis;
	 * 
	 * @return descansado + emoji ou cansado + emoji;
	 */
	public String getStatusGeral() {
		calculaEstado();
		return estadoAluno + emoji;
	}
	
	/**
	 * Função que verifica se ocorreu alguma mudança do estado anterior do aluno para o atual;
	 * Caso haja mudança, reseta o valor do emoji para vazio;
	 * 
	 */
	public void verificaMudanca() { // Definindo a função;
		/**
		 * Como esta função está sendo chamada em defineNumeroSemanas(), ja temos as variáveis horasDescanso e numeroSemanas atualizadas,
		 * porém o estado ainda não foi calculado, sendo assim, temos as variáveis atualizadas e o estado desatualizado, ou o anterior;
		 * Com isto, ocorre uma comparação se o estado desatualizado difere ou não do cálculo das variáveis atuais.
		 * 
		 */
		if (estadoAluno == "descansado" && horasDescanso / numeroSemanas < 26) { // Verificação se o estado atual difere do anteior;
			emoji = ""; // Resetando "emoji" caso sejam diferentes;
 		} else if (estadoAluno == "cansado" && horasDescanso / numeroSemanas >= 26) { // Verificação se o estado atual difere do anteior;
			emoji = ""; // Resetando "emoji" caso sejam diferentes;
		}
	}
	
	/**
	 * Função que calcula o estado atual do aluno com base em suas horas de descanso e o numero de semanas;
	 * 
	 */
	
	public void calculaEstado() { // Invocando a função sem parâmentros e retorno;
		if (horasDescanso / numeroSemanas >= 26) { // Realizando a média de horas por semana;
			estadoAluno = "descansado"; // Atualizando o estado na variável master;
		} else {
			estadoAluno = "cansado"; // Atualizando o estado na variável master;
		}
	}
	
	/**
	 * Função que armazena o número de horas de descanso do aluno, armazenando o valor do parâmetro na variável master.
	 * 
	 * @param valor
	 */
	public void defineHorasDescanso(int valor) {
		horasDescanso = valor; // Redefinindo a variável Master;
	}
	/**
	 * Função que armazena o número de semanas do aluno, armazenando o valor do parâmetro na variável master.
	 * 
	 * @param valor
	 */
	public void defineNumeroSemanas(int valor) {
		numeroSemanas = valor; // Redefinindo a variável Master;
		verificaMudanca(); // Execução da verificação de mudanças;
	}
}