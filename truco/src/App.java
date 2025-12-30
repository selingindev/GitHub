import java.util.ArrayList;
import java.util.List;

import baralho.BaralhoController;
import baralho.BaralhoModel;
import jogador.JogadorModel;

public class App {
    public static void main(String[] args) throws Exception {
        BaralhoModel baralhoModel = new BaralhoModel();
        BaralhoController baralhoController = new BaralhoController();
        List<JogadorModel> jogadores = new ArrayList<>();

        JogadorModel jogador1 = new JogadorModel("Player1", null);
        JogadorModel jogador2 = new JogadorModel("Player2", null);

        jogadores.add(jogador1);
        jogadores.add(jogador2);
    
        baralhoController.buildCartas();
        baralhoController.destribuirCartas()jogadores;

    }
}
