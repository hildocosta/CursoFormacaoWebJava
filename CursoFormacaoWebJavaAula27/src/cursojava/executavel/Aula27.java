package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class Aula27 {
	
	/* Aula 27 : Entrada de Dados com o Teclado */
	
    public static void main(String[] args) {
		
    	//Método para Entrada de Dados no Teclado
    	String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
    	String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
    	String dataNascimento = JOptionPane.showInputDialog("Qual é a dade de nascimento do aluno?");
    	String rg = JOptionPane.showInputDialog("Qual é o Registro Geral do aluno?");
    	String cpf = JOptionPane.showInputDialog("Qual é o CPF do aluno?");
    	String nomeMae = JOptionPane.showInputDialog("Qual é o nome da Mãe do aluno?");
    	String nomePai = JOptionPane.showInputDialog("Qual é o nome do Pai do aluno?");
    	String dataMatricula = JOptionPane.showInputDialog("Qual é data de matrícula do aluno?");
    	String serieMatriculada = JOptionPane.showInputDialog("Qual é a série matriculada do aluno?");
    	String escola = JOptionPane.showInputDialog("Qual é a escola do aluno?");
    	
    	String note1 = JOptionPane.showInputDialog("Qual é a nota 1 do aluno?");
    	String note2 = JOptionPane.showInputDialog("Qual é a nota 2 do aluno?");
    	String note3 = JOptionPane.showInputDialog("Qual é a nota 3 do aluno?");
    	String note4 = JOptionPane.showInputDialog("Qual é a nota 4 do aluno?");
    	
    	
    	// aluno1 é uma referência para o objeto aluno
		// new Aluno() é uma instância para o objeto aluno
    			
	Aluno aluno1 = new Aluno(); //Aqui será o João
	
	aluno1.setNome(nome);
	
	//Método Integer.valueOf para converter String em número inteiro
	aluno1.setIdade(Integer.valueOf(idade));
	
	aluno1.setDataNascimento(dataNascimento);
	aluno1.setRegistroGeral(rg);
	aluno1.setNumeroCpf(cpf);
	aluno1.setNomeMae(nomeMae);
	aluno1.setNomePai(nomePai);
	aluno1.setDataMatricula(dataMatricula);
	aluno1.setSerieMatriculado(serieMatriculada);
	aluno1.setNomeEscola(escola);
    
	
	//Método Double.parseDouble() para converter String em número real
	aluno1.setNota1(Double.parseDouble(note1));
	aluno1.setNota2(Double.parseDouble(note2));
	aluno1.setNota3(Double.parseDouble(note3));
	aluno1.setNota4(Double.parseDouble(note4));
	
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
