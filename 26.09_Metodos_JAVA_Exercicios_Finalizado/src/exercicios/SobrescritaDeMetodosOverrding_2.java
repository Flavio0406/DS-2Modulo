package exercicios;

public class SobrescritaDeMetodosOverrding_2 {

    public void moverCar(){

    }

}
class Carro extends SobrescritaDeMetodosOverrding_2{
 @Override
 public void moverCar(){
     System.out.println("O veiculo esta se movendo agr:");

 }
}
class montVeiculo {

    public static void main(String[] args) {
        SobrescritaDeMetodosOverrding_2 momento = new Carro();

        momento.moverCar();

}
}