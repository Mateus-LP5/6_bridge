import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EsfirraTest {

    @Test
    void deveRetornarValorEsfirraComFritas() {
        Complemento complemento = new Fritas();
        Esfirra esfirra = new Esfirra(1);
        esfirra.setComplemento(complemento);
        assertEquals(11,esfirra.calcularValorPedido());
    }

    @Test
    void deveRetornarValorEsfirraComMolho() {
        Complemento complemento = new Molho();
        Esfirra esfirra = new Esfirra(1);
        esfirra.setComplemento(complemento);
        assertEquals(3,esfirra.calcularValorPedido());
    }

    @Test
    void deveRetornarValorEsfirraComRefrigerante() {
        Complemento complemento = new Refrigerante();
        Esfirra esfirra = new Esfirra(1);
        esfirra.setComplemento(complemento);
        assertEquals(6,esfirra.calcularValorPedido());
    }

    @Test
    void deveRetornarValorEsfirraComSucoNatural() {
        Complemento complemento = new SucoNatural();
        Esfirra esfirra = new Esfirra(1);
        esfirra.setComplemento(complemento);
        assertEquals(8,esfirra.calcularValorPedido());
    }

}