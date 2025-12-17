package exercicios;

public class MetodosComParametros_2 {


    public void fzrCalc(int valor1 , int valor2 ) {
        int resultado = valor1 + valor2 ;
        System.out.println(" o valor da soma é: " + resultado);

    }

    public static void main(String[] args) {
        MetodosComParametros_2 calc = new MetodosComParametros_2();
        calc.fzrCalc(4, 8);
    }

    }


