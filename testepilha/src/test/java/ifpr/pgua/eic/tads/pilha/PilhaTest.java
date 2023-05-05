package ifpr.pgua.eic.tads.pilha;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    public void empilhaUmElemento() {
        // Ação
        p.empilhar("primeiro");

        //Verificação
        assertFalse(p.estaVazia());
        assertEquals(1, p.tamanho());
        assertEquals("primeiro", p.topo());
    }

    @Test
    public void empilharDoisDesempilharUm() {
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
}
