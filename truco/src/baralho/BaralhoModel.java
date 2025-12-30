package baralho;

import java.util.ArrayList;
import java.util.List;

import cartas.CartaModel;

public class BaralhoModel {
    private List<CartaModel> cartas = new ArrayList<>();
    private CartaModel vira;


    public BaralhoModel() {
    }

    public List<CartaModel> getCartas() {
        return cartas;
    }

    public void setCartas(List<CartaModel> cartas) {
        this.cartas = cartas;
    }

    public CartaModel getVira() {
        return vira;
    }

    public void setVira(CartaModel vira) {
        this.vira = vira;
    }
   

}
