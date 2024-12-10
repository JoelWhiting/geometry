package geometry;

/**
 * The {@code Geometry3D} abstract class represents the blueprint for 
 * 3D geometric shapes. Classes that extend this abstract class must 
 * provide implementations for calculating the volume and surface area 
 * of the shape.
 */
public abstract class Geometry3D {

    /**
     * Calculates the volume of the 3D shape.
     *
     * @return The volume of the shape as a {@code double}.
     */
    public abstract double calculateVolume();

    /**
     * Calculates the surface area of the 3D shape.
     *
     * @return The surface area of the shape as a {@code double}.
     */
    public abstract double calculateSurfaceArea();
}
