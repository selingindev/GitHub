package cartas;

public class CartaModel {

    private EnumNumero nome;   
    private int peso;
    private EnumNaipe naipe;

    public CartaModel(EnumNumero nome, int peso, EnumNaipe naipe) {
        this.nome = nome;
        this.peso = peso;
        this.naipe = naipe;
    }

    public EnumNumero getNumero() {
        return nome;
    }
    public void setNumero(EnumNumero nome) {
        this.nome = nome;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public EnumNaipe getNaipe() {
        return naipe;
    }
    public void setNaipe(EnumNaipe naipe) {
        this.naipe = naipe;
    }
}
