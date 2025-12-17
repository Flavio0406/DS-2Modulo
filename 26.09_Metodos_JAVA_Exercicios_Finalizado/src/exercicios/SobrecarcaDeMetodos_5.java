package exercicios;

public class SobrecarcaDeMetodos_5 {

    public void exibirTexts(char txt ){
        System.out.println("exibindo o Caracter: " + txt );

    }
    public void exibirTexts(String texto ){
        System.out.println("exibindo o texto: " + texto );
}
    public static void main (String[] args) {
        SobrecarcaDeMetodos_5 Textos = new SobrecarcaDeMetodos_5();
        Textos.exibirTexts("A");
        Textos.exibirTexts("Este e o texto na tela");
    }
}