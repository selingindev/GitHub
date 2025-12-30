package jogador;

import cartas.CartaModel;

public class JogadorModel {

    private String nome;
    private CartaModel[] mao =  new CartaModel[3];

    public JogadorModel(String nome, CartaModel[] mao) {
        this.nome = nome;   
        this.mao = mao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CartaModel[] getMao() {
        return mao;
    }

}