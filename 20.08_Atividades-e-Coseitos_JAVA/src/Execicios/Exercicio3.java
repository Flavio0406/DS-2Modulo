package Execicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade : ");
        idade = entrada.nextInt();

        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println("O resultado foi : " + resultado);

        entrada.close();
    }

}
