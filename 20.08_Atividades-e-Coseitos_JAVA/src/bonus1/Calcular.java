package bonus1;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calcular {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        String base1 = JOptionPane.showInputDialog("digite o valor da base: ");
        String altura1 = JOptionPane.showInputDialog("digite o valor da altura: ");
           
        int  altura = Integer.parseInt (altura1);
        int  base = Integer.parseInt(base1);
      
            int Triangulo = ( base * altura)/2;
            int Quadrado = ( base * base);
            int Retangulo = ( altura * base);

            System.out.println("o valor do area do  Triangulo é: " + Triangulo);
            System.out.println("o valor da area do Quadrado é: " + Quadrado);
            System.out.println("o valor da area do Retangulo é: " + Retangulo);

            x.close();
            
        }

    }
