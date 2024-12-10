package geometry;

/**
 * The {@code RectangularPrism} class represents a rectangular prism in 3D space.
 * It extends the {@code Geometry3D} abstract class and provides 
 * implementations for calculating the volume and surface area of the prism.
 */
public class RectangularPrism extends Geometry3D {

    /** The length of the rectangular prism. */
    private double length;

    /** The width of the rectangular prism. */
    private double width;

    /** The height of the rectangular prism. */
    private double height;

    /**
     * Constructs a new {@code RectangularPrism} with the specified dimensions.
     *
     * @param length The length of the rectangular prism.
     * @param width  The width of the rectangular prism.
     * @param height The height of the rectangular prism.
     */
    public RectangularPrism(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the volume of the rectangular prism.
     * The formula used is: {@code length * width * height}.
     *
     * @return The volume of the rectangular prism as a {@code double}.
     */
    @Override
    public double calculateVolume() {
        return length * width * height;
    }

    /**
     * Calculates the surface area of the rectangular prism.
     * The formula used is: {@code 2 * (length * width + width * height + length * height)}.
     *
     * @return The surface area of the rectangular prism as a {@code double}.
     */
    @Override
    public double calculateSurfaceArea() {
        return 2 * (length * width + width * height + length * height);
    }
}




