package one.digitalinnovation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestPessoa {

    @Test
    public void testGetNome() {
        Pessoa pessoa = new Pessoa("João", 25);
        assertEquals("João", pessoa.getNome());
    }

    @Test
    public void testGetIdade() {
        Pessoa pessoa = new Pessoa("Maria", 30);
        assertEquals(30, pessoa.getIdade());
    }

    @Test
    public void testSetNome() {
        Pessoa pessoa = new Pessoa("Carlos", 20);
        pessoa.setNome("Roberto");
        assertEquals("Roberto", pessoa.getNome());
    }

    @Test
    public void testSetIdade() {
        Pessoa pessoa = new Pessoa("Ana", 18);
        pessoa.setIdade(22);
        assertEquals(22, pessoa.getIdade());
    }

    @Test
    public void testIsMaiorDeIdade() {
        Pessoa pessoa1 = new Pessoa("Pedro", 17);
        Pessoa pessoa2 = new Pessoa("Paula", 18);
        assertFalse(pessoa1.isMaiorDeIdade());
        assertTrue(pessoa2.isMaiorDeIdade());
    }
}

