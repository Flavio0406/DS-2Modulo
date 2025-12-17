package exercicios;

public class MetodosComRetorno_5 {

    public String mNumber() {
        return " 3.14159  ";
    }

    public static void main(String[] args) {
        exercicios.MetodosComRetorno_5 numero = new exercicios.MetodosComRetorno_5();
        System.out.println("O valor de PI é: " + numero.mNumber());

    }
}