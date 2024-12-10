package geometry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The {@code RectangularPrismTest} class contains unit tests for the
 * {@code RectangularPrism} class. It tests the correctness of the 
 * {@code calculateVolume} and {@code calculateSurfaceArea} methods.
 */
public class RectangularPrismTest {

    /**
     * Tests the {@code calculateVolume} method of {@code RectangularPrism}.
     * Verifies that the volume is correctly calculated for a unit cube
     * with dimensions (1.0, 1.0, 1.0).
     */
    @Test
    public void testVolume() {
        RectangularPrism cube = new RectangularPrism(1.0, 1.0, 1.0);
        assertEquals(1.0, cube.calculateVolume(), 0.001, 
                "The volume of a unit cube should be 1.0.");
    }

    /**
     * Tests the {@code calculateSurfaceArea} method of {@code RectangularPrism}.
     * Verifies that the surface area is correctly calculated for a unit cube
     * with dimensions (1.0, 1.0, 1.0).
     */
    @Test
    public void testSurfaceArea() {
        RectangularPrism cube = new RectangularPrism(1.0, 1.0, 1.0);
        assertEquals(6.0, cube.calculateSurfaceArea(), 0.001, 
                "The surface area of a unit cube should be 6.0.");
    }
}


