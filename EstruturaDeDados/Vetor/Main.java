package EstruturaDeDados.Vetor;

public class Main {

    public static void main(String... args){


        Alunos aluno = new Alunos();

        aluno.setAluno("Isaque");
        aluno.adicionaAluno(aluno);
        aluno.setAluno("Maria");
        aluno.adicionaAluno(aluno);
        aluno.setAluno("Joana");
        aluno.adicionaAluno(aluno);
        aluno.setAluno("Pedro");
        aluno.adicionaAluno(aluno);
        aluno.setAluno("Vitor");
        aluno.adicionaAluno(aluno);


        System.out.println(aluno.getAlunos());

        aluno.removeAluno(2);
        System.out.println(aluno.getAlunos());



        aluno.removeAluno(3);
        System.out.println(aluno.getAlunos());

    }
}
