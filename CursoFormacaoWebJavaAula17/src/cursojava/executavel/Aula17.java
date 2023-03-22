package cursojava.executavel;

import javax.swing.JOptionPane;

public class Aula17 {
	
	/*Aula 17: Criando nossa entrada de dados */
	
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros? ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas? ");
        
		
		//Método para converter os dados fornecidos na String para números
		
		double carrosNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao  = (int) (carrosNumero / pessoasNumero);
		
		double resto = carrosNumero % pessoasNumero;
		
		System.out.println("Divisão para pessoas deu = " + divisao + " carros e sobrou " + resto + " carros");
		
		
		
	
	}
	
	
}