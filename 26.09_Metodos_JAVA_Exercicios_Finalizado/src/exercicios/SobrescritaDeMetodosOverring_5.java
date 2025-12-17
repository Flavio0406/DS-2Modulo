package exercicios;

public class SobrescritaDeMetodosOverring_5 {

    public void jogar() {
        System.out.println("O atleta esta Jogando:");
    }
}

class futebol extends SobrescritaDeMetodosOverring_5 {

    @Override
    public void jogar() {
        System.out.println("O jogador Finalizou na direção do GOLL ");
    }
}

class basquete extends SobrescritaDeMetodosOverring_5 {

    @Override
    public void jogar() {
        System.out.println("O Pivo Realizou um arremessou de 3 pontos ");
    }
    }
class ResJogador{

    public static void main(String[] args) {
        SobrescritaDeMetodosOverring_5 esporte = new SobrescritaDeMetodosOverring_5();
        SobrescritaDeMetodosOverring_5 atletaFut = new futebol();
        SobrescritaDeMetodosOverring_5 atletaBasq = new basquete();
        esporte.jogar();
        atletaFut.jogar();
        atletaBasq.jogar();
    }
    }

