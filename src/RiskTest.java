import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RiskTest {

    @Test
    void helloTest() {
        Risk risk = new Risk();
        assertEquals("Hello!" , risk.hello());
    }
    @Test
    void RiskConstructorTest() {
        Risk risk1 = new Risk();
        assertEquals(0.001, risk1.getProbabilityPercent());
    }
    @Test
    void testHeleMolevitten() {
        // Tester risikoen med case Anders hvis bundkort er røget sig en tur
        Risk risk = new Risk();
        risk.setDescription("Bundkort i computer virker ikke.");
        risk.setConsequence("Undervisningen kan ikke afholdes.");
        risk.setProbabilityLevel(Probability.LOW);

        assertEquals("Bundkort i computer virker ikke.", risk.getDescription());
        assertEquals("Undervisning kan ikke afholdes.", risk.getConsequence());
        assertEquals(Probability.LOW, risk.getProbabilityLevel());
        assertEquals(0.001, risk.getProbabilityPercent());
    }
}
