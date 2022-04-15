package lista2;

import javax.swing.JOptionPane;

public class ex06 {
	/*
	 * Uma empresa deseja saber alguns dados sobre suas vendas no passado. 
	 * Faça um programa que armazene em um vetor o valor total das vendas 
	 * de cada um dos 12 meses do ano (que deverá ser informado pelo usuário) 
	 * e mostre:
	 * O mês com a maior venda;
	 * O mês com a menor venda;
	 * A média das vendas do ano todo;
	 * A média das vendas dos meses pares;
	 * A média das vendas do 2º semestre.
	 */
	public static void main(String[] args) {
		int[] vendas = new int[12];
		
		int maiorValor = 0;
		int menorValor = 0;
		int mediaTotal = 0;
		int mediaPar = 0;
		int media2semetre  = 0; 
		int somaTotal = 0;
		int qnt = 0;
		int soma2meses = 0;
		
		for(int c = 0;c < 12; c ++){
			vendas[c] = Integer.parseInt(JOptionPane.showInputDialog("Digite as vendas do " + (c + 1) +" mes"));
			somaTotal += vendas[c];
			if(c == 0){
				maiorValor = vendas[c];
				menorValor = vendas[c];
			}else if(vendas[c] > maiorValor){
				maiorValor = vendas[c];
			}else{
				menorValor = vendas[c];
			}
			if(c > 6){
				soma2meses += vendas[c];
			}else if(c % 2 == 0){
				qnt += 1;
			}
		}
		mediaTotal = somaTotal / 12;
		mediaPar = qnt / 12;
		media2semetre = soma2meses / 6;
		JOptionPane.showMessageDialog(null,"O maior número: " + maiorValor + "\nO menor número: " + menorValor 
				+ "\nMedia do ano todo: " + mediaTotal + "\nMedia par: " + mediaPar 
				+ "\nMedia do 2 semestre: " + media2semetre);
	}
}
