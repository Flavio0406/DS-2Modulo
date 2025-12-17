package exemplos;

public class MetodosGettersESetters {
    private String nome;

    // Setter
    public void setNome(String nome) {
        this.nome = nome;

    }

    //Getter
    public String getNome() {
        return nome;

    }
    public static void main (String[] args){
        MetodosGettersESetters pessoa = new MetodosGettersESetters();
        pessoa.setNome("nome");
        System.out.println("Nome: " + pessoa.getNome());

    }
}
