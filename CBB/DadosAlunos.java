public class DadosAlunos {



    String nome = "";
    int idade = 0;
    String Endereco = "";

    int Nota1 = 0;
    int Nota2 = 0;
    int Nota3 = 0;

    public String getNome(){
        return this.nome;

    }
    public int getIdade(){
        return this.idade;
    }
    public int getNota1(){
        return Nota1;
    }

    public int getNota2(){
        return Nota2;
    }

    public int getNota3(){
        return Nota3;
    }

    public void setAluno(String nome, int idade, String Endereco) {
        this.nome = nome;
        this.idade = idade;
        this.Endereco = Endereco;
    }
    public void setNota(int Nota1, int Nota2, int Nota3) {
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
    }
    public void imprimi() {
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("Endereco: " + this.Endereco);
    }
    public void imprimi(int Nota1, int Nota2, int Nota3) {
        System.out.println("Nome: " + this.nome);
        
        System.out.println("Nota1: " + this.Nota1);
        System.out.println("Nota2: " + this.Nota2);
        System.out.println("Nota3: " + this.Nota3);
    }

}
