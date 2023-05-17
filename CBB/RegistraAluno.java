public class RegistraAluno {
    
    public static void main(String[] args) {
        DadosAlunos aluno = new DadosAlunos();

        aluno.setAluno("Ilka", 15, "Rua das Carnaubas");
        aluno.setNota(8,4, 9);
        aluno.imprimi();
    }
}
