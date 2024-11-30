public class TestDriver {
 
public static void main(String[] args) {
 
Scanner scanner = new Scanner(System.in);
 
 
// Test Rectangle with good and bad inputs
 
try {
 
Rectangle rectangle = new Rectangle(5, 10);
 
System.out.println("Area of rectangle: " + rectangle.area());
 
 
Rectangle rectangle2 = new Rectangle(-2, 8); // Bad input
 
System.out.println("Area of rectangle2: " + rectangle2.area()); // This line won't be reached
 
} 
 
catch (IllegalArgumentException e) {
 
System.out.println("Error creating rectangle: " + e.getMessage());
 
}
 
 
// Test Circle with good and bad inputs
 
try {
 
Circle circle1 = new Circle(7); // Good input
 
System.out.println("Area of circle1: " + circle1.area());
 
 
Circle circle2 = new Circle(-5); // Bad input
 
System.out.println("Area of circle2: " + circle2.area()); // This line won't be reached
 
} catch (IllegalArgumentException e) {
 
System.out.println("Error creating circle: " + e.getMessage());
 
}
 
 
scanner.close();
 
}
