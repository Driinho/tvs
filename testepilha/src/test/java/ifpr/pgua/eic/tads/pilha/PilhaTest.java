package ifpr.pgua.eic.tads.pilha;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ifpr.pgua.eic.tads.pilha.exceptions.PilhaCheiaException;
import ifpr.pgua.eic.tads.pilha.exceptions.PilhaVaziaException;

public class PilhaTest {
    
    private Pilha p;

    @BeforeEach
    public void criaPilha() {
        p = new Pilha();
    }

    @Test
    public void verificaPilhaVazia() {
        // Ação
        assertTrue(p.estaVazia());
        assertEquals(0, p.tamanho());
    }

    @Test
    public void empilhaUmElemento() throws PilhaCheiaException {
        // Ação
        p.empilhar("primeiro");

        //Verificação
        assertFalse(p.estaVazia());
        assertEquals(1, p.tamanho());
        assertEquals("primeiro", p.topo());
    }

    @Test
    public void empilharDoisDesempilharUm() throws PilhaVaziaException, PilhaCheiaException {
        // Cenário
        p.empilhar("primeiro");
        p.empilhar("segundo");

        // Verificação
        assertFalse(p.estaVazia());
        assertEquals(2, p.tamanho());
        assertEquals("segundo", p.topo());
    
        // Ação
        Object retorno = p.desempilhar();

        // Verificação
        assertEquals(1, p.tamanho());
        assertEquals("segundo", retorno);
        assertEquals("primeiro", p.topo());
    }

    @Test
    public void testePilhaVaziaException() {
        // Verificação
        assertThrows(PilhaVaziaException.class, () -> p.desempilhar());
    }

    @Test
    public void testePilhaCheia() throws PilhaCheiaException {
        // Cenário
        p.empilhar("primeiro");
        p.empilhar("segundo");
        p.empilhar("terceiro");
        p.empilhar("quarto");
        p.empilhar("quinto");

        // Verificação
        assertThrows(PilhaCheiaException.class, () -> p.empilhar("sexto"));
    }
}
