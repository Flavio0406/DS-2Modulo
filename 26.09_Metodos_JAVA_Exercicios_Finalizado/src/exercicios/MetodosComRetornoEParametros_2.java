package exercicios;

public class MetodosComRetornoEParametros_2 {

    public String exibirSaud(String nome, String saudacao) {
        return nome + saudacao;

    }

    public static void main(String[] args) {
        MetodosComRetornoEParametros_2 msg = new MetodosComRetornoEParametros_2();
         String saudacao = msg.exibirSaud(" kleberson \n", "slk parçeiro so gratidão!!");
        System.out.println("saudacao: " + saudacao);
    }
}