package lista2;

import javax.swing.JOptionPane;

public class ex03 {
	/*
	 * Escreva um programa que leia um número inteiro e apresente um menu para o
	 * usuário escolher: Verificar se o número é múltiplo de algum outro número
	 * (pedir ao usuário esse número); Verificar se o número é par; Verificar se o
	 * número está entre 0 e 1000; Sair Após as entradas de dados, deve ser mostrado
	 * ao usuário o resultado da respectiva opção escolhida, e novamente o menu.
	 * Para a opção “4- Sair”, utilize System.exit(0);
	 */
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha o que deseja fazer\n"
				+ "1 - É multiplo de algum numero?\n" + "2 - É par?\n" + "3 - É está entre 0 a 1000\n" + "4 - Sair"));
			switch (escolha) {
			case 1: {
				int multiplo = Integer.parseInt(JOptionPane.showInputDialog("Qual o multiplo desse número: " + num));
				multiplo = num / multiplo;
				JOptionPane.showMessageDialog(null,"O valor com o multiplo é: " + multiplo);
			break;
			}
			case 2: {
				if(num % 2 ==0){
					JOptionPane.showMessageDialog(null,"O número " + num + " é par");
				}else{
					JOptionPane.showMessageDialog(null,"O número "+ num +" não é par");
				}
			break;
			}
			case 3: {
				if(0 >= num && num <= 1000){
					JOptionPane.showMessageDialog(null,"O número está entre 0 e 1000");
				}
			break;
			}case 4: {
				System.exit(0);
			break;
			}
		}
	}
}
