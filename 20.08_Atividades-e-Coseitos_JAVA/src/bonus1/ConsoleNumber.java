package bonus1;

import java.util.Scanner;

public class ConsoleNumber {
    
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);

        int idade;

        System.out.println("digite sua idade: ");
        
        idade = x.nextInt();
        System.out.println("sua idade é: "+ idade);
        System.out.println("");
        

        String resultado = (idade >= 18)? "Maior de Idade" : "Menor de";
        System.out.println(resultado);
        System.out.println("");
   

        x.close();

 }
    
}
