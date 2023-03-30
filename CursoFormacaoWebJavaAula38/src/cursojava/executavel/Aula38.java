package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class Aula38 {
		
	/* Aula 38 - Criando e Percorrendo a Lista de Alunos */
	
	public static void main(String[] args) {
		
		//Método para criar uma Lista de Alunos
		//Intanciar Lista de Alunos e envolver dentro da Condição For
		
		List<Aluno> alunos = new ArrayList<>();
		
		for(int quantidade = 0 ; quantidade <=1; quantidade ++) {
		
		
		
		
		//Método para Entrada de Dados no Teclado
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno " +quantidade+" ?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
    	String dataNascimento = JOptionPane.showInputDialog("Qual é a dade de nascimento do aluno?");
    	String rg = JOptionPane.showInputDialog("Qual é o Registro Geral do aluno?");
    	String cpf = JOptionPane.showInputDialog("Qual é o CPF do aluno?");
    	String nomeMae = JOptionPane.showInputDialog("Qual é o nome da Mãe do aluno?");
    	String nomePai = JOptionPane.showInputDialog("Qual é o nome do Pai do aluno?");
    	String dataMatricula = JOptionPane.showInputDialog("Qual é data de matrícula do aluno?");
    	String serieMatriculada = JOptionPane.showInputDialog("Qual é a série matriculada do aluno?");
    	String escola = JOptionPane.showInputDialog("Qual é a escola do aluno?");*/
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		
		//Método Integer.valueOf para converter String em número inteiro
		/*aluno1.setIdade(Integer.valueOf(idade));
		
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculada);
		aluno1.setNomeEscola(escola);*/
		
		for (int posicao = 1; posicao <= 4; posicao++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + posicao + "?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + posicao + "?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		//Método para Remoção de Disciplinas 
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
		
		if (escolha == 0) { //Opção Sim é Zero
			
			int continuarRemover = 0;
			int posicao = 0;
			
			//Condição While para continuar a Remover Disciplinas
			while (continuarRemover == 0) {
								
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3 ou 4 ");
				
				// Adicionamos o -1 no final do código para remover corretamente, haja visto na programação a Lista começar com 0, 1, 2, 3, ...
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
				posicao++; //++ Soma a posição atual mais 1
				
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover? ");
			}
			
		}
		
		    //Método para adicionar o Aluno
			alunos.add(aluno1);
			
			
			//Método para percorrer a Lista de Aluno
			for(Aluno aluno : alunos) {
				

			  	System.out.println(aluno); //Descrição do objeto na memória
			    System.out.println("Média do Aluno = " + aluno.getMediaNota());
			    System.out.println("Resultado é = " + aluno.getAlunoAprovado2());
			    System.out.println("============================================");
				
				
			}
			
		}
	}
}
