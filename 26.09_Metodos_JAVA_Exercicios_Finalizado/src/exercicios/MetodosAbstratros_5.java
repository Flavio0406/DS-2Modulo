package exercicios;

public abstract class MetodosAbstratros_5 {

    public abstract void Animal();

    public void alimentacao() {
        System.out.println("O tipo de Alimentação deste animal e do tipo Carnivoro!!");
    }
}

class Leao extends MetodosAbstratros_5 {
    @Override
    public void Animal() {
        System.out.println("O leao esta Consumido 20KG de CARNE!!!");
    }
}

class resAnimal {
    public static void main(String[] args) {
        MetodosAbstratros_5 Acao = new Leao();
        Acao.alimentacao();
        Acao.Animal();
    }
}