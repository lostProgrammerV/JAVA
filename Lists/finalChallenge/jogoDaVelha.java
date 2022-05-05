package Lists.finalChallenge;

import java.util.Vector;

import javax.swing.JOptionPane;

public class jogoDaVelha {
    String[][] posicao = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

    public static void main(String[] args) {
        jogoDaVelha jg = new jogoDaVelha();
    }

    public String mostraJogada() {
        for (int c = 0; c < 3; c++) {
            for (int d = 0; d < 3; d++) {
                JOptionPane.showMessageDialog(null, "  " + posicao[c][d]);
            }
        }
        return null;
    }

    public boolean Valida(String posi) {
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                if (posicao[c][l].equals(posi)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void Jogada(String posi, String x) {
        if (posi.equals("1")) {
            posicao[0][0] = x;
        } else if (posi.equals("2")) {
            posicao[0][1] = x;
        } else if (posi.equals("3")) {
            posicao[0][2] = x;
        } else if (posi.equals("4")) {
            posicao[1][0] = x;
        } else if (posi.equals("5")) {
            posicao[1][1] = x;
        } else if (posi.equals("6")) {
            posicao[1][2] = x;
        } else if (posi.equals("7")) {
            posicao[2][0] = x;
        } else if (posi.equals("8")) {
            posicao[2][1] = x;
        } else if (posi.equals("9")) {
            posicao[2][2] = x;
        }
    }

    public String vitorias(int Jogadas) {
        String[] vit1 = new String[0];
        String vencedor = null;
        if (Jogadas == 2) {
            vencedor = "empate";
        }
        vit1[0] = ;
        vit1[0] = ;
        vit1[0] = ;
        
        vit1[0] = ;
        vit1[0] = ;
        vit1[0] = ;

        vit1[0] = ;
        vit1[0] = ;
        for(int c = 0; c <vit1.length; c ++){
            if(vit1[c].equals("xxx")){
                vencedor = "Jogador 1";
            }else if(vit1[c].equals("ooo")){
                vencedor = "Jogador 2";
            }
        }
    }
}
