package br.com.magalu.ExercicioII;

import br.com.magalu.ExercicioII.exercicio2.Agenda2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ExercicioIiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercicioIiApplication.class, args);

		Scanner scan = new Scanner(System.in);


		//chamando o exercicio 1
//		System.out.println("Insira o nome da Pessoa: ");
//		String nome = scan.next();
//		System.out.println("Insira a data de nascimento: ");
//		String dataNascimentoS = scan.next();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate dataNascimento = LocalDate.parse(dataNascimentoS, formatter);
//		System.out.println("Insira a altura:" );
//		Float altura = scan.nextFloat();
//		Pessoa pessoa = new Pessoa(nome, dataNascimento, altura);
//
//		pessoa.imprimirPessoa();
//		pessoa.calculaIdade(dataNascimento);

//		chamando o exercicio 2.2
//		Agenda2 agenda = new Agenda2();
//
//		System.out.println("Você deseja adicionar um novo contato? Y/N ");
//		String add = scan.next();
//
//		while (add.equals("Y")){
//			System.out.println("Insira o nome: ");
//			String nome = scan.next();
//			System.out.println("Insira a idade: ");
//			int idade = scan.nextInt();
//			System.out.println("Insira a altura: ");
//			Float altura = scan.nextFloat();
//			agenda.armazenaPessoa(nome, idade, altura);
//			System.out.println("Contato add com sucesso!");
//			System.out.println("Você deseja adicionar um novo contato? Y/N ");
//			add = scan.next();
//		}
//		System.out.println("Você deseja remover ou localizar algum contato? REM/LOC");
//		String add2 = scan.next();
//		if (add2.equals("REM")){
//			System.out.println("Insira o nome para remoção: ");
//			String nome = scan.next();
//			agenda.removerPessoas(nome);
//		}
//		else{
//			System.out.println("Você deseja localizar por nome ou ID? NOME/ID");
//			String add3 = scan.next();
//			if(add3.equals("NOME")){
//				System.out.println("Insira o nome: ");
//				String nome = scan.next();
//				agenda.buscaPessoa(nome);
//			}
//			else{
//				System.out.println("Insira o ID: ");
//				int id = scan.nextInt();
//				agenda.imprimiPessoa(id);
//			}
//		}
//
//		System.out.println("Caso deseje visualizar sua agenda completa insira: Y ");
//		String add4 = scan.next();
//		if (add4.equals("Y")){
//			agenda.imprimiAgenda();
//		}



//		//chamando o exericio 3
//		Elevador elevador = new Elevador();
//
//		System.out.println("Insira a capacidade do seu elevador " +
//				"e a quantidade de andares totais, respectivamente: ");
//		int capacidade = scan.nextInt();
//		int andaresTotais = scan.nextInt();
//		elevador.inicializa(capacidade, andaresTotais);
//
//		System.out.println("Você deseja adicionar ou remover pessoas ao seu elevador? ADD/REMOV");
//		String resp = scan.next();
//		if (resp.equals("ADD")) {
//			elevador.entra();
//		}
//		else{
//			elevador.sai();
//		}
//		System.out.println("Deseja subir ou descer de andar? SUB/DESC");
//		String resp2 = scan.next();
//		if (resp2.equals("SUB")) {
//			elevador.sobe();
//		} else {
//			elevador.desce();
//		}
//

	}
}
