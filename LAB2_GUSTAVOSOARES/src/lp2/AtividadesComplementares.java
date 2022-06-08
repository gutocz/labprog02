/* Pacote onde est�o armazenadas todas as Classes do Projeto; */
package lp2;

/**
 * 
 * @author Gustavo Soares - 121110455 
 * Classe Atividades Complementares, que recebe e armazena Estagios, Projetos e cursos dos alunos, al�m de retornar
 * o total de cr�ditos de cada;
 *
 */
public class AtividadesComplementares {
	/* Horas Complementares de est�gio; */
	private int horasComplementares;
	/* Total de meses de dura��o do est�gio; */
	private int mesesEstagio = 4;
	/* Total de meses de dura��o do projeto; */
	private int mesesProjeto;
	/* Total de horas cursadas; */
	private double horasCurso;
	/* Resultado de cr�ditos de est�gio; */
	private int creditosEstagio;
	/* Resultado de cr�ditos de Projeto; */
	private int creditosProjeto;
	/* Resultado de cr�ditos de Curso; */
	private int creditosCurso;
	/* Vari�vel que conta a quantidade de estagios armazenados; */
	private int countEstagio;
	/* Vari�vel que conta a quantidade de Projetos armazenados; */
	private int countProjeto;
	/* Media da quantidade de horas de est�gio dividido por 300 (que s�o o n�mero de horas necess�rias para converter para 5 cr�ditos); */
	private double mediaEstagio;
	/* Media da quantidade de meses de est�gio dividido por 4 (que s�o o n�mero de meses necess�rias para converter para 5 cr�ditos); */
	private double mediaEstagioMeses;
	/* Media da quantidade de meses de projeto dividido por 3 (que s�o o n�mero de meses necess�rias para converter para 2 cr�ditos); */
	private double mediaProjeto;
	/* Media da quantidade de horas de curso dividido por 30 (que s�o o n�mero de meses necess�rias para converter para 1 cr�dito); */
	private double mediaCurso;
	/* Array para armazenar todos os est�gios; */
	private String[] listaEstagios = new String [9];
	/* Array para armazenar todos os projetos; */
	private String[] listaProjetos = new String [16];
	
	/**
	 * Fun��o sem retorrno, para adicionar os est�gios a listaEstagios, al�m de calcular a quantidades de cr�ditos de est�gio;
	 * 
	 * @param horas
	 */
	public void adicionarEstagio(int horas) {
		/* Adicionando 1 a cada vez que um est�gio for adicionado; */
		countEstagio ++;
		/* Executando um while para limitar o n�mero de atualiza��es no array; */
		while (true) {
			/* Caso o count seja maior que 9, ocorre um break. (9 pois � o n�mero m�ximo de Est�gios que podem ser adicionados); */
			if (countEstagio > 9) {
				break;
			} /* Caso seja menor ou igual a 9; */ 
			else {
				/* Atualizando a vari�vel horasComplementares com o par�metro "horas"; */
				horasComplementares = horas;
				/* Atualizando a lista com a quantidade de horas e meses daquele est�gio; */
				listaEstagios[countEstagio - 1] = "Estagio " + horas + " " + mesesEstagio;
				/* Calculando a m�dia de horas do est�gio; */
				mediaEstagio = horasComplementares / 300;
				/* Calculando a m�dia de meses do est�gio; */
				mediaEstagioMeses = mesesEstagio / 4;
				/* Verifica se o inteiro de cada m�dia (o inteiro para realizar um truncamento) � igual; */
				if ((int) mediaEstagioMeses == (int) mediaEstagio) {
					/* Caso seja igual, qualquer uma das m�dias pode ser usada para atribuir os cr�ditos; */
					creditosEstagio += ((int) mediaEstagio) * 5; 
				} /* Caso a media de meses seja maior, � utilizada a m�dia de horas para a atribui��o dos cr�ditos; */ 
				else if ((int) mediaEstagioMeses > (int) mediaEstagio) {
					/* Atribuindo os cr�ditos; */
					creditosEstagio += (int) mediaEstagio * 5;
				} /* Ultimo caso, onde media de horas � maior, logo a menor m�dia � usada novamente; */
				else {
					/* Atribuindo os cr�ditos; */
					creditosEstagio += (int) mediaEstagioMeses * 5;
				}
				/* O while realiza um break no final do calculo de cada est�gio para que possa ser executado novamente, ou n�o, a depender do usu�rio; */
				break;
			}
		}
	}
	
	/**
	 * Fun��o sem retorrno, para adicionar os est�gios e meses a listaEstagios, al�m de calcular a quantidades de cr�ditos de est�gio;
	 * 
	 * 
	 * @param horas
	 * @param meses
	 */
	public void adicionarEstagio(int horas, int meses) {
		/* Realizando a contagem de quantos est�gios s�o adicionados; */
		countEstagio ++;
		/* Executando um while para limitar o n�mero de atualiza��es no array; */
		while (true) {
			/* Caso o count seja maior que 9, ocorre um break. (9 pois � o n�mero m�ximo de Est�gios que podem ser adicionados); */
			if (countEstagio > 9) {
				break;
			} /* Caso seja menor ou igual a 9; */ 
			else {
				/* Atualizando a vari�vel horasComplementares com o par�metro "horas"; */
				horasComplementares = horas;
				/* Atualizando a vari�vel mesesEst�gio com o par�metro "meses"; */
				mesesEstagio = meses;
				/* Armazenando cada Est�gio no array listaEstagios; */
				listaEstagios[countEstagio - 1] = "Estagio " + horas + " " + meses;
				/* Calculando a m�dia de horas do est�gio; */
				mediaEstagio = horasComplementares / 300;
				/* Calculando a m�dia de meses do est�gio; */
				mediaEstagioMeses = meses / 4;
				/* Verifica se o inteiro de cada m�dia (o inteiro para realizar um truncamento) � igual; */
				if ((int) mediaEstagioMeses == (int) mediaEstagio) {
					/* Caso seja igual, qualquer uma das m�dias pode ser usada para atribuir os cr�ditos; */
					creditosEstagio += ((int) mediaEstagio) * 5;
				} /* Caso a media de meses seja maior, � utilizada a m�dia de horas para a atribui��o dos cr�ditos; */
				else if ((int) mediaEstagioMeses > (int) mediaEstagio) {
					/* Atribuindo os cr�ditos; */
					creditosEstagio += (int) mediaEstagio * 5;
				} /* Ultimo caso, onde media de horas � maior, logo a menor m�dia � usada novamente; */ 
				else {
					/* Atribuindo os cr�ditos; */
					creditosEstagio += (int) mediaEstagioMeses * 5;
				}
				/* O while realiza um break no final do calculo de cada est�gio para que possa ser executado novamente, ou n�o, a depender do usu�rio; */
				break;
			}
		}
	}
	/**
	 * Fun��o sem retorno para adicionar projetos e calcular sua quantidade de cr�ditos, recebendo a quantidade de meses como par�metro;
	 * 
	 * @param meses
	 */
	public void adicionarProjeto(int meses) {
		/* Contando a quantidade de Projetos adicionados; */
		countProjeto ++;
		/* Executando um while para preencher toda a lista de Projetos; */
		while (true) {
			/* Caso o n�mero de projetos supere 16,� realizado um break, j� que excede o limite de projetos permitidos; */
			if (countProjeto > 16) {
				break;
			} /* Caso a quantidade seja menor ou igual a 16, execute; */
			else {
				/* Atualizando a vari�vel mesesProjeto com o par�metro meses; */
				mesesProjeto = meses;
				/* Adicionando o projeto e sua quantidade de meses no Array; */
				listaProjetos[countProjeto - 1] = "Projeto " + meses;
				/* Calcula a m�dia de projetos com base no n�mero de projetos que � necess�rio para conseguir 2 cr�ditos; */
				mediaProjeto = mesesProjeto / 3;
				/* Calcula a quantidade de cr�ditos, usando o int para realizar um truncamento; */
				creditosProjeto += (int) mediaProjeto * 2;
				/* O while realiza um break no final do calculo de cada est�gio para que possa ser executado novamente, ou n�o, a depender do usu�rio; */
				break;
			}
		}
	}
	/**
	 * Fun��o que recebe o n�mero de horas de cursos e calcula a quantidade de cr�ditos al�m de armazenar as horas de curso;
	 * 
	 * @param horas
	 */
	public void adicionarCurso(double horas) {
		/* Atualizando horasCurso com base no par�metro "horas" */
		horasCurso += horas;
		/* Calculando a media de curso com base na quantidade de horas de curso que s�o necess�rias para 1 cr�dito */
		mediaCurso = horasCurso / 30;
		/* Calculando a quantidade de cr�ditos (com o valor de m�dia truncado) */
		creditosCurso = (int) mediaCurso * 1;
	}
	
	/**
	 * Fun��o que retorna a soma de todos os cr�ditos;
	 * 
	 * @return Soma de todos os cr�ditos;
	 */
	public int contaCreditos() {
		return creditosEstagio + creditosProjeto + creditosCurso;
	}
	
	/**
	 * Fun��o que formata os arrays criados anteriormente para que n�o sobre nenhum espa�o null, e finaliza juntando em uma lista
	 * com os dados dos cursos que n�o tinham uma lista pr�pria, tendo em vista que cursos todos os cursos eram somados como 1 s�;
	 * 
	 * @return Array com todas as atividades
	 */
	public String[] pegaAtividades() {
		/* Criando um array para armazenar os dados de estagio e projeto */
		String [] listaFormatada = new String[countEstagio + countProjeto];
		/* Criando for para atualizar  */
		for (int i = 0; i < listaFormatada.length; i++) {
			/* Atualizando termos de listaFormatada com os dados de Estagio */
			listaFormatada[i] = listaEstagios[i];
			/* Verificando se o indice � maior ou igual a quantidade de Estagio para atualizar depois dos termos de Estagio com os termos de Projetos*/
			if (i >= countEstagio) {
				/* Atualizando termos de listaFormatada com os dados de Projeto */
				listaFormatada[i] = listaProjetos[i - countEstagio];
			}
		}
		/* Criando o array final com o tamanho de listaFormatada + 4 para incluir os dados de cursos */
		String[] arrayAtividades = new String[listaFormatada.length + 4];
		/* Atualizando o array final com os dados de listaFormatada */
		for (int i = 0; i < listaFormatada.length; i++) {
			arrayAtividades[i] = listaFormatada[i];
		}
		/* Adicionando dados de cursos */
		arrayAtividades[arrayAtividades.length - 4] = ("Cursos " + horasCurso);
		/* Adicionando dados de cursos */
		arrayAtividades[arrayAtividades.length - 3] = ("Creditos_Estagio " + creditosEstagio);
		/* Adicionando dados de cursos */
		arrayAtividades[arrayAtividades.length - 2] = ("Creditos_Projeto " + creditosProjeto);
		/* Adicionando dados de cursos */
		arrayAtividades[arrayAtividades.length - 1] = ("Creditos_Cursos " + creditosCurso);
		
		return arrayAtividades;
	}
}