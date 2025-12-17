package Instanciar;

import java.util.Scanner;

public class Calculadora {
    Scanner calc = new Scanner(System.in);  

    String nome;
    int idade;
    double a;
    double b;
    double res;

// criando metodos (function)\\
    void dados(){

        System.out.println("Digite seu nome: ");
        nome = calc.nextLine();
        System.out.println("Digite sua Idade");
        idade = calc.nextInt();
    
        nome = "flavio";
        idade = 18;

 // forma utilizada para o usuario inseri os dados\\
        System.out.println("seu nome é: " + nome +"/n"+ "sua idade é: " + idade);

    }
    void somar(){

        System.out.println("Digite o valor de A:");
        a = calc.nextDouble();

        System.out.println("Digite o valor de B:");
        b = calc.nextDouble();

    double res = a + b ;
    System.out.println("O valor da soma é: " + res);


}
    
}

