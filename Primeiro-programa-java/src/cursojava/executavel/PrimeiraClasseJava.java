package cursojava.executavel;

public class PrimeiraClasseJava {

	/* Main � um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* Estrutura de Repeti��o For com Break */

		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3) {
				System.out.println("Oba, encontrei o n�mero 3");
				System.out.println("Estou parando de executar");
				break;
				}
			}
		}
	}