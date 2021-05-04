package br.com.magalu.ExercicioII.exercicio2;

import java.util.Scanner;

public class Agenda2 {

        //Lista de pessoas da agenda
        //[0] = nome, [1] = idade, [2] = altura
        String [] [] listaPessoas = new String[10][3];
        Scanner scan = new Scanner(System.in);

        //método para armazenar pessoas
        public void armazenaPessoa(String nome, int idade, Float altura) {
            for (int l = 0; l < listaPessoas.length; l++) {
                if (listaPessoas[l][0] == null){
                    listaPessoas[l][0] = nome;
                    listaPessoas[l][1] = String.valueOf(idade);
                    listaPessoas[l][2] = Float.toString(altura);
                    break;
                }
            }
        }

        //metodo para remover pessoas
        public void removerPessoas(String nome) {
            boolean encontrou = false;
            for (int l = 0; l < listaPessoas.length; l++) {
                for (int c = 0; c < 3; c++) {
                    if (nome.equals(listaPessoas[l][0])) {
                        listaPessoas[l][c] = null;
                        encontrou = true;
                    }
                }
            }
        }

        //método para informar em que posição da agenda a pessoa está
        public void buscaPessoa(String nome) {
            boolean encontrou = false;
            int posicao = 0;
            for (int l = 0; l < listaPessoas.length; l++) {
                if (nome.equals(listaPessoas[l][0])) {
                    encontrou = true;
                    posicao = l + 1;

                }
            }
            System.out.println("Seu contato esta na " + posicao + "° posição");
        }

        //método para imprimir os dados de todas as pessoas da agenda
        public void imprimiAgenda(){
            for(int l = 0; l < listaPessoas.length; l ++){
                for (int c = 0; c < 3; c ++){
                    System.out.print("     " + listaPessoas[l][c] + "     ");
                }
                System.out.println("");
            }
        }

        //método para imprimir os dados da pessoa que esta na posição "i"
        public void imprimiPessoa(int index){
            for (int l = 0; l < listaPessoas.length; l++) {
                if (index == l) {
                    System.out.println("Nome: " + listaPessoas[l][0]);
                    System.out.println("Idade: " + listaPessoas[l][1]);
                    System.out.println("Altura: " + listaPessoas[l][2]);
                }
            }

        }
}
