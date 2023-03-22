package cursojava.executavel;

import cursojava.classes.Aluno;

public class Aula22 {
	
/*Aula 22: Instanciação, Atributos e Referências */
	
	public static void main(String[] args) {
		
		/* Comando new: Agora temos um objeto real na memória, preparado para execução*/
		// Instaciando o Objeto
		// aluno1  é uma referência para o objeto Aluno
		
		Aluno aluno1 = new Aluno(); /*Aqui será o Aluno João*/
		
		Aluno aluno2 = new Aluno(); // Aqui será o Pedro
		
		Aluno aluno3 = new Aluno(); // Aqui será o Alex
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);

}
}
