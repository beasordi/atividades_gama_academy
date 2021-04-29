package br.com.magalu.ExercicioI.Exercicio7;

import java.util.Scanner;

public class IdadeDias {

    int anos;
    int meses;
    int dias;

    Scanner sc = new Scanner(System.in);

    public void recebeIdade(){
        System.out.println("Pressionando enter, insira respectivamente quantos anos, meses e dias você tem: ");
        this.anos = sc.nextInt();
        this.meses = sc.nextInt();
        this.dias = sc.nextInt();
    }

    public void retornaDias(){
        int idadeDias = (this.anos * 365) + (this.meses * 30) + this.dias;
        System.out.println("Sua idade em dias é: " + idadeDias);
    }
}
