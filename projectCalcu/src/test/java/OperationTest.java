
import com.mycompany.projectcalcu.FrameCalcu;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author torme
 */
@Nested
@DisplayName("Operation")

public class OperationTest {

	@Test 
	@DisplayName("le Test de addition")
    void testAdd(){
        float expected = 4;
        float actuel = FrameCalcu.plus(3, 1);
        assertEquals(expected, actuel, "Erreur");
    }
    
    @Test
	@DisplayName("le Test de soustraction")
    void testMoins(){
        float expected = 4;
        float actuel = FrameCalcu.moins(5, 1);
        assertEquals(expected, actuel, "Erreur");
    }
    @Test
	@DisplayName("le Test de multiplication")
    void testFois(){
        float expected = 4;
        float actuel = FrameCalcu.fois(2, 2);
        assertEquals(expected, actuel, "Erreur");
    }
    @Test
	@DisplayName("le Test de division")
    void testDiv(){
        float expected = 4;
        float actuel = FrameCalcu.div(8, 2);
        assertEquals(expected, actuel, "Erreur");

    }

    @Test
	@DisplayName("le Test de division par zero")
	void testDivision() {
		boolean assume=true;
		assumeTrue(assume);
		assertThrows(ArithmeticException.class,()->FrameCalcu.div(1, 0));
        }
}
