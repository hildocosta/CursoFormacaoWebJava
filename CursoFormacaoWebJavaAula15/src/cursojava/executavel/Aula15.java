package cursojava.executavel;

public class Aula15 {

	/* Título da Aula 15: Estrutura de Repetição e o Continue */
	
	public static void main(String[] args) {
		
	
	for (int numero = 0; numero <= 10; numero ++ ) {
		if (numero == 10 || numero == 6 || numero == 9) {
			System.out.println("Oba, encontrei o número " + numero);
			continue;
		}
		
		System.out.println("Processando laço de repetição");
		
	}
}
}
