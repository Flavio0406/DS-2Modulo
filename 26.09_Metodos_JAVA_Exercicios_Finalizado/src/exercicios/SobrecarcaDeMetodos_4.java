package exercicios;

public class SobrecarcaDeMetodos_4 {

    public void SomarNum (int valor1 , int valor2 ){
        int res = valor1 + valor2;
        System.out.println("O valor da soma é: "+ res);
    }
    public void SomarNum (int valor1 , int valor2 , int valor3 ){
        int res = valor1 + valor2 + valor3;
        System.out.println("O valor da soma é: " + res );
}
    public void SomarNum (int valor1 , int valor2 , int valor3 , int valor4 ){
        int res = valor1 + valor2 + valor3 + valor4;
        System.out.println("O valor da soma é: " + res );
    }
    public static void main (String[] args) {
        SobrecarcaDeMetodos_4 SomarNumber = new SobrecarcaDeMetodos_4();
        SomarNumber.SomarNum(10 , 20);
        SomarNumber.SomarNum(2 , 4  , 55 );
        SomarNumber.SomarNum(44 , 76 , 22 , 80);

    }
}