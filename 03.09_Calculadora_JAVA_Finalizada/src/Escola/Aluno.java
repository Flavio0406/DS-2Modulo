package Escola;

public class Aluno {

    String nome;
    int Idade;

    public void mostrardados() {

        System.out.println("seu nome é:" + nome);
        System.out.println("seu idade é:" + Idade);
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;

    }

    public void setIdade(int idade) {
        this.Idade = idade;

    }

    public void getIdade() {

    }
}
