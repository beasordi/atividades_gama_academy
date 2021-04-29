package br.com.magalu.ExercicioI.Exercicio3;

public class VerificaEquacao {

    public double a1 = (4 / 2d) + (2 / 4d);
    public double a2 = 4 / 2d + 2 / 4d;
    public double b1 = 4 / (2 + 2d) / 4d;
    public double b2 = 4 / 2d + 2 / 4d;
    public double c1 = (4 + 2) * 2 - 4;
    public double c2 = 4 + 2 * 2 - 4;

    //construtor vazio da classe
    public VerificaEquacao() {
    }

    //método para verificar igualdade entre as variaveis
    public void comparar(double x, double y) {
        if (x == y) {
            System.out.println("Os valores " + x + " e " + y + " são iguais");
        } else {
            System.out.println("Os valores " + x + " e " + y + " são diferentes");
        }
    }
}