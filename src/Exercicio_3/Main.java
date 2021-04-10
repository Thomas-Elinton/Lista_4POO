
package Exercicio_3;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Main {
    
    public static void main(String[] args) {
    
    int salario, opc =0, tipo;
    String nome, matricula;
    
    ArrayList <Funcionario> listFuncionario = new ArrayList<>();
    
    while (opc !=3){
     
    opc = Integer.parseInt(JOptionPane.showInputDialog("1-Criar Funcionario \n 2-Mostar Funcionario \n3- Sair"));
    
    switch (opc){
        case 1:
            nome = JOptionPane.showInputDialog("Nome:");
            matricula = JOptionPane.showInputDialog("Matricula:");  
            tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo 1-Funcionario \n 2-Consultor"));
            if(tipo ==1){
                salario = Integer.parseInt(JOptionPane.showInputDialog("Salario:"));
                listFuncionario.add(new Funcionario(nome, matricula, salario));
            }else{
                salario = Integer.parseInt(JOptionPane.showInputDialog("Salario:"));
                listFuncionario.add (new Consultor(nome, matricula, salario));
            }
            break;
        case 2:
            String msg = "";
            for(Funcionario f : listFuncionario){
                msg += f.imprimir() + "\n\n";
                 
            }
            JOptionPane.showMessageDialog(null, msg);
            
            break;
        case 3: break;
    }
}
    
    
}
}
