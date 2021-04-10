
package Exercicio_3;


public class Consultor extends Funcionario{

    public Consultor() {
    }

    public Consultor(String nome, String matricula, int salario) {
        super(nome, matricula, salario);
    }

    @Override
    public String imprimir() {
        return super.imprimir(); 
    }

    @Override
    public void setSalario(int salario) {
        super.setSalario(salario); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSalario() {
        return super.getSalario() + super.getSalario() *0.1;
    }
    

    public double getSalario(float percentual) {
        return getSalario(percentual);
    }

    @Override
    public void setMatricula(String matricula) {
        super.setMatricula(matricula); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMatricula() {
        return super.getMatricula(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
