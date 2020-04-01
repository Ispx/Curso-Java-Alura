package EstruturaDeDados.Vetor;

import java.util.Arrays;

public class Alunos {

    private String nome;
    private int totalDealunos = 0;
    private String[] vetor;;

    public Alunos(){
        vetor = new String[100];
    }

    public void setAluno(String nome){
        this.nome = nome;
    }

    private void redimencionaVetor(){
        String[] newVetor = new String[vetor.length];
        newVetor = vetor;
        vetor = new String[11];
        vetor = newVetor;

    }

    public boolean contemAluno(String aluno){

        for(String alunos : vetor){
            if (alunos.equalsIgnoreCase(aluno)){
                return true;
            }
        }
        return false;
    }

    public String pegaAluno(int posicao){
        return vetor[posicao];
    }


    public void adicionaAluno(Alunos aluno){
        if(totalDealunos > vetor.length){ throw new ArrayIndexOutOfBoundsException("Redimencionamos tamanho do Array, pois o Limite de alunos foi estourado!"); }
        vetor[totalDealunos] = aluno.nome;
        totalDealunos++;
    }

    public void removeAluno(int posicao){
        if(posicao > totalDealunos || posicao < 0){throw new IndexOutOfBoundsException("Posição invalida");}
        vetor[posicao] = null;
        while (posicao <= totalDealunos) {
            vetor[posicao] = vetor[++ posicao];
        }
    }

    public String getAlunos(){
        return Arrays.toString(vetor);
    }










}
