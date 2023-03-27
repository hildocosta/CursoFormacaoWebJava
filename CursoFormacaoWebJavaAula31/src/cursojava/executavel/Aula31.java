package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class Aula31 {
	
	/* Aula 31 : Criando um Objeto com as Disciplinas do Aluno */
	
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
	    	
	    	String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
	    	String note1 = JOptionPane.showInputDialog("Qual é a nota 1 do aluno?");
	    	
	    	String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
	    	String note2 = JOptionPane.showInputDialog("Qual é a nota 2 do aluno?");
	    	
	    	String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
	    	String note3 = JOptionPane.showInputDialog("Qual é a nota 3 do aluno?");
	    	
	    	String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
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
		aluno1.getDisciplina() .setNota1(Double.parseDouble(note1));
		aluno1.getDisciplina() .setNota2(Double.parseDouble(note2));
		aluno1.getDisciplina() .setNota3(Double.parseDouble(note3));
		aluno1.getDisciplina() .setNota4(Double.parseDouble(note4));
		
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
	    	System.out.println(aluno1.toString()); //Descrição do objeto na memória
		    System.out.println("Média do Aluno = " + aluno1.getMediaNota());
		    System.out.println("Resultado é = " +aluno1.getAlunoAprovado2());
	    	
   	
	    	
	    	
	    	
	   }


	}