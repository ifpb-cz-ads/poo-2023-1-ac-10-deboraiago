/**
 * RegistraAluno02
 */
public class AppRegistraAluno02 {

    public static void main(String[] args) {
        DadosAlunos aluno = new DadosAlunos();
        aluno.setAluno("Joao", 10, "Sousa 1");

        int Nota1 = aluno.getNota1();
        int Nota2 = aluno.getNota2();
        int Nota3 = aluno.getNota3();
        aluno.setNota(98, 70, 88);
        aluno.imprimi(Nota1, Nota2, Nota3);

    }
}