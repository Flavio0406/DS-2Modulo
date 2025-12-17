package exercicios;

public class MetodosGettersESetters_4 {
    private String tipo;
    private String Som;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setSom(String som) {
        Som = som;
    }

    public String getSom() {
        return Som;
    }

    public static void main(String[] args) {
        MetodosGettersESetters_4 Dados = new MetodosGettersESetters_4();
        Dados.setTipo("Cachorro");
        System.out.println("Este e o tipo de Animal: " + Dados.getTipo());
        Dados.setSom("Au au au");
        System.out.println("Este e o som: " + Dados.getSom());
    }
}