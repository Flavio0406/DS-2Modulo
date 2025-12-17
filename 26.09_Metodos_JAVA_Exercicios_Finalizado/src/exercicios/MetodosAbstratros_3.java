package exercicios;

public abstract class MetodosAbstratros_3 {

    public abstract void figurGeometric();

public void area(){
        System.out.println("A figura geometrica mostrada é: ");
}
}
class retangulo extends MetodosAbstratros_3 {
    @Override
    public void figurGeometric() {
        System.out.println("A forma Encontrada e um retangulo");
    }
}
    class figurFinal{

        public static void main(String[] args) {
            MetodosAbstratros_3 mostrMsg = new retangulo();
            mostrMsg.figurGeometric();

    }
}
