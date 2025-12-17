package exemplos;

public class SobrescritaDeMetodosOverrding {

    public void emitirSom(){
        System.out.println("Animal faz som");

    }

}
class Cachorro extends SobrescritaDeMetodosOverrding{
    @Override
    public void emitirSom(){
        System.out.println("Au Au!");

    }
}

    class Sobrescrita {
    public static void main (String[] args) {
        SobrescritaDeMetodosOverrding animal = new SobrescritaDeMetodosOverrding();
        SobrescritaDeMetodosOverrding cachorro = new Cachorro();

        animal.emitirSom();
        cachorro.emitirSom();

    }
}
