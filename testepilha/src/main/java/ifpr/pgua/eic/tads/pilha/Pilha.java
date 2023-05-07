package ifpr.pgua.eic.tads.pilha;

import ifpr.pgua.eic.tads.pilha.exceptions.PilhaCheiaException;
import ifpr.pgua.eic.tads.pilha.exceptions.PilhaVaziaException;

public class Pilha {

    private Object[] elementos = new Object[5];
    private int quantidade = 0;

    public boolean estaVazia() {
        return (quantidade == 0);
    }

    public boolean estaCheia() {
        return (quantidade == elementos.length);
    }

    public int tamanho() {
        return quantidade;
    }

    public void empilhar(Object valor) throws PilhaCheiaException {
        if(estaCheia()){
            throw new PilhaCheiaException();
        }
        
        this.elementos[this.quantidade] = valor;
        this.quantidade += 1;
    }
    
    public Object topo() {
        return elementos[quantidade-1];
    }

    public Object desempilhar() throws PilhaVaziaException {
        if(estaVazia()){
            throw new PilhaVaziaException();
        }
        
        Object ultimo = topo();
        this.quantidade -= 1;
        return ultimo;
    }
}
