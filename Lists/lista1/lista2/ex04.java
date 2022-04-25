package Lists.lista1.lista2;

import javax.swing.JOptionPane;

public class ex04 {
	/*
	 * Sabe-se que o lat�o � constitu�do de 70% de cobre e 30% de zinco.
	 * Fa�a um programa que permita ao usu�rio informar uma quantidade de lat�o em
	 * quilos
	 * e forne�a o total de cobre e zinco necess�rios para fabricar essa quantidade.
	 */
	public static void main(String[] args) {
		double zinco = 0;
		double cobre = 0;
		int latao = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de lat�o"));
		cobre = latao * 0.70;
		zinco = latao * 0.30;
		JOptionPane.showMessageDialog(null, "Para essa quantidade de lat�o: " + latao
				+ "\nCobre: " + cobre + "\nZinco: " + zinco);
	}
}
