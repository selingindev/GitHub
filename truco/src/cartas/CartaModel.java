package cartas;

public class CartaModel {

    private EnumNumero numero;   
    private int peso;
    private EnumNipe nipe;

    public CartaModel(EnumNumero numero, int peso, EnumNipe nipe) {
        this.numero = numero;
        this.peso = peso;
        this.nipe = nipe;
    }

    public EnumNumero getNumero() {
        return numero;
    }
    public void setNumero(EnumNumero numero) {
        this.numero = numero;
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
