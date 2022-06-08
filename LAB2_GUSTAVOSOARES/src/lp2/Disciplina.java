/* Pacote onde est�o armazenadas todas as Classes do Projeto; */
package lp2;

import java.util.Arrays;

/**
 * @author Gustavo Soares - 121110455
 *
 * Classe que define e armazenas dados de uma determinada disciplina;
 * 
 */
public class Disciplina {
	/* Armazena o nome da disciplina */
	private String nomeDisciplina;
	/* Armazena as horas de estudo do aluno */
	private int horasEstudo;
	/* Armazena a quantidade de horas que foram armazenadas*/
	private int notas = 0;
	/* Armazena a soma dos valores das notas */
	private double valorNotas = 0;
	/* Armazena o n�mero de notas dado na fun��o, dado como base um valor muito maior do que � esperado que seja usado neste programa */
	private int numNotas = 999;
	/* Array para guardar todas as notas */
	private String[] notaLista = new String[numNotas];
	/* Array para armazenar os pesos das notas */
	private int[] pesos = new int[numNotas];
	/* Armazena a quantidade pesos */
	private int countPesos;
	/* Armazena o valor dos pesos vezes as notas */
	private double numeradorParcial;
	/* Armazena a soma dos pesos */
	private int denominadorParcial;
	/* Armazena o resultado final da nota */
	private double mediaFinal;
	
	/**
	 * Construtor que recebe o nome da disciplina;
	 * 
	 * @param nomeDisciplina
	 */
	public Disciplina (String nomeDisciplina) {
		/* Atualiza o nome da Disciplina com base no par�metro recebido */
		this.nomeDisciplina = nomeDisciplina;
		/* Define o n�mero de notas como padr�o pra 4 */
		numNotas = 4;
	}
	
	/**
	 * Construtor que recebe o nome da disciplina e o n�mero de notas dela;
	 * 
	 * @param nomeDisciplina
	 * @param numNotas
	 */
	public Disciplina (String nomeDisciplina, int numNotas) {
		/* Atualiza o nome da disciplina */
		this.nomeDisciplina = nomeDisciplina;
		/* Atualiza o n�mero de notas */
		this.numNotas = numNotas;
	}
	
	/**
	 * Contrutor que recebe o nome da disciplina, o n�mero de notas e um array com os pesos de cada nota;
	 * 
	 * @param nomeDisciplina
	 * @param numNotas
	 * @param array
	 */
	public Disciplina (String nomeDisciplina, int numNotas, int[] array) {
		/* Atualiza o nome da disciplina; */
		this.nomeDisciplina = nomeDisciplina;
		/* Atualiza o n�mero de notas; */
		this.numNotas = numNotas;
		/* Atualiza o array de pesos; */
		pesos = array;
		/* Faz uma verifica��o de quantas vezes foram adicionados arrays de pesos; */
		countPesos = 1;
	}
	
	/**
	 * Fun��o que n�o retorna nada e apenas atualiza o n�mero de horas de estudo com base no par�metro "horas";
	 * 
	 * @param horas
	 */
	public void cadastraHoras(int horas) {
		/* Atualiza a vari�vel horasEstudo; */
		horasEstudo += horas;
	}
	
	/**
	 * Fun��o sem retorno que atualiza o array notaLista com base nos par�mentros "nota" e "valorNota";
	 * 
	 * @param nota
	 * @param valorNota
	 */
	public void cadastraNota(int nota, double valorNota) {
		/* Atualiza��o da lista notaLista adicionando o par�metro "valorNota" */
		notaLista[nota-1] = Double.toString(valorNota);
		/* Somando 1 a cada vez que adiciona uma nota para ter uma vari�vel com a quantidade de notas; */
		notas ++;
		/* Verifica qual valor deve ser considerado como numero de notas, utilizando o maior deles; */
		if (notas <= numNotas) {
			/* Somando o valorNotas com o par�metro recebido */
			valorNotas += valorNota;
		} else {
			/* Atualizando notas com o valor de numNotas para ficar o maior valor entre os dois; */
			notas = numNotas;
		}
	}
	
	/**
	 * Fun��o que calcula caso o aluno � aprovado ou n�o;
	 * 
	 * @return Retornando true para aluno aprovado e false para reprovado;
	 */
	public boolean aprovado() {
		/* Caso ele identifique que um construtor com pesos foi invocado; */
		if (countPesos == 1) {
			/* La�o para calcular o numerador da m�dia final e denominador; */
			for (int i = 0; i < numNotas; i++) {
				/* Somando no numerador a multiplica��o dos pesos pelas notas; */
				numeradorParcial += pesos[i] * Double.parseDouble(notaLista[i]);
				/* Somando no denominador o valor dos pesos; */
				denominadorParcial += pesos[i];
			}
			/* Calculando a nota final dividindo o numerador geral pelo denominador; */
			mediaFinal = numeradorParcial / denominadorParcial;
		} /* Caso n�o tenha sido invocado o construtor com o array de pesos */ 
		else {
		/* Calcula a m�dia com base apenas na soma de notas e da quantidade de notas inseridas; */
		mediaFinal = valorNotas / notas;
	}
		/* Caso a nota final seja maior que que 7, retorna true; */
		if ((mediaFinal) >= 7) {
			return true;
		} /* Caso seja menor que 7, retorna false; */
		else {
			return false;
		}
}
	
	
	/**
	 * Fun��oq que retorna um relat�rio final com todos os dados da disciplina inserida;
	 * 
	 * @return 
	 */
	public String toString() {
		/* Cria um array para armazenar todas as notas de maneira formatada, sem espa�os com null; */
		String[] listaFormatada = new String[numNotas];
		/* La�o funcionando de acordo com o tamanho do numNotas para gerar um array do tamanho exato necess�rio; */
		for (int i = 0; i < numNotas; i++) {
			/* Atualizando os dados da lista formatada com os dados presentes em notaLista */
			listaFormatada[i] = notaLista[i];
		}
		return (nomeDisciplina + " " + horasEstudo + " " + Double.toString(mediaFinal) + " " + Arrays.toString(listaFormatada));
	}
}