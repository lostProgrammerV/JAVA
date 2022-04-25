package Lists.lista1;

import javax.swing.JOptionPane;

public class ex04 {
	/*
	 * Fa�a um algoritmo que mostre a soma de todos os
	 * valores pares entre o intervalo de dois n�meros
	 * digitados pelo usu�rio.
	 */
	public static void main(String[] args) {
		int aux;
		int addEven = 0;

		int inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o inicio"));

		while (inicio < 0) {
			inicio = Integer.parseInt(JOptionPane.showInputDialog("O inicio n�o pode ser negativo"));
		}

		int fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o fim"));
		while (fim < 0) {
			fim = Integer.parseInt(JOptionPane.showInputDialog("O fim n�o pode ser negativo"));
		}

		if (fim < inicio) {
			aux = inicio;
			inicio = fim;
			fim = aux;
		}

		for (int c = inicio; c <= fim; c++) {
			if (c % 2 == 0) {
				addEven += c;
			}
		}
		System.out.println("A soma dos n�meros pares � " + addEven);
	}
}
