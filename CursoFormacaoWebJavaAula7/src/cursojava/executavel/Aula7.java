package cursojava.executavel;

public class Aula7 {

	/* Título da Aula 7: Operações Lógicas com IF e ElSE */

	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		/* variáveis */
		
		int nota1 = 10;
		int nota2 = 10;
		int nota3 = 10;
		int nota4 = 80;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 70) {
			System.out.println("Aluno aprovado: " + media);
			
		} 
		
		else if (media >= 40 && media <= 69) {
		System.out.println("Aluno em recuperação: " + media);
		
	    }
		else {
			System.out.println("Aluno reprovado: " + media);
		}
		
	    
	}	   
		
	}


