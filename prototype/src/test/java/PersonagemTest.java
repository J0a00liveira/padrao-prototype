import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Personagem cavaleiro = new Personagem("tassio", 100, 1);

        Personagem rei = cavaleiro.clone();
        rei.setNome("Marco");
        rei.setNivel(999);
        rei.setVida(2);

        assertEquals("Personagem: Nome:tassio Nivel:100 Vidas:1", cavaleiro.toString());
        assertEquals("Personagem: Nome:Marco Nivel:999 Vidas:2", rei.toString());
    }
}