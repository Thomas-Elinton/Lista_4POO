
package Exercicio_1;


public class AlunoPosGraduacao extends Aluno{
    
    private String anoConclusaoGrad;

    public AlunoPosGraduacao() {
    }

    public AlunoPosGraduacao(String anoConclusaoGrad, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusaoGrad = anoConclusaoGrad;
    }

    @Override
    public String imprimir() {
        return "\n----POS-GRADUAÇÃO---- \n" + "Ano Conclusão Graduação:\n" + anoConclusaoGrad + "\n" + super.imprimir(); 
    }

    public String getAnoConclusaoGrad() {
        return anoConclusaoGrad;
    }

    public void setAnoConclusaoGrad(String anoConclusaoGrad) {
        this.anoConclusaoGrad = anoConclusaoGrad;
    }
    
    
}
  