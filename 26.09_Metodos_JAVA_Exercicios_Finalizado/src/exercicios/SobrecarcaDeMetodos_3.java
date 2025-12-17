package exercicios;

public class SobrecarcaDeMetodos_3 {

    public void Text(String Msg1 ){
        System.out.println("Este e o Texto simples:  " + Msg1);

    }
    public void Text_2 (String Msg2 ){
        System.out.println("Este e o Texto repetitivo: " + Msg2+ Msg2+ Msg2+ Msg2+ Msg2+ Msg2+ Msg2+ Msg2+ Msg2+ Msg2+ Msg2+ Msg2);

        }
    public static void main (String[] args){
        SobrecarcaDeMetodos_3 exibirText = new SobrecarcaDeMetodos_3();
        exibirText.Text("ola tudo bommm");
        exibirText.Text_2("ola");
        }
}
