package cursojava.executavel;

import cursojava.classes.Aluno;

public class Aula25 {
	
	/*Aula 25: Primeiro Método de Cálculo de Média de Notas */
	
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

	aluno1.setNota1(90);
	aluno1.setNota2(80.8);
	aluno1.setNota3(70.9);
	aluno1.setNota4(90.7);
	
	
	System.out.println("Nome é = " + aluno1.getNome()); 
	System.out.println("Idade é = " + aluno1.getIdade()); 
	System.out.println("Data de Nascimento é = " + aluno1.getDataNascimento());
	System.out.println("Média da nota é = " + aluno1.getMediaNota());
	
	/*==================================================================*/

}

}
