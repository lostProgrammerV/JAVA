package Lists.finalChallenge;

import javax.swing.JOptionPane;

public class jogoDaVelha {
    public static void main(String[] args) {
        int cont = 0;
        int pos = 0;
        String xO;

        String[][] tabuleiro = new String[3][3];

        for (int d = 0; d < 3; d++) {
            for (int c = 0; c < 3; c++) {
                cont += 1;
                tabuleiro[d][c] = "" + cont;
            }
        }

        String nomePlayer = JOptionPane.showInputDialog("Qual o nome do player 1");
        String nomePlayer2 = JOptionPane.showInputDialog("Qual o nome do player 2");

        do {
            cont += 1;

            if (cont % 2 == 0) {
                xO = "x";
            } else {
                xO = "o";
            }

            mostraTabuleiro(tabuleiro);
            if (cont % 2 == 0) {
                pos = Integer.parseInt(
                        JOptionPane.showInputDialog("Jogador(a) " + nomePlayer + " escolha uma posi��o (1 a 9)"));
            } else {
                pos = Integer.parseInt(
                        JOptionPane.showInputDialog("Jogador(a) " + nomePlayer2 + " escolha uma posi��o (1 a 9)"));
            }

            marcaPos(pos, tabuleiro, cont, xO);
            vitorias(tabuleiro, cont, nomePlayer, nomePlayer2);
        } while (true);
    }

    private static void marcaPos(int pos, String[][] tabuleiro, int cont, String xO) {
        String sPos = Integer.toString(pos);
        if (pos > 9 || pos < 1) {
            JOptionPane.showMessageDialog(null,
                    "A posi��o " + pos + " n�o existe, digite outro numero sua proxima vez");
            return;
        }

        for (int d = 0; d < 3; d++) {
            for (int c = 0; c < 3; c++) {
                if (sPos.contentEquals(tabuleiro[d][c])) {
                    tabuleiro[d][c] = xO;
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "A posi��o " + pos + " est� marcada, digite outro numero sua proxima vez");
    }

    private static void vitorias(String[][] tabuleiro, int cont, String nomePlayer, String nomePlayer2) {
        for (int d = 0; d < 3; d++) {
            for (int c = 0; c < 3; c++) {
                if (cont == 8) {
                    JOptionPane.showMessageDialog(null, "deu velha");
                    System.exit(0);
                }
                if (tabuleiro[d][0] == "x" && tabuleiro[d][1] == "x" && tabuleiro[d][2] == "x"
                        || tabuleiro[0][c] == "x" && tabuleiro[1][c] == "x" && tabuleiro[2][c] == "x"
                        || tabuleiro[d][0] == "x" && tabuleiro[1][1] == "x" && tabuleiro[c][2] == "x") {
                    JOptionPane.showMessageDialog(null, "O jogador " + nomePlayer + " (jogador 1) venceu");
                    System.exit(0);
                }
                if (tabuleiro[d][0] == "o" && tabuleiro[d][1] == "o" && tabuleiro[d][2] == "o"
                        || tabuleiro[0][c] == "o" && tabuleiro[1][c] == "o" && tabuleiro[2][c] == "o"
                        || tabuleiro[d][0] == "o" && tabuleiro[1][1] == "o" && tabuleiro[c][2] == "o") {
                    JOptionPane.showMessageDialog(null, "O jogador " + nomePlayer2 + " (jogador 2) venceu");
                    System.exit(0);
                }
            }
        }
    }

    private static void mostraTabuleiro(String[][] tabuleiro) {
        JOptionPane.showMessageDialog(null,
                tabuleiro[0][0] + " " + tabuleiro[0][1] + " " + tabuleiro[0][2] + "\n" + tabuleiro[1][0] + " "
                        + tabuleiro[1][1] + " " + tabuleiro[1][2] + "\n" + tabuleiro[2][0] + " " + tabuleiro[2][1] + " "
                        + tabuleiro[2][2] + "\n");
    }
}