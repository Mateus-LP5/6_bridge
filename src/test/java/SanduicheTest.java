import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanduicheTest {

    @Test
    void deveRetornarValorSanduicheComFritas() {
        Complemento complemento = new Fritas();
        Sanduiche sanduiche = new Sanduiche(1);
        sanduiche.setComplemento(complemento);
        assertEquals(11,sanduiche.calcularValorPedido());
    }

    @Test
    void deveRetornarValorSanduicheComMolho() {
        Complemento complemento = new Molho();
        Sanduiche sanduiche = new Sanduiche(1);
        sanduiche.setComplemento(complemento);
        assertEquals(3,sanduiche.calcularValorPedido());
    }

    @Test
    void deveRetornarValorSanduicheComRefrigerante() {
        Complemento complemento = new Refrigerante();
        Sanduiche sanduiche = new Sanduiche(1);
        sanduiche.setComplemento(complemento);
        assertEquals(6,sanduiche.calcularValorPedido());
    }

    @Test
    void deveRetornarValorSanduicheComSucoNatural() {
        Complemento complemento = new SucoNatural();
        Sanduiche sanduiche = new Sanduiche(1);
        sanduiche.setComplemento(complemento);
        assertEquals(8,sanduiche.calcularValorPedido());
    }

}