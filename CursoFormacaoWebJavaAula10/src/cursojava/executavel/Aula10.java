package cursojava.executavel;

public class Aula10 {

	
	/* Título da Aula 10: O Comando Switch e Case */

	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 10;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Switch e Case serve para operações exatas */
		
		int dia = 10;
		switch (dia) {
		
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda-feira");
			break;
			
		case 3:
			System.out.println("Terça-feira");
			break;
			
		default: System.out.println("Outro dia qualquer");
		break;
		
		}
			
			
	}	
}
