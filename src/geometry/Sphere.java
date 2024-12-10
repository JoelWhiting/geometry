package geometry;

/**
 * The {@code Sphere} class represents a sphere in 3D space.
 * It extends the {@code Geometry3D} abstract class and provides
 * implementations for calculating the volume and surface area of the sphere.
 */
public class Sphere extends Geometry3D {

    /** The radius of the sphere. */
    private double radius;

    /**
     * Constructs a new {@code Sphere} with the specified radius.
     *
     * @param radius The radius of the sphere.
     */
    public Sphere(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the volume of the sphere.
     * The formula used is: {@code (4/3) * π * radius^3}.
     *
     * @return The volume of the sphere as a {@code double}.
     */
    @Override
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Calculates the surface area of the sphere.
     * The formula used is: {@code 4 * π * radius^2}.
     *
     * @return The surface area of the sphere as a {@code double}.
     */
    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

