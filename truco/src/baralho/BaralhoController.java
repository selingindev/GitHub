package baralho;

import java.util.ArrayList;
import java.util.List;

import cartas.CartaModel;
import cartas.EnumNipe;
import cartas.EnumNumero;
import jogador.JogadorModel;

public class BaralhoController {

    private BaralhoModel baralhoModel = new BaralhoModel();
    private List<CartaModel> cartas = new ArrayList<>();

    public void buildCartas() {
        int peso = 4;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                cartas.add(new CartaModel(EnumNumero.values()[i], peso, EnumNipe.values()[j]));
            }
            peso++;
        }
        baralhoModel.setCartas(cartas);
    }

    private void removerCarta(CartaModel carta) {
        cartas.remove(carta);
    }

    private CartaModel darCarta() {
        int idx = (int) (Math.random() * cartas.size());
        CartaModel carta = cartas.get(idx);
        removerCarta(carta);
        return carta;
    }

    private CartaModel virarCarta() {
        baralhoModel.setVira(darCarta());
        return baralhoModel.getVira();
    }

    private void destruirBaralho() {
        cartas.clear();
    }

    public void destribuirCartas(List<JogadorModel> jogadores) {
        int numeroJogadores = jogadores.size();
        for (int i = 0; i < numeroJogadores; i++) {
            if (numeroJogadores % 2 == 3 && i == 3) virarCarta();
            if (numeroJogadores % 2 == 2 && i == 2) virarCarta();
            if (numeroJogadores % 2 == 1 && i == 1)  virarCarta();          
            JogadorModel jogador = jogadores.get(i);
            CartaModel[] mao = new CartaModel[3];
            for (int j = 0; j < 3; j++) {
                mao[j] = darCarta();
            }
            jogador.setMao(mao);
        }

    }

}
