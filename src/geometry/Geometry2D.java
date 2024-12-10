package geometry;

/**
 * The {@code Geometry2D} abstract class represents the blueprint for 
 * 2D geometric shapes. Classes that extend this abstract class must 
 * provide implementations for calculating the area and perimeter of the shape.
 */
public abstract class Geometry2D {

    /**
     * Calculates the area of the 2D shape.
     *
     * @return The area of the shape as a {@code double}.
     */
    public abstract double calculateArea();

    /**
     * Calculates the perimeter of the 2D shape.
     *
     * @return The perimeter of the shape as a {@code double}.
     */
    public abstract double calculatePerimeter();
}

