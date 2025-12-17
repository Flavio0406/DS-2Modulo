package exercicios;

public class MetodosComRetornoEParametros_4 {

    public String exibirMsg (String Msg1 , String Msg2){
        return Msg1 + Msg2 ;

    }
    public static void main (String[] args){
        MetodosComRetornoEParametros_4 conc = new MetodosComRetornoEParametros_4();
        String TextFinal = conc.exibirMsg("bom" , " dia ");

        System.out.println("Olá " + TextFinal);

    }
}
