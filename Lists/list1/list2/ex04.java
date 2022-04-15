package lista2;

import javax.swing.JOptionPane;

public class ex04 {
	/*
	 * Sabe-se que o latão é constituído de 70% de cobre e 30% de zinco. 
	 * Faça um programa que permita ao usuário informar uma quantidade de latão em quilos 
	 * e forneça o total de cobre e zinco necessários para fabricar essa quantidade.
	 */
	public static void main(String[] args) {
		double zinco = 0;
		double cobre = 0;
		int latao = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de latão"));
		cobre = latao * 0.70;
		zinco = latao * 0.30;
		JOptionPane.showMessageDialog(null,"Para essa quantidade de latão: " + latao 
				+ "\nCobre: " + cobre + "\nZinco: " + zinco);
	}
}
