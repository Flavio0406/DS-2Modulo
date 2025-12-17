package exercicios;

public class MetodosGettersESetters_3 {

private String Titulo;
private String Autor;

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getTitulo() {
        return Titulo;

    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getAutor() {
        return Autor;
    }

    public static void main(String[] args) {
        MetodosGettersESetters_3 Dados = new MetodosGettersESetters_3();
        Dados.setTitulo("A Cartomante");
        System.out.println("Nome do Titulo: " + Dados.getTitulo());
        Dados.setAutor("Machado de Asiss");
        System.out.println("Nome do Autor é: " + Dados.getAutor());

    }
}
