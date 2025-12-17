package exemplos;

public class MetodoComRetornoEParametros {

    public int multiplicar(int x, int y){
        return x * y ;

    }
    public static void main (String[] args){
        MetodoComRetornoEParametros calc = new MetodoComRetornoEParametros();
        int resultado = calc.multiplicar(4, 5);
        System.out.println("Resultado: " + resultado);


    }
}

