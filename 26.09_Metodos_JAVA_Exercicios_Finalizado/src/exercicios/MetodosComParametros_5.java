package exercicios;

public class MetodosComParametros_5 {

    public void exibirSaud(String nome, String Saudacao) {
        System.out.println("Seu nome é: " + nome + " Olá Está é uma saudação Personalizada " + Saudacao);
    }
        public static void main (String[]args){
            MetodosComParametros_5 msg = new MetodosComParametros_5();
            msg.exibirSaud("jusileine", "Obá Obá");
        }
    }
