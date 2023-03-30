package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;


public class Aula35 {
	
		
		/* Aula 35 - Removendo Disciplinas da Lista do Aluno */
		
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
		    
			//Método de Condição para deixar o Sistema Dinâmico, automatizado
			for (int position = 1; position <=4; position ++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina "+position+" ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina "+position+" ?");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				//Método para converter String em Número
				disciplina.setNota(Double.valueOf(notaDisciplina));
				
				aluno1.getDisciplinas().add(disciplina);
			}
			
			//Método para Remoção de Disciplinas 
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
			
			if(escolha == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3 ou 4 ");
				//Método Integer.valueOf para converter String em número Inteiro e Métodos intValue para converter Objeto em Inteiro
				// Adicionamos o -1 no final do código para remover corretamente, hava visto na programação a Lista começar com 0, 1, 2, 3, ...
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-1);
			}
			
		     
		     
					
			  	System.out.println(aluno1.toString()); //Descrição do objeto na memória
			    System.out.println("Média do Aluno = " + aluno1.getMediaNota());
			    System.out.println("Resultado é = " + aluno1.getAlunoAprovado2());
		    	
		    	    	
		   }


		}

		
	
