package br.com.magalu.ExercicioI.Exercicio5;

import java.util.Scanner;

public class Antecessor {

    Scanner sc = new Scanner(System.in);

    public void leituraDevolucao(){
        System.out.print("Insira o valor: ");
        int entrada = sc.nextInt();
        int anterior = entrada - 1;
        System.out.println("O valor anterior é: " + anterior);
    }
}
