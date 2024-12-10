package geometry;

/**
 * The {@code TriangularPrism} class represents a triangular prism in 3D space.
 * It extends the {@code Geometry3D} abstract class and provides 
 * implementations for calculating the volume and surface area of the prism.
 * <p>
 * A triangular prism is a 3D shape with two congruent triangular bases and 
 * three rectangular lateral faces. The volume is calculated using the area 
 * of the base and the prism's height, while the surface area includes the 
 * areas of the two triangular bases and the lateral rectangular faces.
 */
public class TriangularPrism extends Geometry3D {

    /** The area of the triangular base. */
    private double baseArea;

    /** The height (length) of the prism. */
    private double height;

    /** The perimeter of the triangular base. */
    private double perimeterBase;

    /**
     * Constructs a new {@code TriangularPrism} with the specified base area, height,
     * and perimeter of the base.
     *
     * @param baseArea      The area of the triangular base.
     * @param height        The height (length) of the prism.
     * @param perimeterBase The perimeter of the triangular base.
     */
    public TriangularPrism(double baseArea, double height, double perimeterBase) {
        this.baseArea = baseArea;
        this.height = height;
        this.perimeterBase = perimeterBase;
    }

    /**
     * Calculates the volume of the triangular prism.
     * <p>
     * The formula used is: {@code baseArea * height}.
     *
     * @return The volume of the triangular prism as a {@code double}.
     */
    @Override
    public double calculateVolume() {
        return baseArea * height;
    }

    /**
     * Calculates the surface area of the triangular prism.
     * <p>
     * The formula used is: {@code (2 * baseArea) + (perimeterBase * height)}.
     * It includes the areas of the two triangular bases and the three rectangular faces.
     *
     * @return The surface area of the triangular prism as a {@code double}.
     */
    @Override
    public double calculateSurfaceArea() {
        return (2 * baseArea) + (perimeterBase * height);
    }
}
