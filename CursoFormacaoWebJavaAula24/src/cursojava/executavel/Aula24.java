package cursojava.executavel;

import cursojava.classes.Aluno;


/*Aula 24: Métodos Getters e Setters */
public class Aula24 {
	
	// Main é um método auto executável em Java
public static void main(String[] arg) {
	
	// new aluno() é uma instância (Criação de Objeto)
	// aluno1 é uma referência para o objeto aluno 
	

	Aluno aluno1 = new Aluno();
	aluno1.setNome("João");
	aluno1.setIdade(50);
	aluno1.setDataNascimento("11/07/1988");
	aluno1.setRegistroGeral("13.385.325-1");
	aluno1.setNumeroCpf("357.975.638-94");
	aluno1.setNomeMae("Maria");
	aluno1.setNomePai("Pedro");
	aluno1.setSerieMatriculado("5 série");
	aluno1.setNomeEscola("Escola Web Java"); 
	aluno1.setDataMatricula("07/02/2023");
	
	System.out.println("Nome é = " + aluno1.getNome()); 
	System.out.println("Idade é = " + aluno1.getIdade()); 
	System.out.println("Data de Nascimento é = " + aluno1.getDataNascimento());
	System.out.println("Registro Geral é = " + aluno1.getRegistroGeral());
	System.out.println("O CPF é = " + aluno1.getNumeroCpf());
	System.out.println("Série Matriculado é = " + aluno1.getSerieMatriculado());
	System.out.println("Nome da Mãe é = " + aluno1.getNomeMae());
	System.out.println("Nome do Pai é = " + aluno1.getNomePai());
	System.out.println("Nome da Escola é = " + aluno1.getNomeEscola());
	System.out.println("Data da Matrícula é = " + aluno1.getDataMatricula());
	
	
	
	
	
	

}
}
