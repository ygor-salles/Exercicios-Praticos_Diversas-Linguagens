
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Disciplina disc1 = new Disciplina("Programacao OO", 64);
        Disciplina disc2 = new Disciplina("Estruturas de Dados", 64);
        Disciplina disc3 = new Disciplina("Banco de Dados", 64);
        
        ArrayList<Disciplina> listaDisc1 = new ArrayList();
        ArrayList<Disciplina> listaDisc2 = new ArrayList();
        
        listaDisc1.add(disc1);
        listaDisc1.add(disc2);
        listaDisc2.add(disc2);
        listaDisc2.add(disc3);
        
        Professor prof = new Professor("Joao", "Av. BPS, 1303", 33, "doutorado", listaDisc1);
        prof.printDescricao();
        System.out.println();
        Aluno aluno = new Aluno("Pedro", "Av. Cesario Alvin, 234", 20, "SIN", listaDisc2);
        aluno.printDescricao();
    }
}
