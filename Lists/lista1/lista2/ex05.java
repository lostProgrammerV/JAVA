package Lists.lista1.lista2;

import javax.swing.JOptionPane;

public class ex05 {
	/*
	 * Fa�a um programa que solicite alguns dados dos usu�rios que frequentam um
	 * clube.
	 * O programa deve solicitar a idade, se a pessoa � fumante ou n�o (1- SIM, 2-
	 * N�O),
	 * seu sal�rio l�quido e h� quanto tempo frequenta o clube (em meses).
	 * O usu�rio dever� digitar �encerrar� quando n�o tiver
	 * mais pessoas para registrar.
	 * Como dados de sa�da, o programa deve exibir:
	 * A m�dia das idades das pessoas;
	 * A m�dia salarial das pessoas;
	 * Quantos s�o fumantes e quantos n�o s�o fumantes;
	 * A porcentagem de pessoas que frequentam o clube h� mais de 03 meses.
	 */
	public static void main(String[] args) {
		String continuar = "";

		double tempo = 0;
		double acimaTempo = 0;
		double porcentTempo = 0;

		int qntFumantes = 0;
		int qntNFumantes = 0;

		int contaClienete = 0;
		int fumante = 0;

		int idade = 0;
		int somaIdade = 0;
		int mediaIdade = 0;

		int salario = 0;
		int somaSalario = 0;
		int mediaSalario = 0;

		do {
			contaClienete += 1;

			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente " + contaClienete));
			while (idade < 18) {
				idade = Integer
						.parseInt(JOptionPane.showInputDialog("N�o s�o permitidos clientes com menores de 18 anos"));
			}
			somaIdade += idade;

			salario = Integer.parseInt(JOptionPane.showInputDialog("Quanto o cliente " + contaClienete + " ganha ?"));
			while (salario < 500) {
				salario = Integer
						.parseInt(JOptionPane.showInputDialog("N�o � aceito salario negativo ou abaixo de 500"));
			}
			somaSalario += salario;

			fumante = Integer.parseInt(
					JOptionPane.showInputDialog("O cliente " + contaClienete + " � fumante ? (1- SIM, 2- N�O)"));
			if (fumante == 1) {
				qntFumantes += 1;
			} else {
				qntNFumantes += 1;
			}

			tempo = Integer.parseInt(JOptionPane.showInputDialog(
					"Quanto tempo o cliente " + contaClienete + " frequenta o estabelecimento ?\nEm meses"));
			if (tempo >= 3) {
				acimaTempo += 1;
			}

			continuar = JOptionPane.showInputDialog("Deseja continuar? sim, encerrar (finalizar)");
		} while (continuar.equals("sim"));

		mediaSalario = somaSalario / contaClienete;
		mediaIdade = somaIdade / contaClienete;
		porcentTempo = (acimaTempo / contaClienete) * 100;

		JOptionPane.showMessageDialog(null,
				"A m�dia das idades das pessoas: " + mediaIdade + "\nA m�dia salarial das pessoas: " + mediaSalario
						+ "\nFumantes: " + qntFumantes + "\nN�o fumantes: " + qntNFumantes
						+ "\nClientes acima de 3 meses: " + porcentTempo + "%");
	}
}
