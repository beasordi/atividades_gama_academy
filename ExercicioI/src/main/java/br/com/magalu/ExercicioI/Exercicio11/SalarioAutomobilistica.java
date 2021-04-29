package br.com.magalu.ExercicioI.Exercicio11;

import java.util.Scanner;

public class SalarioAutomobilistica {

    double salarioFixo;
    int carrosVendidos;
    double valorTotalVendas;
    double comissaoFixa;

    Scanner sc = new Scanner(System.in);

    public void recebeDados(){
        System.out.println("Insira a quantidade de carros vendidos: ");
        this.carrosVendidos = sc.nextInt();
        System.out.println("Insira o valor total dos carros vendidos: ");
        this.valorTotalVendas = sc.nextDouble();
        System.out.println("Insira o salário do vendedor: ");
        this.salarioFixo = sc.nextDouble();
        System.out.println("Insira a comissão fixa do vendedor: ");
        this.comissaoFixa = sc.nextDouble();
    }

    public void calculaSalario(){
        double salarioFinal = this.salarioFixo + this.comissaoFixa + (this.valorTotalVendas * 0.05);
        System.out.println("O salário final do funcionário: " + salarioFinal);
    }
}
