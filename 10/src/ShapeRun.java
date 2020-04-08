import ex10_09.*;

/*
    Exercise 10.9 main class
 */
public class ShapeRun {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(1);
        shapes[1] = new Square(2);
        shapes[2] = new Triangle(3);
        shapes[3] = new Sphere(4);
        shapes[4] = new Cube(5);
        shapes[5] = new Tetrahedron(6);

        for (Shape aShape : shapes) {
            if (aShape instanceof TwoDimensional_Shape)
                System.out.print(TwoDimensional_Shape.class.getName());
            if (aShape instanceof ThreeDimensional_Shape)
                System.out.print(ThreeDimensional_Shape.class.getName());
            System.out.printf("%nis an %s.%nAttributes:%n%s", aShape.getClass().getName(), aShape);
        }
    }
}
