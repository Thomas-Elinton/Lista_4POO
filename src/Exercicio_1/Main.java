
package Exercicio_1;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Main {

   
    public static void main(String[] args) {
        
        int opc = 0;
        int tipo;
        String ano;
        String nome;
        String ra;
        String curso;  
        ArrayList<Aluno> listAluno =  new ArrayList <>();
        
        while (opc !=3){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1-Inserir Aluno\n 2- Exibir Aluno \n"
                    + "3- Sair"));            
           
            switch (opc){
                case 1 : 
                    tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de curso (1-Grad / 2-Pos"));
                    if(tipo == 1){
     
                    nome = JOptionPane.showInputDialog("Nome");
                    ra = JOptionPane.showInputDialog("RA");
                    curso = JOptionPane.showInputDialog("Curso"); 
                    ano = JOptionPane.showInputDialog("Ano de Conclusão do ensino Médio");
                    listAluno.add(new AlunoGraduacao(ano, ra, nome, curso));
                    continue;
                    }
                    nome = JOptionPane.showInputDialog("Nome");
                    ra = JOptionPane.showInputDialog("RA");
                    curso = JOptionPane.showInputDialog("Curso"); 
                    ano = JOptionPane.showInputDialog("Ano de Conclusão Graduação");
                    listAluno.add(new AlunoPosGraduacao(ano, ra, nome, curso));
                    break; 
                case 2 : 
                    String msg = "";
                    for(Aluno a: listAluno){
                        msg += a.imprimir();
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 3 : break;
                default : break;
            }
        }
        
    }  
        
    }
    

