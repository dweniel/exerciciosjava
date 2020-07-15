package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		
		/*New Aluno é uma instancia (Criação de Objeto)*/
		/*aluno1 é uma referencia para o objeto aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui será o João*/
		System.out.println("Dados do Aluno 01");
		System.out.println("");
		aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("04/03/1999");
		aluno1.setRegistroGeral("1.651.500");
		aluno1.setNumeroCpf("14545.757.7675");
		aluno1.setNomeMae("Marcia");
		aluno1.setNomePai("David");
		aluno1.setDataMatricula("14/07/2020");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Escola JDEV Treinamento");
		
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Data de Nascimento é = " + aluno1.getDataNascimento());
		System.out.println("Nome é = " + aluno1.getRegistroGeral());
		System.out.println("Numero do CPF é = " + aluno1.getNumeroCpf());
		System.out.println("Nome da Mãe é = " + aluno1.getNomeMae());
		System.out.println("Nome do Pai é = " + aluno1.getNomePai());
		System.out.println("Numero da Matricula é = " + aluno1.getDataMatricula());
		System.out.println("Série do Matriculado é = " + aluno1.getSerieMatriculado());
		System.out.println("Nome da Escola é = " + aluno1.getNomeEscola());
		System.out.println("");
		
		System.out.println("------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Dados do Aluno 02");
		System.out.println("");
		Aluno aluno2 = new Aluno(); /*Aqui será o Pedro*/
		
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1970");
		aluno2.setRegistroGeral("2.651.520");
		aluno2.setNumeroCpf("14545.757.7675");
		aluno2.setNomeMae("Juliana");
		aluno2.setNomePai("Marcos");
		aluno2.setDataMatricula("14/07/2020");
		aluno2.setSerieMatriculado("10");
		aluno2.setNomeEscola("Escola JDEV Treinamento");
		
		System.out.println("Nome é = " + aluno2.getNome());
		System.out.println("Idade é = " + aluno2.getIdade());
		System.out.println("Data de Nascimento é = " + aluno2.getDataNascimento());
		System.out.println("Nome é = " + aluno2.getRegistroGeral());
		System.out.println("Numero do CPF é = " + aluno2.getNumeroCpf());
		System.out.println("Nome da Mãe é = " + aluno2.getNomeMae());
		System.out.println("Nome do Pai é = " + aluno2.getNomePai());
		System.out.println("Numero da Matricula é = " + aluno2.getDataMatricula());
		System.out.println("Série do Matriculado é = " + aluno2.getSerieMatriculado());
		System.out.println("Nome da Escola é = " + aluno2.getNomeEscola());
		
		System.out.println("------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Dados do Aluno 03");
		System.out.println("");
		Aluno aluno3 = new Aluno(); /*Aqui será o Alex*/
		
		aluno3.setNome("Alex da Silva");
		aluno3.setIdade(21);
		aluno3.setDataNascimento("10/10/1999");
		aluno3.setRegistroGeral("3.651.520");
		aluno3.setNumeroCpf("14545.757.7675");
		aluno3.setNomeMae("Jhenifer");
		aluno3.setNomePai("Daniel");
		aluno3.setDataMatricula("13/07/2020");
		aluno3.setSerieMatriculado("8");
		aluno3.setNomeEscola("Escola JDEV Treinamento");
		
		System.out.println("Nome é = " + aluno3.getNome());
		System.out.println("Idade é = " + aluno3.getIdade());
		System.out.println("Data de Nascimento é = " + aluno3.getDataNascimento());
		System.out.println("Nome é = " + aluno3.getRegistroGeral());
		System.out.println("Numero do CPF é = " + aluno3.getNumeroCpf());
		System.out.println("Nome da Mãe é = " + aluno3.getNomeMae());
		System.out.println("Nome do Pai é = " + aluno3.getNomePai());
		System.out.println("Numero da Matricula é = " + aluno3.getDataMatricula());
		System.out.println("Série do Matriculado é = " + aluno3.getSerieMatriculado());
		System.out.println("Nome da Escola é = " + aluno3.getNomeEscola());
		
		System.out.println("------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Dados do Aluno 04");
		System.out.println("");
		Aluno aluno4 = new Aluno(); /*Aqui será Maria*/
		
		aluno4.setNome("Maria Fernanda Campos");
		aluno4.setIdade(21);
		aluno4.setDataNascimento("12/04/1999");
		aluno4.setRegistroGeral("4.651.520");
		aluno4.setNumeroCpf("14545.857.9675");
		aluno4.setNomeMae("Paula");
		aluno4.setNomePai("Junior");
		aluno4.setDataMatricula("12/05/2020");
		aluno4.setSerieMatriculado("9");
		aluno4.setNomeEscola("Escola JDEV Treinamento");
		
		System.out.println("Nome é = " + aluno4.getNome());
		System.out.println("Idade é = " + aluno4.getIdade());
		System.out.println("Data de Nascimento é = " + aluno4.getDataNascimento());
		System.out.println("Nome é = " + aluno4.getRegistroGeral());
		System.out.println("Numero do CPF é = " + aluno4.getNumeroCpf());
		System.out.println("Nome da Mãe é = " + aluno4.getNomeMae());
		System.out.println("Nome do Pai é = " + aluno4.getNomePai());
		System.out.println("Numero da Matricula é = " + aluno4.getDataMatricula());
		System.out.println("Série do Matriculado é = " + aluno4.getSerieMatriculado());
		System.out.println("Nome da Escola é = " + aluno4.getNomeEscola());
		
		System.out.println("------------------------------------------------------");
		System.out.println("");
		
	}
}