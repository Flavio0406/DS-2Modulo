package exercicios;

public class MetodosGettersESetters_2 {
    private String nome;
    private double preco;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;

    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public static void main(String[] args) {
        MetodosGettersESetters_2 varialV = new MetodosGettersESetters_2();
        varialV.setNome("Malala");
        System.out.println("Nome do Livro: " + varialV.getNome());
        varialV.setPreco(20);
        System.out.println("Preço R$ : " + varialV.getPreco());

    }
}