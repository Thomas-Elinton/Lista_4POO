

package Exercicio_3;


public class Funcionario {
    
    private String nome;
    private String matricula;
    private int salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String matricula, int salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }
    
    public String imprimir (){
        return "Nome:" + nome + "\n Matricula:" + matricula + "\n Salario:" + salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
}
