public class TriangularPrism extends Geometry3D {
    private double baseArea;
    private double height;
    private double perimeterBase;

    public TriangularPrism(double baseArea, double height, double perimeterBase) {
        this.baseArea = baseArea;
        this.height = height;
        this.perimeterBase = perimeterBase;
    }

    @Override
    public double calculateVolume() {
        return baseArea * height;
    }

    @Override
    public double calculateSurfaceArea() {
        return (2 * baseArea) + (perimeterBase * height);
    }
}
