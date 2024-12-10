public class Main {
    public static void main(String[] args) {
        // Rectangle
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Rectangle Perimeter: " + rect.calculatePerimeter());

        // Circle
        Circle circle = new Circle(4);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        // Triangle
        Triangle triangle = new Triangle(6, 4, 5, 5, 5);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());

        // Sphere
        Sphere sphere = new Sphere(3);
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        System.out.println("Sphere Surface Area: " + sphere.calculateSurfaceArea());

        // Triangular Prism
        TriangularPrism prism = new TriangularPrism(12, 10, 15);
        System.out.println("Triangular Prism Volume: " + prism.calculateVolume());
        System.out.println("Triangular Prism Surface Area: " + prism.calculateSurfaceArea());
    }
}

