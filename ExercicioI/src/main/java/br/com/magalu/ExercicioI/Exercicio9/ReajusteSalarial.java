package br.com.magalu.ExercicioI.Exercicio9;

import java.util.Scanner;

public class ReajusteSalarial {

    double salario;
    double percentualReajuste;

    Scanner sc = new Scanner(System.in);

    public void receberSalario(){
        System.out.println("Insira o valor do salário: ");
        this.salario = sc.nextDouble();
    }

    public void reajuste(){
        System.out.println("Insira o percentual de reajuste: ");
        this.percentualReajuste = sc.nextDouble();
        double valorPercentualReais = (this.percentualReajuste/100) * this.salario;
        double salarioAtual = valorPercentualReais + this.salario;
        System.out.println("Seu novo salário é: " + salarioAtual);
    }
}
