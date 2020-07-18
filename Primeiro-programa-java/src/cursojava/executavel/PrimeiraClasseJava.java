package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		
		/*New Aluno é uma instancia (Criação de Objeto)*/
		/*aluno1 é uma referencia para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno?");
		String idade = JOptionPane.showInputDialog("Qual a Idade do Aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a Data de Nascimento do Aluno?");
		String rg = JOptionPane.showInputDialog("Qual é o Nº da Identidade do Aluno?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF do Aluno?");
		String mae = JOptionPane.showInputDialog("Qual o nome da Mãe do Aluno?");
		String pai = JOptionPane.showInputDialog("Qual o nome do Pai do Aluno?");
		String matricula = JOptionPane.showInputDialog("Qual a data de Matricula do Aluno?");
		String serie = JOptionPane.showInputDialog("Qual a serie de Matricula do Aluno?");
		String escola = JOptionPane.showInputDialog("Qual o nome da Escola do Aluno?");
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
		String nota1 = JOptionPane.showInputDialog("Qual é a Nota 01 do Aluno?");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
		String nota2 = JOptionPane.showInputDialog("Qual é a Nota 02 do Aluno?");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
		String nota3 = JOptionPane.showInputDialog("Qual é a Nota 03 do Aluno?");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
		String nota4 = JOptionPane.showInputDialog("Qual é a Nota 04 do Aluno?");
		
		Aluno aluno1 = new Aluno(); /*Aqui será o João*/
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
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		System.out.println(aluno1.toString()); /*Descrição do Objeto na Memória*/
		System.out.println("Média do Aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
	}
}