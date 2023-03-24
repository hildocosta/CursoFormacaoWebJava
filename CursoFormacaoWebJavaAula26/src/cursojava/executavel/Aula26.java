package cursojava.executavel;

import cursojava.classes.Aluno;

public class Aula26 {
	

			
		/*Aula 26: Métodos com retorno se foi aprovado ou não */
		
		public static void main(String[] args) {

		// aluno1 é uma referência para o objeto aluno
		
			
		Aluno aluno1 = new Aluno(); // Aqui será o João

		aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("11/07/1988");
		aluno1.setRegistroGeral("13.385.325-1");
		aluno1.setNumeroCpf("357.975.638-94");
		aluno1.setNomeMae("Shirlei");
		aluno1.setNomePai("Antonio");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Escola JDEV Treinamento");

		aluno1.setNota1(10);
		aluno1.setNota2(10.8);
		aluno1.setNota3(10.9);
		aluno1.setNota4(10.7);
		
		
		System.out.println("Nome é = " + aluno1.getNome()); 
		System.out.println("Idade é = " + aluno1.getIdade()); 
		System.out.println("Data de Nascimento é = " + aluno1.getDataNascimento());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		
		
		//Aplicando Operador Ternário para imprimir na Tela Aprovado ou Reprovado.
		System.out.println("Resultado é = " + (aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		
		
		System.out.println("=============================================================");
		
		
		Aluno aluno2 = new Aluno(); // Aqui será o João

		aluno2.setNome("Mario da Silva");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("13/07/1988");
		aluno2.setRegistroGeral("14.385.325-1");
		aluno2.setNumeroCpf("357.970.638-94");
		aluno2.setNomeMae("Shirlene");
		aluno2.setNomePai("Antonio Costa");
		aluno2.setDataMatricula("11/01/2019");
		aluno2.setSerieMatriculado("4");
		aluno2.setNomeEscola("Escola JDEV Treinamento");

		aluno2.setNota1(20);
		aluno2.setNota2(10.8);
		aluno2.setNota3(10.9);
		aluno2.setNota4(10.7);
		
		
		System.out.println("Nome é = " + aluno2.getNome()); 
		System.out.println("Idade é = " + aluno2.getIdade()); 
		System.out.println("Data de Nascimento é = " + aluno2.getDataNascimento());
		System.out.println("Média da nota é = " + aluno2.getMediaNota());
        System.out.println("Resultado = " + aluno2.getAlunoAprovado2());
		
		
	}

	}



