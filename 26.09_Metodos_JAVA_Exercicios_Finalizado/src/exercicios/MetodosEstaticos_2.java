package exercicios;

public class MetodosEstaticos_2 {

    public static void exibirNumber(int valor1 , int valor2){
        int res = valor1 + valor2;
        System.out.println("O resultado da soma dos valores é: " + res);
        
    }
    public static void main(String[] args){
        MetodosEstaticos_2.exibirNumber( 99 , 1);
        
}
}
