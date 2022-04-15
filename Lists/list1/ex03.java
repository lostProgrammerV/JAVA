package lista1;

import javax.swing.JOptionPane;

public class ex03 {
	/*
	 * Faça um programa que peça ao usuário para informar 
	 * 03 números e mostre o menor entre eles. 
	 * Considere que o usuário não poderá informar 
	 * números iguais.
	 */
	public static void main(String[] args) {
		
		int menorV = 0;
		
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1 numero"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2 numero"));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3 numero"));
		
		if((valor == valor2) || (valor2 == valor3) || (valor == valor3) || (valor2 == valor) || (valor3 == valor)){
			System.out.println("numéros iguais não são aceitos, tente novamente");
		}else if((valor < valor2) && (valor < valor3)){
			menorV = valor;
			System.out.println("O menor valor é " + menorV);
		}else if((valor2 < valor) && (valor2 < valor3)){
			System.out.println("O menor valor é " + menorV);
		}else if((valor3 < valor) && (valor3 < valor2)){
			System.out.println("O menor valor é " + menorV);
		}
	}
}
