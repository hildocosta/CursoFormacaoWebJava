package cursojava.classes;

import java.util.Objects;

public class Aluno {
	
	//Esses são os atributos do Aluno
		// Gerar Get e Set dos novos atributos do Aluno
		 
		private String nome;
		private int idade;
		private String dataNascimento;
		private String registroGeral;
		private String numeroCpf;
		private String nomeMae;
		private String nomePai;
		private String dataMatricula;
		private String nomeEscola;
		private String serieMatriculado;
		private double nota1;
		private double nota2;
		private double nota3;
		private double nota4;


		
		//------------------------------------------------
		//Métodos Getters e Setters dos Atributos do Aluno
		
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}


		public void setIdade(int idade) {
			this.idade = idade;
		}

		
		public String getDataNascimento() {
			return dataNascimento;
		}
		

		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		
		public String getRegistroGeral() {
			return registroGeral;
		}

		public void setRegistroGeral(String registroGeral) {
			this.registroGeral = registroGeral;
		}
		
		
		public String getNumeroCpf() {
			return numeroCpf;
		}

		public void setNumeroCpf(String numeroCpf) {
			this.numeroCpf = numeroCpf;
		}

		public String getNomeMae() {
			return nomeMae;
		}


		public void setNomeMae(String nomeMae) {
			this.nomeMae = nomeMae;
		}

		public String getNomePai() {
			return nomePai;
		}


		public void setNomePai(String nomePai) {
			this.nomePai = nomePai;
		}


		public String getDataMatricula() {
			return dataMatricula;
		}

		
		public void setDataMatricula(String dataMatricula) {
			this.dataMatricula = dataMatricula;
		}

		
		public String getNomeEscola() {
			return nomeEscola;
		}


		public void setNomeEscola(String nomeEscola) {
			this.nomeEscola = nomeEscola;
		}


		public String getSerieMatriculado() {
			return serieMatriculado;
		}


		public void setSerieMatriculado(String serieMatriculado) {
			this.serieMatriculado = serieMatriculado;
		}


		public double getNota1() {
			return nota1;
		}


		public void setNota1(double nota1) {
			this.nota1 = nota1;
		}


		public double getNota2() {
			return nota2;
		}


		public void setNota2(double nota2) {
			this.nota2 = nota2;
		}
		

		public double getNota3() {
			return nota3;
		}


		public void setNota3(double nota3) {
			this.nota3 = nota3;
		}


		public double getNota4() {
			return nota4;
		}
		

		public void setNota4(double nota4) {
			this.nota4 = nota4;
		}



		//Método que retorna o Cálculo da Média do Aluno

		public double getMediaNota() {
		  return (nota1 + nota2 + nota3 + nota4) / 4;
		}
		
		
		
		//Método com retorno true para aprovado e false para reprovado

		public boolean getAlunoAprovado() {
		  double media = this.getMediaNota();
		 
		if (media >= 70) {
		return true;

		} else {
		return false;

		}

		}

		// Método usando String para imprimir aprovado ou reprovado

		public String getAlunoAprovado2() {
		  double media = this.getMediaNota();
		 
		if (media >= 70) {
		return "Aluno está aprovado";

		} else {
		return "Aluno está reprovado";

		}
		}

		
		//Método toString para todos os atributos do Aluno
		@Override
		public String toString() {
			return "Aluno [nome=" + getNome() + ", idade=" + getIdade() + ", dataNascimento=" + dataNascimento
					+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
					+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
					+ ", serieMatriculado=" + serieMatriculado + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3="
					+ nota3 + ", nota4=" + nota4 + "]";
		}
        
		//Método para diferenciar Objetos, Nome e Cpf, utilizando Equals e Hashcode
		@Override
		public int hashCode() {
			return Objects.hash(nome, numeroCpf);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
		}
		
		
		
		
		
}



