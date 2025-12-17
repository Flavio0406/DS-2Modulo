package exercicios;

public class MetodosComRetornoEParametros_3 {

    public int exibirDobr (int valor1) {
        return valor1 * 2 ;
    }

    public static void main(String[] args) {
        MetodosComRetornoEParametros_3 soma = new MetodosComRetornoEParametros_3();
        int dobro = soma.exibirDobr(4);

        System.out.println("O dobro do resultado é: " + dobro );

    }
}