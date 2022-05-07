import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerTest {

    @Test
    void deveRetornarValorHamburguerComFritas() {
        Complemento complemento = new Fritas();
        Hamburguer hamburguer = new Hamburguer(1);
        hamburguer.setComplemento(complemento);
        assertEquals(11,hamburguer.calcularValorPedido());
    }

    @Test
    void deveRetornarValorHamburguerComMolho() {
        Complemento complemento = new Molho();
        Hamburguer hamburguer = new Hamburguer(1);
        hamburguer.setComplemento(complemento);
        assertEquals(3,hamburguer.calcularValorPedido());
    }

    @Test
    void deveRetornarValorHamburguerComRefrigerante() {
        Complemento complemento = new Refrigerante();
        Hamburguer hamburguer = new Hamburguer(1);
        hamburguer.setComplemento(complemento);
        assertEquals(6,hamburguer.calcularValorPedido());
    }

    @Test
    void deveRetornarValorHamburguerComSucoNatural() {
        Complemento complemento = new SucoNatural();
        Hamburguer hamburguer = new Hamburguer(1);
        hamburguer.setComplemento(complemento);
        assertEquals(8,hamburguer.calcularValorPedido());
    }
}