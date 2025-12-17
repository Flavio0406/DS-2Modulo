package exercicios;

public class SobrescritaDeMetodosOverrding_4 {

    public void Trabalhar() {
        System.out.println("O pião esta trabalhando:");
    }
}
    class professor extends SobrescritaDeMetodosOverrding_4 {
        @Override
        public void Trabalhar() {
            System.out.println("O professor esta ensinando JAVA");

        }
    }
        class endFuncion {


            public static void main(String[] args) {
                SobrescritaDeMetodosOverrding_4 trabalho = new SobrescritaDeMetodosOverrding_4();
                SobrescritaDeMetodosOverrding_4 funcionario = new professor();
                trabalho.Trabalhar();
                funcionario.Trabalhar();

            }
        }



