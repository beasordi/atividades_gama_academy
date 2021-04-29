package br.com.magalu.ExercicioI;

import br.com.magalu.ExercicioI.Exercicio10.PrecoCarro;
import br.com.magalu.ExercicioI.Exercicio11.SalarioAutomobilistica;
import br.com.magalu.ExercicioI.Exercicio3.VerificaEquacao;
import br.com.magalu.ExercicioI.Exercicio4.MinimoParentese;
import br.com.magalu.ExercicioI.Exercicio5.Antecessor;
import br.com.magalu.ExercicioI.Exercicio6.AreaRetangulo;
import br.com.magalu.ExercicioI.Exercicio7.IdadeDias;
import br.com.magalu.ExercicioI.Exercicio8.PercentualEleitores;
import br.com.magalu.ExercicioI.Exercicio9.ReajusteSalarial;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercicioIApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercicioIApplication.class, args);

	//chamando o exercicio 3
		VerificaEquacao verifica = new VerificaEquacao();
		verifica.comparar(verifica.a1, verifica.a2);
		verifica.comparar(verifica.b1, verifica.b2);
		verifica.comparar(verifica.c1, verifica.c2);

		//chamando o exercicio 4
		MinimoParentese minimo = new MinimoParentese();
		minimo.print(minimo.a);
		minimo.print(minimo.b);
		minimo.print(minimo.c);
		minimo.print(minimo.d);
		minimo.print(minimo.e);
		minimo.print(minimo.f);
		minimo.print(minimo.g);
		minimo.print(minimo.h);
		minimo.print(minimo.i);
		minimo.print(minimo.j);

		//chamando o exercicio 5
		Antecessor antecessor = new Antecessor();
		antecessor.leituraDevolucao();

		//chamando o exercicio 6
		AreaRetangulo areaRetangulo = new AreaRetangulo();
		areaRetangulo.RecebeDados();
		areaRetangulo.calculaArea();

		//chamando o exercicio 7
		IdadeDias idadeDias = new IdadeDias();
		idadeDias.recebeIdade();
		idadeDias.retornaDias();

		//chamando o exercicio 8
		PercentualEleitores percentual = new PercentualEleitores();
		percentual.recebeVotos();
		percentual.calculaPercentual();

		//chamando o exercicio 9
		ReajusteSalarial reajusteSalarial = new ReajusteSalarial();
		reajusteSalarial.receberSalario();
		reajusteSalarial.reajuste();

		//chamando o exercicio 10
		PrecoCarro precoCarro = new PrecoCarro();
		precoCarro.recebeCustoFabrica();
		precoCarro.calculaPreco();

		//chamando o exercicio 11
		SalarioAutomobilistica salario = new SalarioAutomobilistica();
		salario.recebeDados();
		salario.calculaSalario();
	}
}
