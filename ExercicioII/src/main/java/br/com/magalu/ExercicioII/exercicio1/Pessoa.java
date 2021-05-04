package br.com.magalu.ExercicioII.exercicio1;

import java.time.LocalDate;
import java.util.Calendar;


public class Pessoa {

    private String nome;
    private LocalDate dataNascimento ;
    private Float altura;

    public Pessoa(String nome, LocalDate dataNascimento, Float altura){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    //Método para imprimir os dados de pessoa
    public void imprimirPessoa() {
        System.out.printf("Nome: %s \n", this.nome);
        System.out.printf("Altura: %.2f \n", this.altura);
        System.out.println("Data de nascimento: " + this.dataNascimento);
    }

    //Método para calcular a idade
    public void calculaIdade(LocalDate dataNascimento){
        Calendar dataAtual = Calendar.getInstance();
        int idade = dataAtual.get(Calendar.YEAR) - dataNascimento.getYear();
        int difMes = dataAtual.get(Calendar.MONTH) - dataNascimento.getMonthValue();
        int difDia = dataAtual.get(Calendar.DAY_OF_MONTH) - dataNascimento.getDayOfMonth();
        if ((difMes<=0) && (difDia < 0)){
            idade = idade - 1;
            System.out.println("A idade é: " + idade);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }


}
