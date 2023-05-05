package ifpr.pgua.eic.tads.pilha;

public class Pilha {

    private Object[] elementos = new Object[5];
    private int quantidade = 0;

    public boolean estaVazia() {
        return (quantidade == 0);
    }

    public int tamanho() {
        return quantidade;
    }

    public void empilhar(Object valor) {
        this.elementos[this.quantidade] = valor;
        this.quantidade += 1;
    }
    
    public Object topo() {
        return elementos[quantidade-1];
    }

    public Object desempilhar() {
        Object ultimo = topo();
        this.quantidade -= 1;
        return ultimo;
    }
}
