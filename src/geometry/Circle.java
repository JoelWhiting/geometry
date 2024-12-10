package geometry;

/**
 * The {@code Circle} class represents a circle shape in 2D space.
 * It extends the {@code Geometry2D} abstract class and provides 
 * implementations for calculating the area and perimeter of the circle.
 */
public class Circle extends Geometry2D {

    /** The radius of the circle. */
    private double radius;

    /**
     * Constructs a new {@code Circle} with the specified radius.
     *
     * @param radius The radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * The formula used is: {@code π * radius^2}.
     *
     * @return The area of the circle.
     */
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Calculates the perimeter (circumference) of the circle.
     * The formula used is: {@code 2 * π * radius}.
     *
     * @return The perimeter (circumference) of the circle.
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

