package exercicios;

public class MetodosComParametros_3 {

    public void  nomeIdad(String nome , int Idade ) {
        System.out.println("Seu nome é: " + nome + " e sua Idade é: " + Idade );

    }

    public static void main(String[] args) {
        MetodosComParametros_3 nome = new MetodosComParametros_3();
        nome.nomeIdad("pinemonatico" , 29 );
    }

}


