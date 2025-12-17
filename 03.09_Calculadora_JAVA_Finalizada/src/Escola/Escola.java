package Escola;

import java.util.Scanner;

public class Escola {

    public static void main(String[] args) {

        Scanner cad = new Scanner(System.in);

        // Instanciar \\
        Aluno dados = new Aluno();

        System.out.println("digite o seu nome: ");
        String nome = cad.nextLine();

        dados.setNome(nome);

        System.out.println("digite sua idade: ");
        int Idade = cad.nextInt();

        // Usar o set \\

        dados.setIdade(Idade);

        dados.mostrardados();

        cad.close();

    }

}
