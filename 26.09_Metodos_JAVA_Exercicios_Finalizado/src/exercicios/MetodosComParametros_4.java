package exercicios;

public class MetodosComParametros_4 {

    public void exibirPostNegat(int valor1) {
        String res;

        if (valor1 > 0) {

            res = "Positivo";

    }else{
            res = "Negativo";
    }

    System.out.println("O numero é: " + res);

}

    public static void main(String[] args) {
        MetodosComParametros_4 result = new MetodosComParametros_4();
        result.exibirPostNegat(-3);

}

}
