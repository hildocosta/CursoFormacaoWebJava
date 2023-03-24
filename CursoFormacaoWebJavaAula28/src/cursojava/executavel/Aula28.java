package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class Aula28 {
	
	/* Aula 28 : Conhecendo sobre toString */
	
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
	
    	System.out.println(aluno1.toString()); //Descrição do objeto na memória
	    System.out.println("Média do Aluno = " + aluno1.getMediaNota());
	    System.out.println("Resultado é = " +aluno1.getAlunoAprovado2());
    	
    	
   }


}
