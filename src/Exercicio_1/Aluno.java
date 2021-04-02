
package Exercicio_1;


public class Aluno {
    
    String ra;
    String nome;
    String curso;

    public Aluno() {
    }

    public Aluno(String ra, String nome, String curso) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
    }
    
    public String imprimir(){
        return "RA:" + ra + "\n Nome:" + nome + "\n Curso:" + curso; 
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

   
    } 
    
    
