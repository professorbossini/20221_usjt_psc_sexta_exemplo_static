import javax.swing.JOptionPane;

import static java.lang.Integer.parseInt;

public class TesteAluno {
    public static void main(String[] args) {

        int n = parseInt("2");
        
        double d = Double.parseDouble("2.5");

        String s = JOptionPane.showInputDialog("Digite algo");

        

        Aluno a = new Aluno();
        a.nome = "José";

        a.exibirNome();

        Aluno.exibirNome();


        // System.out.println(Aluno.instituicao);
        // Aluno a1 = new Aluno();
        // Aluno a2 = new Aluno();

        // a1.nome = "Pedro";
        // a1.idade = 22;
        // Aluno.instituicao = "UJST";
        // System.out.println(Aluno.instituicao);

        // a2.nome = "José";
        // a2.idade = 34;
        // Aluno.instituicao = "USJT";
        // System.out.println(Aluno.instituicao);

        // Aluno.instituicao = "USJT-Mooca";

        // System.out.println(Aluno.instituicao);

    }
}
