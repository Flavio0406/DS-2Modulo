package exercicios;

public class SobrecarcaDeMetodos_1 {

    public void  exibirNum(int valorInte ){
        }

    public void  exibirNum(double valorReal ) {
        System.out.println("valor Inteiro: " + valorReal);

    }
        public static void main (String[] args){
            SobrecarcaDeMetodos_1 exibirNumer = new SobrecarcaDeMetodos_1();
            exibirNumer.exibirNum(3);
            exibirNumer.exibirNum(5.3);
    }
}
