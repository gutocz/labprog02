/* Pacote onde estão armazenadas todas as Classes do Projeto; */
package lp2;

/**
 * 
 * @author Gustavo Soares - 121110455 
 * Classe Atividades Complementares, que recebe e armazena Estagios, Projetos e cursos dos alunos, além de retornar
 * o total de créditos de cada;
 *
 */
public class AtividadesComplementares {
	/* Horas Complementares de estágio; */
	private int horasComplementares;
	/* Total de meses de duração do estágio; */
	private int mesesEstagio = 4;
	/* Total de meses de duração do projeto; */
	private int mesesProjeto;
	/* Total de horas cursadas; */
	private double horasCurso;
	/* Resultado de créditos de estágio; */
	private int creditosEstagio;
	/* Resultado de créditos de Projeto; */
	private int creditosProjeto;
	/* Resultado de créditos de Curso; */
	private int creditosCurso;
	/* Variável que conta a quantidade de estagios armazenados; */
	private int countEstagio;
	/* Variável que conta a quantidade de Projetos armazenados; */
	private int countProjeto;
	/* Media da quantidade de horas de estágio dividido por 300 (que são o número de horas necessárias para converter para 5 créditos); */
	private double mediaEstagio;
	/* Media da quantidade de meses de estágio dividido por 4 (que são o número de meses necessárias para converter para 5 créditos); */
	private double mediaEstagioMeses;
	/* Media da quantidade de meses de projeto dividido por 3 (que são o número de meses necessárias para converter para 2 créditos); */
	private double mediaProjeto;
	/* Media da quantidade de horas de curso dividido por 30 (que são o número de meses necessárias para converter para 1 crédito); */
	private double mediaCurso;
	/* Array para armazenar todos os estágios; */
	private String[] listaEstagios = new String [9];
	/* Array para armazenar todos os projetos; */
	private String[] listaProjetos = new String [16];
	
	/**
	 * Função sem retorrno, para adicionar os estágios a listaEstagios, além de calcular a quantidades de créditos de estágio;
	 * 
	 * @param horas
	 */
	public void adicionarEstagio(int horas) {
		/* Adicionando 1 a cada vez que um estágio for adicionado; */
		countEstagio ++;
		/* Executando um while para limitar o número de atualizações no array; */
		while (true) {
			/* Caso o count seja maior que 9, ocorre um break. (9 pois é o número máximo de Estágios que podem ser adicionados); */
			if (countEstagio > 9) {
				break;
			} /* Caso seja menor ou igual a 9; */ 
			else {
				/* Atualizando a variável horasComplementares com o parâmetro "horas"; */
				horasComplementares = horas;
				/* Atualizando a lista com a quantidade de horas e meses daquele estágio; */
				listaEstagios[countEstagio - 1] = "Estagio " + horas + " " + mesesEstagio;
				/* Calculando a média de horas do estágio; */
				mediaEstagio = horasComplementares / 300;
				/* Calculando a média de meses do estágio; */
				mediaEstagioMeses = mesesEstagio / 4;
				/* Verifica se o inteiro de cada média (o inteiro para realizar um truncamento) é igual; */
				if ((int) mediaEstagioMeses == (int) mediaEstagio) {
					/* Caso seja igual, qualquer uma das médias pode ser usada para atribuir os créditos; */
					creditosEstagio += ((int) mediaEstagio) * 5; 
				} /* Caso a media de meses seja maior, é utilizada a média de horas para a atribuição dos créditos; */ 
				else if ((int) mediaEstagioMeses > (int) mediaEstagio) {
					/* Atribuindo os créditos; */
					creditosEstagio += (int) mediaEstagio * 5;
				} /* Ultimo caso, onde media de horas é maior, logo a menor média é usada novamente; */
				else {
					/* Atribuindo os créditos; */
					creditosEstagio += (int) mediaEstagioMeses * 5;
				}
				/* O while realiza um break no final do calculo de cada estágio para que possa ser executado novamente, ou não, a depender do usuário; */
				break;
			}
		}
	}
	
	/**
	 * Função sem retorrno, para adicionar os estágios e meses a listaEstagios, além de calcular a quantidades de créditos de estágio;
	 * 
	 * 
	 * @param horas
	 * @param meses
	 */
	public void adicionarEstagio(int horas, int meses) {
		/* Realizando a contagem de quantos estágios são adicionados; */
		countEstagio ++;
		/* Executando um while para limitar o número de atualizações no array; */
		while (true) {
			/* Caso o count seja maior que 9, ocorre um break. (9 pois é o número máximo de Estágios que podem ser adicionados); */
			if (countEstagio > 9) {
				break;
			} /* Caso seja menor ou igual a 9; */ 
			else {
				/* Atualizando a variável horasComplementares com o parâmetro "horas"; */
				horasComplementares = horas;
				/* Atualizando a variável mesesEstágio com o parâmetro "meses"; */
				mesesEstagio = meses;
				/* Armazenando cada Estágio no array listaEstagios; */
				listaEstagios[countEstagio - 1] = "Estagio " + horas + " " + meses;
				/* Calculando a média de horas do estágio; */
				mediaEstagio = horasComplementares / 300;
				/* Calculando a média de meses do estágio; */
				mediaEstagioMeses = meses / 4;
				/* Verifica se o inteiro de cada média (o inteiro para realizar um truncamento) é igual; */
				if ((int) mediaEstagioMeses == (int) mediaEstagio) {
					/* Caso seja igual, qualquer uma das médias pode ser usada para atribuir os créditos; */
					creditosEstagio += ((int) mediaEstagio) * 5;
				} /* Caso a media de meses seja maior, é utilizada a média de horas para a atribuição dos créditos; */
				else if ((int) mediaEstagioMeses > (int) mediaEstagio) {
					/* Atribuindo os créditos; */
					creditosEstagio += (int) mediaEstagio * 5;
				} /* Ultimo caso, onde media de horas é maior, logo a menor média é usada novamente; */ 
				else {
					/* Atribuindo os créditos; */
					creditosEstagio += (int) mediaEstagioMeses * 5;
				}
				/* O while realiza um break no final do calculo de cada estágio para que possa ser executado novamente, ou não, a depender do usuário; */
				break;
			}
		}
	}
	/**
	 * Função sem retorno para adicionar projetos e calcular sua quantidade de créditos, recebendo a quantidade de meses como parâmetro;
	 * 
	 * @param meses
	 */
	public void adicionarProjeto(int meses) {
		/* Contando a quantidade de Projetos adicionados; */
		countProjeto ++;
		/* Executando um while para preencher toda a lista de Projetos; */
		while (true) {
			/* Caso o número de projetos supere 16,é realizado um break, já que excede o limite de projetos permitidos; */
			if (countProjeto > 16) {
				break;
			} /* Caso a quantidade seja menor ou igual a 16, execute; */
			else {
				/* Atualizando a variável mesesProjeto com o parãmetro meses; */
				mesesProjeto = meses;
				/* Adicionando o projeto e sua quantidade de meses no Array; */
				listaProjetos[countProjeto - 1] = "Projeto " + meses;
				/* Calcula a média de projetos com base no número de projetos que é necessário para conseguir 2 créditos; */
				mediaProjeto = mesesProjeto / 3;
				/* Calcula a quantidade de créditos, usando o int para realizar um truncamento; */
				creditosProjeto += (int) mediaProjeto * 2;
				/* O while realiza um break no final do calculo de cada estágio para que possa ser executado novamente, ou não, a depender do usuário; */
				break;
			}
		}
	}
	/**
	 * Função que recebe o número de horas de cursos e calcula a quantidade de créditos além de armazenar as horas de curso;
	 * 
	 * @param horas
	 */
	public void adicionarCurso(double horas) {
		/* Atualizando horasCurso com base no parâmetro "horas" */
		horasCurso += horas;
		/* Calculando a media de curso com base na quantidade de horas de curso que são necessárias para 1 crédito */
		mediaCurso = horasCurso / 30;
		/* Calculando a quantidade de créditos (com o valor de média truncado) */
		creditosCurso = (int) mediaCurso * 1;
	}
	
	/**
	 * Função que retorna a soma de todos os créditos;
	 * 
	 * @return Soma de todos os créditos;
	 */
	public int contaCreditos() {
		return creditosEstagio + creditosProjeto + creditosCurso;
	}
	
	/**
	 * Função que formata os arrays criados anteriormente para que não sobre nenhum espaço null, e finaliza juntando em uma lista
	 * com os dados dos cursos que não tinham uma lista própria, tendo em vista que cursos todos os cursos eram somados como 1 só;
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
			/* Verificando se o indice é maior ou igual a quantidade de Estagio para atualizar depois dos termos de Estagio com os termos de Projetos*/
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