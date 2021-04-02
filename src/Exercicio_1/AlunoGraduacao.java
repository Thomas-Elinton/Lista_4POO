
package Exercicio_1;


public class AlunoGraduacao extends Aluno{
 
    private String anoConclusaoEnsinoMedio;

    public AlunoGraduacao() {
    }

    public AlunoGraduacao(String anoConclusaoEnsinoMedio, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    @Override
    public String imprimir() {
        return "----GRADUAÇÃO---- \n" + "Ano Conclusão Ensino Médio\n" + anoConclusaoEnsinoMedio + "\n" + super.imprimir(); 
    }

    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }

    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }
    
   

    
}