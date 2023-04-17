package ConversaoTemperatura;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProjetoConversaoTemperatura {
	
	public static void main(String[] args) {
		
		//Atribuindo as variáveis Celsius e Fahrenheit
		
		double celsius;
		double fahrenheit;
		
		//Objetos
		
		//Método Scanner para capturar entrada de dados digitados no Teclado
	    Scanner teclado = new Scanner(System.in);
	    
	    //Método DecimalFormat para formatação do Resultado em (uma ou duas casas decimais)
	    DecimalFormat formatador = new DecimalFormat("#0.0");
	    
	    //Método Entrada de Dados
	    System.out.println("Conversão de Temperatura");
	    System.out.print("Digite a Temperatura em Fahrenheit: ");
	    
	    //Capturando os dados digitados no Teclado
	    fahrenheit = teclado.nextDouble();
	    
	    //Processamento dos Dados (Fórmula para Conversão)
	    celsius = (fahrenheit - 32)*5/9;
	    
	    //Resultado
	    System.out.println("Temperatura em Graus Celsius: " + formatador.format(celsius) + "C");
	    
	    //Para Fechar o Teclado e  não permitir mais a entrada de Dados.
	    teclado.close();
	    
	}

}
