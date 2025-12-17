package exercicios;

public class SobrescritaDeMetodosOverrding_1 {

    public void emitirSom() {
        System.out.println("Animal faz som");

    }
}

class cachorro extends SobrescritaDeMetodosOverrding_1 {
    @Override
    public void emitirSom() {
        System.out.println("Au Au!");


    }
}

class animalRes {

    public static void main(String[] args) {
        SobrescritaDeMetodosOverrding_1 animal = new SobrescritaDeMetodosOverrding_1();
        SobrescritaDeMetodosOverrding_1 cachorro = new cachorro();

        animal.emitirSom();
        cachorro.emitirSom();

    }
}