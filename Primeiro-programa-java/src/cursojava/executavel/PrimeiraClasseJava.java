package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		
		/*New Aluno é uma instancia (Criação de Objeto)*/
		/*aluno1 é uma referencia para o objeto aluno*/
		
		/*String nome = JOptionPane.showInputDialog("Qual o nome do Aluno?");
		String idade = JOptionPane.showInputDialog("Qual a Idade do Aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a Data de Nascimento do Aluno?");
		String rg = JOptionPane.showInputDialog("Qual é o Nº da Identidade do Aluno?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF do Aluno?");
		String mae = JOptionPane.showInputDialog("Qual o nome da Mãe do Aluno?");
		String pai = JOptionPane.showInputDialog("Qual o nome do Pai do Aluno?");
		String matricula = JOptionPane.showInputDialog("Qual a data de Matricula do Aluno?");
		String serie = JOptionPane.showInputDialog("Qual a serie de Matricula do Aluno?");
		String escola = JOptionPane.showInputDialog("Qual o nome da Escola do Aluno?");
		
		String nota1 = JOptionPane.showInputDialog("Qual é a Nota 01 do Aluno?");
		String nota2 = JOptionPane.showInputDialog("Qual é a Nota 02 do Aluno?");
		String nota3 = JOptionPane.showInputDialog("Qual é a Nota 03 do Aluno?");
		String nota4 = JOptionPane.showInputDialog("Qual é a Nota 04 do Aluno?");
		
		Aluno aluno1 = new Aluno(); /*Aqui será o João
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));*/
		
		/*System.out.println(aluno1.toString()); /*Descrição do Objeto na Memória
		System.out.println("Média do Aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());*/
		
		/*Equals e Hascode (Diferenciar e  Comparar Objetos)*/
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Daniel");
		aluno1.setNumeroCpf("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Daniel");
		aluno2.setNumeroCpf("1234");
		
		if(aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais");
		}else {
			System.out.println("Alunos não são iguais");
		}
	}
}