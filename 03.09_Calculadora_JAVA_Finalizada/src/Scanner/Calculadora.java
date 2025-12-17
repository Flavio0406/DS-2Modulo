package Scanner;

public class Calculadora {

    int valor1;
    int valor2;
    double res;

    public void setV1(int valor1) {
        this.valor1 = valor1;

    }

    public int getV1() {
        return valor1;

    }

    public void setV2(int valor2) {
        this.valor2 = valor2;

    }

    public int getV2() {
        return valor2;

    }

    void somar() {

        res = valor1 + valor2;

    }

    void subtrair() {

        res = valor1 - valor2;

    }

    void Dividir() {

        res = valor1 / valor2;

    }

    void multiplicar() {

        res = valor1 * valor2;

    }

    void areDoQuadrado() {

        res = valor1 * valor1;
        System.out.println("O valor da aréa do Quadrado é: " + res);

    }

    void areDoRetangulo() {
        res = valor1 * valor2;
        System.out.println("O valor da aréa do Retangulo é: " + res);
    }

    void areDoTriangulo() {
        res = (valor1 * valor2) / 2;
        System.out.println("O valor da aréa do Retangulo é: " + res);
    }

    void volumeDoCone() {
        res = 0.33 * 3.14 * valor2 + valor2 + valor1;
        System.out.println("O valor do volume do cone é: " + res);

    }

    void volumeDoCubo() {
        res = valor1 * 3;
        System.out.println("O valor do volume do cubo é: " + res);
    }

    public void res() {

        System.out.println("O Resultado final é: " + res);

    }

}
