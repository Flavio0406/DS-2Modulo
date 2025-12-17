package exemplos;

public class MetodosComParametros {

    public void imprimirNome( String nome) {
        System.out.println("Nome recebido:" + nome);

    }
    public static void main (String[] args) {
        MetodosComParametros imp = new MetodosComParametros ();
        imp.imprimirNome(" nome ");

    }
}
