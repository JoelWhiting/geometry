package geometry;

/**
 * The {@code Rectangle} class represents a rectangle in 2D space.
 * It extends the {@code Geometry2D} abstract class and provides
 * implementations for calculating the area and perimeter of the rectangle.
 */
public class Rectangle extends Geometry2D {

    /** The length of the rectangle. */
    private double length;

    /** The width of the rectangle. */
    private double width;

    /**
     * Constructs a new {@code Rectangle} with the specified length and width.
     *
     * @param length The length of the rectangle.
     * @param width  The width of the rectangle.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Calculates the area of the rectangle.
     * The formula used is: {@code length * width}.
     *
     * @return The area of the rectangle as a {@code double}.
     */
    @Override
    public double calculateArea() {
        return length * width;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * The formula used is: {@code 2 * (length + width)}.
     *
     * @return The perimeter of the rectangle as a {@code double}.
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

