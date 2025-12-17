package exemplos;

public class metodosContrutoresEDestrutores {
    String nome;
    //método contrutor
    public metodosContrutoresEDestrutores(String nome){
        this.nome = nome;
    }

    public void exibirAluno() {
        System.out.println("Aluno: " + nome);
    }
    public  static void main (String[] args){
        metodosContrutoresEDestrutores aluno = new metodosContrutoresEDestrutores ("pedro");
        aluno.exibirAluno();
    }

}
