package Scanner1;

import java.util.Scanner;

public class Nome {

    public static void main(String[] args) {
      
   Scanner cc = new Scanner(System.in);

   String nome;
   double saldo;

   System.out.println("digite seu nome: ");
   nome = cc.next();
  System.out.println("digite seu saldo: ");
   saldo = cc.nextDouble();


   System.out.println("----Banco Uirapu----");
    System.out.println("seu nome é:" + nome);
    System.out.println("Digite o saldo: " + saldo);
   


   cc.close();

    }
    
}
