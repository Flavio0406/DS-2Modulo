package exercicios;

public class MetodosComRetornoEParametros_5 {

    public Boolean idade (int idad){
        Boolean res;

        if (idad > 17){

            res = true;
        }else {
            res = false;
        }
        return  res;

        }

        public static void main (String[] args){
            MetodosComRetornoEParametros_5 Text = new MetodosComRetornoEParametros_5();
            Boolean Msg = Text.idade(18);

            System.out.println("Idade inserida permitida: " + Msg );
        }

}
