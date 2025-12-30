import java.util.ArrayList;
import java.util.List;

import baralho.BaralhoController;

import jogador.JogadorModel;

public class App {
    public static void main(String[] args) throws Exception {
        BaralhoController baralhoController = new BaralhoController();
        List<JogadorModel> jogadores = new ArrayList<>();

        JogadorModel jogador1 = new JogadorModel("Player1", null);
        JogadorModel jogador2 = new JogadorModel("Player2", null);

        jogadores.add(jogador1);
        jogadores.add(jogador2);
    
        baralhoController.buildCartas();
        baralhoController.destribuirCartas(jogadores);

        for (JogadorModel jogador : jogadores) {
            System.out.println("Mão do " + jogador.getNome() + ":");
            for (var carta : jogador.getMao()) {
                System.out.println("- " + carta.getNumero() + " de " + carta.getNaipe());
            }
        }
        System.out.println(baralhoController.getVira().getNumero() + " de " + baralhoController.getVira().getNaipe() + " é a carta virada."); 

        jogador1.jogarCarta(jogador1.getMao()[0]);
        jogador2.jogarCarta(jogador2.getMao().get(0));
        
    }
}
