import java.util.Scanner;
public class ContaBancaria {
    
public static void main (String[]args) {

    Scanner x = new Scanner(System.in);


int contaCorrente;
String agencia;
String nomeCliente;
double saldo;


System.out.println("Digite seu nome: " );
nomeCliente = x.next();

System.out.println("Digite sua Agencia " );
agencia = x.next();

System.out.println("Digite sua Conta: " );
contaCorrente =  x.nextInt();


System.out.println("Digite seu Saldo é: " );
saldo = x.nextInt();


System.out.println("----Dados do Cliente-----");
System.out.println("Sr(a): " + nomeCliente);
System.out.println("Número da Agéncia Bancária é: " + agencia);
System.out.println("Número da Conta Bancária é: " + contaCorrente);
System.out.println("Valor do saldo atual é de : " + saldo);

x.close();


 }}