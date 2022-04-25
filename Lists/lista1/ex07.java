package Lists.lista1;

import javax.swing.JOptionPane;

public class ex07 {
	/*
	 * Fa�a uma solu��o que alimente um vetor com 10
	 * valores inteiros e tamb�m que solicite ao usu�rio
	 * a entrada de dados de um valor inteiro qualquer.
	 * A solu��o dever� fazer uma busca do valor,
	 * informado pelo usu�rio, no vetor e imprima a
	 * posi��o em que este foi encontrado ou se n�o foi
	 * encontrado.
	 */
	public static void main(String[] args) {
		int[] vetor = new int[10];
		int escolha;

		for (int c = 0; c < 10; c++) {
			vetor[c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (c + 1) + " valor"));
			while (vetor[c] < 0) {
				vetor[c] = Integer
						.parseInt(JOptionPane.showInputDialog("valores negativos n�o s�o aceitos, digite novamente"));
			}
			;
		}
		escolha = Integer.parseInt(JOptionPane.showInputDialog("Qual n�mero deseja achar a posi��o"));
		for (int c = 0; c < 10; c++) {
			if (escolha == vetor[c]) {
				System.out.println(escolha + " o valor " + c);
			}
		}
	}
}
