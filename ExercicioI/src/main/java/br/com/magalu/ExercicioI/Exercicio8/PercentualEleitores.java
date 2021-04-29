package br.com.magalu.ExercicioI.Exercicio8;

import java.util.Scanner;

public class PercentualEleitores {

    double brancos;
    double nulos;
    double validos;

    Scanner sc = new Scanner(System.in);

    public void recebeVotos(){
        System.out.println("Insira a quantidade de votos brancos: ");
        this.brancos = sc.nextDouble();
        System.out.println("Insira a quantidade de votos nulos: ");
        this.nulos = sc.nextDouble();
        System.out.println("Insira a quantidade de votos validos: ");
        this.validos = sc.nextDouble();
    }

    public void calculaPercentual(){
        double total = this.brancos + this.validos + this.nulos;
        System.out.println("Percentual de votos brancos: " + (this.brancos/total) * 100 + "%");
        System.out.println("Percentual de votos nulos: " + (this.nulos/total) * 100 + "%");
        System.out.println("Percentual de votos válidos: " + (this.validos/total) * 100 + "%");

    }
}
