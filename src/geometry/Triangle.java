package geometry;

/**
 * The {@code Triangle} class represents a triangle in 2D space.
 * It extends the {@code Geometry2D} abstract class and provides
 * implementations for calculating the area and perimeter of the triangle.
 * <p>
 * The area of the triangle is calculated using its base and height, while 
 * the perimeter is the sum of its three sides.
 */
public class Triangle extends Geometry2D {

    /** The base of the triangle. */
    private double base;

    /** The height of the triangle, perpendicular to the base. */
    private double height;

    /** The first side of the triangle. */
    private double side1;

    /** The second side of the triangle. */
    private double side2;

    /** The third side of the triangle. */
    private double side3;

    /**
     * Constructs a new {@code Triangle} with the specified base, height, 
     * and lengths of the three sides.
     *
     * @param base   The base of the triangle.
     * @param height The height of the triangle, perpendicular to the base.
     * @param side1  The length of the first side of the triangle.
     * @param side2  The length of the second side of the triangle.
     * @param side3  The length of the third side of the triangle.
     */
    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Calculates the area of the triangle.
     * <p>
     * The formula used is: {@code 0.5 * base * height}.
     *
     * @return The area of the triangle as a {@code double}.
     */
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    /**
     * Calculates the perimeter of the triangle.
     * <p>
     * The perimeter is the sum of its three sides: {@code side1 + side2 + side3}.
     *
     * @return The perimeter of the triangle as a {@code double}.
     */
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

