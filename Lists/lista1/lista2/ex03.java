package Lists.lista1.lista2;

import javax.swing.JOptionPane;

public class ex03 {
	/*
	 * Escreva um programa que leia um n�mero inteiro e apresente um menu para o
	 * usu�rio escolher: Verificar se o n�mero � m�ltiplo de algum outro n�mero
	 * (pedir ao usu�rio esse n�mero); Verificar se o n�mero � par; Verificar se o
	 * n�mero est� entre 0 e 1000; Sair Ap�s as entradas de dados, deve ser mostrado
	 * ao usu�rio o resultado da respectiva op��o escolhida, e novamente o menu.
	 * Para a op��o �4- Sair�, utilize System.exit(0);
	 */
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha o que deseja fazer\n"
				+ "1 - � multiplo de algum numero?\n" + "2 - � par?\n" + "3 - � est� entre 0 a 1000\n" + "4 - Sair"));
		switch (escolha) {
			case 1: {
				int multiplo = Integer.parseInt(JOptionPane.showInputDialog("Qual o multiplo desse n�mero: " + num));
				multiplo = num / multiplo;
				JOptionPane.showMessageDialog(null, "O valor com o multiplo �: " + multiplo);
				break;
			}
			case 2: {
				if (num % 2 == 0) {
					JOptionPane.showMessageDialog(null, "O n�mero " + num + " � par");
				} else {
					JOptionPane.showMessageDialog(null, "O n�mero " + num + " n�o � par");
				}
				break;
			}
			case 3: {
				if (0 >= num && num <= 1000) {
					JOptionPane.showMessageDialog(null, "O n�mero est� entre 0 e 1000");
				}
				break;
			}
			case 4: {
				System.exit(0);
				break;
			}
		}
	}
}
