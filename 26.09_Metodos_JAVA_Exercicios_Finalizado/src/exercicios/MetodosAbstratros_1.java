package exercicios;

public abstract class MetodosAbstratros_1 {
    public abstract void intrumtMusic();
    public void troca() {
        System.out.println("Ele esta tocando: ");
    }
}
class violao extends MetodosAbstratros_1 {
    @Override
    public void intrumtMusic() {
        System.out.println("Violão, Ele esta tocando a trilha sonora de ''Se Preparem'' de o Rei leão ");
    }
}
class FinalInstru {
    public static void main(String[] args) {
        MetodosAbstratros_1 metodo = new violao();
        metodo.intrumtMusic();

    }
}
