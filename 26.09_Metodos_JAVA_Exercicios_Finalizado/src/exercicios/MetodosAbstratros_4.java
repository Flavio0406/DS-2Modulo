package exercicios;

public abstract class MetodosAbstratros_4 {

    public abstract void veiculo();

    public void combust() {
        System.out.println("O tipo de combustivel é Etanol:");
    }
}
    class moto extends MetodosAbstratros_4 {
        @Override
        public void veiculo() {
            System.out.println("São necessario 30 Lítros para encher o tanque da MOTO!");
        }
    }
        class resVeiculo {
            public static void main(String[] args) {
                MetodosAbstratros_4 veiculo = new moto();
                veiculo.combust();
                veiculo.veiculo();

            }
        }


