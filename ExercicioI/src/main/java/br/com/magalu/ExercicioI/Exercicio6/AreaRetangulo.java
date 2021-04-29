package br.com.magalu.ExercicioI.Exercicio6;

import java.util.Scanner;

public class AreaRetangulo {

    public double base;
    public double altura;

    Scanner sc = new Scanner(System.in);

    public void RecebeDados(){
        System.out.println("Insira o valor da base: ");
        this.base = sc.nextDouble();
        System.out.println("Insira o valor da altura: ");
        this.altura = sc.nextDouble();
    }

    public void calculaArea(){
        double area = this.base * this.altura;
        System.out.println("O valor da área é: " + area);
    }
}
