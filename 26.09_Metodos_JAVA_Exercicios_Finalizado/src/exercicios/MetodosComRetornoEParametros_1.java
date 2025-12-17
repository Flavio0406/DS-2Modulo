package exercicios;

import exemplos.MetodoComRetornoEParametros;

public class MetodosComRetornoEParametros_1 {

    public int multiplicar(int valor1, int valor2){
        return valor1 * valor2 ;

    }
    public static void main (String[] args){
        MetodosComRetornoEParametros_1 calc = new MetodosComRetornoEParametros_1();
        int resultado = calc.multiplicar(5 , 5);
        System.out.println("Resultado: " + resultado);


    }
}

