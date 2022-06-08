package lp2;

public class Testes {

	public static void main(String[] args) {
		AtividadesComplementares minhasAtividades = new AtividadesComplementares();
	       int horasEstagio = 350;
	       int mesesProjeto = 6;
	       double horasCurso = 40.5;
	       minhasAtividades.adicionarEstagio(horasEstagio);
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