package cartas;

public class CartaModel {

    private EnumNumero nome;   
    private int peso;
    private EnumNipe nipe;

    public CartaModel(EnumNumero nome, int peso, EnumNipe nipe) {
        this.nome = nome;
        this.peso = peso;
        this.nipe = nipe;
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
    public EnumNipe getNipe() {
        return nipe;
    }
    public void setNipe(EnumNipe nipe) {
        this.nipe = nipe;
    }
}
