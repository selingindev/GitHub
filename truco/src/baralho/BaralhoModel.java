package baralho;

import java.util.ArrayList;
import java.util.List;

import cartas.CartaModel;
import cartas.EnumNipe;
import cartas.EnumNumero;
import jogador.JogadorModel;

public class BaralhoModel {
    private List<CartaModel> cartas = new ArrayList<>();
    private CartaModel vira;
    
    public BaralhoModel() {
        buildCartas();
    }

    public List<CartaModel> getCartas() {
        return cartas;
    }

    private void buildCartas() {
        int peso = 4;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                cartas.add(new CartaModel(EnumNumero.values()[i], peso, EnumNipe.values()[j]));
            }
            peso++;
        }
        for (CartaModel carta : cartas) {
            System.out
                    .println("Carta: " + carta.getNumero() + " de " + carta.getNipe());
        }
    }

    private void removerCarta(CartaModel carta) {
        cartas.remove(carta);
    }

    private CartaModel virarCarta() {
        int idx = (int) (Math.random() * cartas.size());
        CartaModel carta = cartas.get(idx);
        removerCarta(cartas.get(idx));
        return carta;
    }

    private void darCarta(List<JogadorModel> Jogadores) {
        
        for (JogadorModel jogador : Jogadores){
             if(Jogadores.size() ) 
        
        } 

    }

}
