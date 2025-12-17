package exercicios;

public class SobrescritaDeMetodosOverrding_3 {

    public void desenhar() {
    }
}

class quadradro extends SobrescritaDeMetodosOverrding_3 {

    @Override
    public void desenhar() {
        System.out.println("Esta forma e uma Quadradro ");
    }
}

class circulo extends SobrescritaDeMetodosOverrding_3 {

    @Override
    public void desenhar() {
        System.out.println("Esta forma e uma Circulo " );

    }

    public static void main(String[] args) {
        SobrescritaDeMetodosOverrding_3 quadradro = new quadradro();
        SobrescritaDeMetodosOverrding_3 circulo = new circulo();
        quadradro.desenhar();
        circulo.desenhar();
    }
}

