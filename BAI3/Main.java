package BAI3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "blue", true);
        Rectangle rectangle = new Rectangle(4, 6, "green", false);
        Square square = new Square(3, "yellow", true);

        System.out.println("Thong tin hinh tron:");
        System.out.println(circle);
        System.out.println("Dien tich: " + circle.getArea());
        System.out.println("Chu vi: " + circle.getPerimeter());

        System.out.println("\nThong tin hinh chu nhat:");
        System.out.println(rectangle);
        System.out.println("Dien tich: " + rectangle.getArea());
        System.out.println("Chu vi: " + rectangle.getPerimeter());

        System.out.println("\nThong tin hinh vuong:");
        System.out.println(square);
        System.out.println("Dien tich: " + square.getArea());
        System.out.println("Chu vi: " + square.getPerimeter());

        System.out.println("\nKiem tra equals:");
        System.out.println("Circle va Rectangle co bang nhau khong? " + circle.equals(rectangle));
        System.out.println("Rectangle va Square co bang nhau khong? " + rectangle.equals(square));
    }
}