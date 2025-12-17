package exercicios;

public class SobrecarcaDeMetodos_2 {
    public void  exibirValor(int base){
        int resQuadradro = base * 2 ;
        System.out.println("O valor da Area do Quadradro é: " + resQuadradro);
    }
    public static void exibirValor (int baseRetan , int alturaRetan){
    int resDoRetangulo = (baseRetan + alturaRetan );
        System.out.println("O valor da Area do Retangulo é: " + resDoRetangulo);


    }
    public static void main(String[] args){
        SobrecarcaDeMetodos_2 exibir = new SobrecarcaDeMetodos_2();
        exibir.exibirValor(4);
        exibirValor(2,4);


    }
}
