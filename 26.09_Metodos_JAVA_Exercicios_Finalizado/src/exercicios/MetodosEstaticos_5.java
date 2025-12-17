package exercicios;

public class MetodosEstaticos_5 {

    public static void parNumber(int valor1 ){
        boolean res;

        if (valor1 %2 == 0){
            res = true;
            System.out.println("O resultado é par: " + res );
        }else{
            res = false;
            System.out.println("O resultado é impar: " + res);

        }

    }

        public static void main(String[] args){
    MetodosEstaticos_5.parNumber(3);
}
}

