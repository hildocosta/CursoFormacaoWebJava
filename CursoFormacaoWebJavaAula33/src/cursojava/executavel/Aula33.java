package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class Aula33 {
	
	/* Aula 33 - Adicionando Disciplinas e Calculando a Média das Notas */
	
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
	    
		
		
		//Criando a Lista Disciplinas
		
	     Disciplina disciplina1_0 = new Disciplina();
	     disciplina1_0.setDisciplina("HTML");
	     disciplina1_0.setNota(90);
	     
	     aluno1.getDisciplinas().add(disciplina1_0);
	     
	     
	     Disciplina disciplina2_0 = new Disciplina();
	     disciplina2_0.setDisciplina("CSS");
	     disciplina2_0.setNota(80);
	     
	     aluno1.getDisciplinas().add(disciplina2_0);
	     
	     
	     Disciplina disciplina3_0 = new Disciplina();
	     disciplina3_0.setDisciplina("Java");
	     disciplina3_0.setNota(97);
	     
	     aluno1.getDisciplinas().add(disciplina3_0);
	     
	     Disciplina disciplina4_0 = new Disciplina();
	     disciplina4_0.setDisciplina("JavaScript");
	     disciplina4_0.setNota(70);
	     
	     aluno1.getDisciplinas().add(disciplina4_0);
	     
	     
				
		  	System.out.println(aluno1.toString()); //Descrição do objeto na memória
		    System.out.println("Média do Aluno = " + aluno1.getMediaNota());
		    System.out.println("Resultado é = " + aluno1.getAlunoAprovado2());
	    	
	    	    	
	   }


	}

	
	

