package Lists.lista1;

import javax.swing.JOptionPane;

public class ex02 {
	/*
	 * Desenvolva um programa que pergunte qual � a maioridade
	 * civil do seu �estado/pa�s� e que posteriormente o usu�rio
	 * informe sua idade. Como resultado,
	 * o programa deve informar se ele � ou n�o maior de idade.
	 */
	public static void main(String[] args) {
		int cidadeEstado = Integer.parseInt(JOptionPane.showInputDialog("Digite a maior idade em sua cidade/estado"));
		while (cidadeEstado < 0) {
			cidadeEstado = Integer.parseInt(JOptionPane.showInputDialog("Digite a maior idade em sua cidade/estado"));
		}

		int idadeAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade atual"));
		while (idadeAtual < 0) {
			idadeAtual = Integer
					.parseInt(JOptionPane.showInputDialog("Sua idade n�o pode ser negativa, digite novamente"));
		}

		if (cidadeEstado < idadeAtual) {
			System.out.println("Voc� � maior de idade");
		} else {
			System.out.println("Voc� n�o � maior idade");
		}
	}
}
