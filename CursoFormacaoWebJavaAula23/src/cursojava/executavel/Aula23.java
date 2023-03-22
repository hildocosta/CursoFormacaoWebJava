package cursojava.executavel;

import cursojava.classes.Aluno;

public class Aula23 {
	
			
	/*Aula 23: Declaração de Tipos Pública e Privada */
		
		public static void main(String[] args) {
			
			/* Comando new: Agora temos um objeto real na memória, preparado para execução*/
			// Instaciando o Objeto
			// aluno1  é uma referência para o objeto Aluno
			
			// Para acessar os atributos do Aluno, devemos colocar os Atributos Aluno, no modo public, pois 
			// por padrao os Atributos são privados.
			
			
			//Modo Public no Atributo Aluno,
			Aluno aluno1 = new Aluno(); /*Aqui será o Aluno João*/
			aluno1.nome = "João";
			
			System.out.println("O nome do Aluno1 é: " + aluno1.nome);
			
			Aluno aluno2 = new Aluno(); // Aqui será o Pedro
			
			Aluno aluno3 = new Aluno(); // Aqui será o Alex
			
			Aluno aluno4 = new Aluno("Maria");
			
		

	}
	}



