package Lists.lista1;

import javax.swing.JOptionPane;

public class ex05 {
	/*
	 * Fa�a um algoritmo que pe�a ao usu�rio 10 n�meros e
	 * mostre posteriormente quantos s�o pares e a soma deles,
	 * bem como quantos s�o �mpares e a soma deles.
	 */
	public static void main(String[] args) {
		int valor = 0;
		int addEven = 0, allEven = 0;
		int addOdd = 0, allOdd = 0;

		for (int c = 1; c < 11; c++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + c + " valor"));

			while (valor < 0) {
				valor = Integer
						.parseInt(JOptionPane.showInputDialog("Digite novamente, n�o aceitamos valores negativos"));
			}

			if (valor % 2 == 0) {
				addEven += 1;
				allEven += valor;
			} else {
				addOdd += 1;
				allOdd += valor;
			}
		}
		System.out.println("A soma dos pares � " + allEven + ", e sua quantidade � de " + addEven);
		System.out.println("A soma dos impares � " + allOdd + ", e sua quantidade � de " + addOdd);
	}
}
