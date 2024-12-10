package geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The {@code Main} class implements a REPL (Read-Eval-Print Loop) program 
 * for managing 2D and 3D geometries. It allows users to add, remove, 
 * and list geometric shapes interactively.
 */
public class Main {

    /**
     * The main method that starts the REPL loop and provides the interactive menu.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Geometry2D> geometries2D = new ArrayList<>();
        List<Geometry3D> geometries3D = new ArrayList<>();

        System.out.println("Welcome to the Geometry REPL!");
        System.out.println("Manage your 2D and 3D geometries interactively.\n");

        boolean running = true;

        while (running) {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Add Geometry (2D or 3D)");
            System.out.println("2. Remove Geometry");
            System.out.println("3. List All Geometries");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addGeometry(scanner, geometries2D, geometries3D);
                    break;
                case "2":
                    removeGeometry(scanner, geometries2D, geometries3D);
                    break;
                case "3":
                    listGeometries(geometries2D, geometries3D);
                    break;
                case "4":
                    running = false;
                    System.out.println("Exiting REPL. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    /**
     * Adds a 2D or 3D geometry to the respective list based on user input.
     *
     * @param scanner       The {@code Scanner} object for user input.
     * @param geometries2D  The list of 2D geometries.
     * @param geometries3D  The list of 3D geometries.
     */
    private static void addGeometry(Scanner scanner, List<Geometry2D> geometries2D, List<Geometry3D> geometries3D) {
        System.out.println("\nAdd Geometry");
        System.out.print("Choose type (2D/3D): ");
        String type = scanner.nextLine().trim().toLowerCase();

        if (type.equals("2d")) {
            System.out.println("Available 2D shapes: Rectangle, Circle, Triangle");
            System.out.print("Enter shape name: ");
            String shape = scanner.nextLine().trim().toLowerCase();

            switch (shape) {
                case "rectangle":
                    System.out.print("Enter length: ");
                    double length = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter width: ");
                    double width = Double.parseDouble(scanner.nextLine());
                    geometries2D.add(new Rectangle(length, width));
                    System.out.println("Rectangle added!");
                    break;
                case "circle":
                    System.out.print("Enter radius: ");
                    double radius = Double.parseDouble(scanner.nextLine());
                    geometries2D.add(new Circle(radius));
                    System.out.println("Circle added!");
                    break;
                case "triangle":
                    System.out.print("Enter base: ");
                    double base = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter height: ");
                    double height = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter three sides (separated by spaces): ");
                    String[] sides = scanner.nextLine().split(" ");
                    geometries2D.add(new Triangle(base, height, Double.parseDouble(sides[0]),
                            Double.parseDouble(sides[1]), Double.parseDouble(sides[2])));
                    System.out.println("Triangle added!");
                    break;
                default:
                    System.out.println("Invalid shape. Returning to menu.");
            }

        } else if (type.equals("3d")) {
            System.out.println("Available 3D shapes: Sphere, TriangularPrism");
            System.out.print("Enter shape name: ");
            String shape = scanner.nextLine().trim().toLowerCase();

            switch (shape) {
                case "sphere":
                    System.out.print("Enter radius: ");
                    double radius = Double.parseDouble(scanner.nextLine());
                    geometries3D.add(new Sphere(radius));
                    System.out.println("Sphere added!");
                    break;
                case "triangularprism":
                    System.out.print("Enter base area: ");
                    double baseArea = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter height: ");
                    double height = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter perimeter of base: ");
                    double perimeterBase = Double.parseDouble(scanner.nextLine());
                    geometries3D.add(new TriangularPrism(baseArea, height, perimeterBase));
                    System.out.println("Triangular Prism added!");
                    break;
                default:
                    System.out.println("Invalid shape. Returning to menu.");
            }

        } else {
            System.out.println("Invalid type. Please enter 2D or 3D.");
        }
    }

    /**
     * Removes a 2D or 3D geometry from the respective list based on user input.
     *
     * @param scanner       The {@code Scanner} object for user input.
     * @param geometries2D  The list of 2D geometries.
     * @param geometries3D  The list of 3D geometries.
     */
    private static void removeGeometry(Scanner scanner, List<Geometry2D> geometries2D, List<Geometry3D> geometries3D) {
        System.out.println("\nRemove Geometry");
        System.out.print("Choose type to remove (2D/3D): ");
        String type = scanner.nextLine().trim().toLowerCase();

        if (type.equals("2d")) {
            listGeometries(geometries2D, geometries3D);
            System.out.print("Enter the index of the 2D geometry to remove: ");
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index < geometries2D.size()) {
                geometries2D.remove(index);
                System.out.println("2D geometry removed!");
            } else {
                System.out.println("Invalid index.");
            }
        } else if (type.equals("3d")) {
            listGeometries(geometries2D, geometries3D);
            System.out.print("Enter the index of the 3D geometry to remove: ");
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index < geometries3D.size()) {
                geometries3D.remove(index);
                System.out.println("3D geometry removed!");
            } else {
                System.out.println("Invalid index.");
            }
        } else {
            System.out.println("Invalid type. Please enter 2D or 3D.");
        }
    }

    /**
     * Displays the list of all stored 2D and 3D geometries along with their attributes.
     *
     * @param geometries2D The list of 2D geometries.
     * @param geometries3D The list of 3D geometries.
     */
    private static void listGeometries(List<Geometry2D> geometries2D, List<Geometry3D> geometries3D) {
        System.out.println("\nList of 2D Geometries:");
        for (int i = 0; i < geometries2D.size(); i++) {
            Geometry2D shape = geometries2D.get(i);
            System.out.printf("%d. %s - Area: %.2f, Perimeter: %.2f%n", i, shape.getClass().getSimpleName(),
                    shape.calculateArea(), shape.calculatePerimeter());
        }

        System.out.println("\nList of 3D Geometries:");
        for (int i = 0; i < geometries3D.size(); i++) {
            Geometry3D shape = geometries3D.get(i);
            System.out.printf("%d. %s - Volume: %.2f, Surface Area: %.2f%n", i, shape.getClass().getSimpleName(),
                    shape.calculateVolume(), shape.calculateSurfaceArea());
        }
    }
}
