package estudos.repeticao;

public class ForArrays {
    public static void main(String[] args) {
        String alunos[] = {"Danilo", "Joao", "Maria", "Marcos"};
        
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno do indice " + i + " é " + alunos[i]);
        }

        //forEach -> para cada aluno em alunos
        for (String aluno : alunos) {   
            System.out.println("Nome do aluno é: " + aluno);
        }
    } 
}
