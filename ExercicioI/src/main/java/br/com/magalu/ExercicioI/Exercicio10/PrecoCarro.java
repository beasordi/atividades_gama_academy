package br.com.magalu.ExercicioI.Exercicio10;

import java.util.Scanner;

public class PrecoCarro {

    double custoFabrica;

    Scanner sc = new Scanner(System.in);

    public void recebeCustoFabrica(){
        System.out.println("Insira o custo de fábrica do seu carro: ");
        this.custoFabrica = sc.nextDouble();
    }

    public void calculaPreco(){
        double imposto = this.custoFabrica * 0.45;
        double distribuidor = this.custoFabrica * 0.28;
        double valorConsumidor = imposto + distribuidor + this.custoFabrica;
        System.out.println("O valor final do veiculo para o consumidor é: " + valorConsumidor);
    }
}
