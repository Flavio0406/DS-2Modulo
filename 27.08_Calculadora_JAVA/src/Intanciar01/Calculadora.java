package Intanciar01;

import java.util.Scanner;

public class Calculadora {

    Scanner calc = new Scanner(System.in);

    double a;
    double b;
    double res;

    // criando metodos (function)\\

    void somar() {

        System.out.println("Digite o valor de A:");
        a = calc.nextDouble();

        System.out.println("Digite o valor de B:");
        b = calc.nextDouble();

        double res = a + b;
        System.out.println("O valor da soma é: " + res);

    }

    void subtrair() {

        System.out.println("Digite o valor de A:");
        a = calc.nextDouble();

        System.out.println("Digite o valor de B:");
        b = calc.nextDouble();

        double res = a + b;
        System.out.println("O valor da soma é: " + res);

    }

    void Dividir() {

        System.out.println("Digite o valor de A:");
        a = calc.nextDouble();

        System.out.println("Digite o valor de B:");
        b = calc.nextDouble();

        double res = a / b;
        System.out.println("O valor da soma é: " + res);

    }

    void Multiplicar() {

        System.out.println("Digite o valor de A:");
        a = calc.nextDouble();

        System.out.println("Digite o valor de B:");
        b = calc.nextDouble();

        double res = a * b;
        System.out.println("O valor da soma é: " + res);

    }

    void areDoQuadrado() {

        System.out.println("Digite o valor de A:");
        a = calc.nextDouble();

        double res = a * a;
        System.out.println("O valor da aréa do Quadrado é: " + res);

    }

    void areDoRetangulo() {

        System.out.println("Digite o valor da Altura A:");
        a = calc.nextDouble();

        System.out.println("Digite o valor da base A:");
        a = calc.nextDouble();

        double res = a * b;
        System.out.println("O valor da aréa do Retangulo é: " + res);

    }

    void areDoTriangulo() {

        System.out.println("Digite o valor da Altura A:");
        a = calc.nextDouble();

        System.out.println("Digite o valor da base A:");
        a = calc.nextDouble();

        double res = (a * b) / 2;
        System.out.println("O valor da aréa do Retangulo é: " + res);

    }

    void volumeDoCone() {

        System.out.println("Digite o valor da Altura do cone A:");
        a = calc.nextDouble();

        System.out.println("Digite o valor do volume do cone  B:");
        a = calc.nextDouble();

        double res = 0.33 * 3.14 * b + b + a;
        System.out.println("O valor do volume do cone é: " + res);

    }

    void volumeDoCubo() {

        System.out.println("Digite o valor da Arestas do Cubo:");
        a = calc.nextDouble();

        double res = a * 3;
        System.out.println("O valor do volume do cone é: " + res);

    }
}