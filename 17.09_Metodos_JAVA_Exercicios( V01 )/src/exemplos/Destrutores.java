package exemplos;

public class Destrutores {
protected void finalize(){
    System.out.println("Objeto está sendo removido pelo Garbage Collector");

}
    public static void main (String[] args){
        Destrutores exemplo = new Destrutores();
        exemplo = null; // torna objeto disponível para remoção
        System.gc();    // sugere execução do Garbage Collector



    }
}
