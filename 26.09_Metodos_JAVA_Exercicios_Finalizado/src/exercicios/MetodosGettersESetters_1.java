package exercicios;

public class MetodosGettersESetters_1 {
    public String Pesoa;
     String nome;
     int idade;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getidade() {
        return idade;
    }

    public static void main(String[] args) {
        MetodosGettersESetters_1 pessoa = new MetodosGettersESetters_1();
        pessoa.setNome("Pedro Neto");
        System.out.println("Nome: " + pessoa.getNome());
        pessoa.setIdade(20);
        System.out.println("idade: " + pessoa.getidade());
    }
}