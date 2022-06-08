package lp2;


public class CoisaBonus {
	   public static void main(String[] args) {
	       descanso();
	       System.out.println("-----");
	       registroOnline();
	       System.out.println("-----");
	       disciplina();
	       System.out.println("-----");
	       atividadesComplementares();
	   }
	   public static void descanso() {
		   Descanso descanso = new Descanso();
		   descanso.definirEmoji("xD");
	       System.out.println(descanso.getStatusGeral());
	       descanso.defineHorasDescanso(30);
	       descanso.defineNumeroSemanas(1);
		   descanso.definirEmoji("s2");
	       System.out.println(descanso.getStatusGeral());
	       descanso.defineHorasDescanso(26);
	       descanso.defineNumeroSemanas(1);
	       System.out.println(descanso.getStatusGeral());
	       descanso.defineHorasDescanso(26);
	       descanso.defineNumeroSemanas(2);
	       System.out.println(descanso.getStatusGeral());
	   }
	   private static void registroOnline() {
		   RegistroTempoOnline tempoLP2 = new RegistroTempoOnline("LP2", 30);
	       tempoLP2.adicionaTempoOnline(10);
	       System.out.println(tempoLP2.atingiuMetaTempoOnline());
	       tempoLP2.adicionaTempoOnline(10);
	       tempoLP2.adicionaTempoOnline(10);
	       System.out.println(tempoLP2.atingiuMetaTempoOnline());
	       tempoLP2.adicionaTempoOnline(2);
	       System.out.println(tempoLP2.atingiuMetaTempoOnline());
	       System.out.println(tempoLP2.toString());
	       RegistroTempoOnline tempoP2 = new RegistroTempoOnline("P2");
	       System.out.println(tempoP2.toString());
	   }
	   
	   private static void disciplina() {
		   Disciplina prog2 = new Disciplina("PROGRAMACAO 2");
		   prog2.cadastraHoras(4);
	       prog2.cadastraNota(1, 5.0);
	       prog2.cadastraNota(2, 6.0);
	       prog2.cadastraNota(3, 7.0);
	       System.out.println(prog2.aprovado());
	       prog2.cadastraNota(4, 10.0);
	       System.out.println(prog2.aprovado());
	       System.out.println(prog2.toString());
	       Disciplina labprog2 = new Disciplina("LABPROG 2", 3);
	       labprog2.cadastraHoras(6);
	       labprog2.cadastraNota(1, 7);
	       labprog2.cadastraNota(2, 8);
	       labprog2.cadastraNota(3, 6);
	       System.out.println(labprog2.aprovado());
	       System.out.println(labprog2.toString());
	       Disciplina calculo = new Disciplina("CALCULO", 4, new int[] {4, 2, 2, 2});
	       calculo.cadastraHoras(8);
	       calculo.cadastraNota(1, 9);
	       calculo.cadastraNota(2, 7);
	       calculo.cadastraNota(3, 6);
	       calculo.cadastraNota(4, 5);
	       System.out.println(calculo.aprovado());
	       System.out.println(calculo.toString());
	       
	   }
	   private static void atividadesComplementares() {
		   AtividadesComplementares minhasAtividades = new AtividadesComplementares();
	       int horasEstagio = 650;
	       int mesesProjeto = 6;
	       double horasCurso = 40.5;
	       minhasAtividades.adicionarEstagio(horasEstagio, 4);
	       minhasAtividades.adicionarProjeto(mesesProjeto);
	       minhasAtividades.adicionarCurso(horasCurso);
	       String[] atividades = minhasAtividades.pegaAtividades();
	       for (int i = 0; i < atividades.length; i++) {
	           System.out.println(minhasAtividades.pegaAtividades()[i]);
	       }
	       System.out.println(minhasAtividades.contaCreditos());
	 
	       double horasOutroCurso = 49.5;
	       int mesesOutroProjeto = 7;
	 
	       minhasAtividades.adicionarProjeto(mesesOutroProjeto);
	       minhasAtividades.adicionarCurso(horasOutroCurso);
	      
	       atividades = minhasAtividades.pegaAtividades();
	       for (int i = 0; i < atividades.length; i++) {
	           System.out.println(minhasAtividades.pegaAtividades()[i]);
	       }
	       System.out.println(minhasAtividades.contaCreditos());
	   }
}