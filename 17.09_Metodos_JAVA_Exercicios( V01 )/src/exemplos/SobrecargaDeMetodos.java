package exemplos;

public class SobrecargaDeMetodos {

    public void exibir(int x){
        System.out.println("valor inteiro: " + x);
        }
        public void exibir(String texto){
        System.out.println(" Texto : " + texto);

    }
    public void exibir (int x, String texto){
        System.out.println(x + " - " + texto);
}
 public static void main (String[] args){
     SobrecargaDeMetodos sobrecarga = new SobrecargaDeMetodos ();

     sobrecarga.exibir(10);
     sobrecarga.exibir("exemplo");
     sobrecarga.exibir(7, "java");
 }
}
