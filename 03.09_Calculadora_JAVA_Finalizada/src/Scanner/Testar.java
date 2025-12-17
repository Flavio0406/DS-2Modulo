package Scanner;

import java.util.Scanner;

public class Testar {

    public static void main(String[] args) {
        // add Scanner
        Scanner cad = new Scanner(System.in);

        Calculadora dados = new Calculadora();

        System.out.println("digite o Valor 1 : ");
        int valor1 = cad.nextInt();
        dados.setV1(valor1);

        System.out.println("digite o Valor 2 : ");
        int valor2 = cad.nextInt();
        dados.setV2(valor2);

       dados.multiplicar();
       dados.res();
       cad.close();


    }

}
