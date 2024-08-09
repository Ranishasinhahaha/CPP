import java.util.Scanner;

class Rectangle {
    // Data members
    private double length;
    private double breadth;

    // Method to read values of length and breadth
    public void read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        breadth = scanner.nextDouble();
    }

    // Method to calculate the area and perimeter of the rectangle
    public void calculate() {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    // Method to display the length and breadth of the rectangle
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }

    public static void main(String[] args) {
        // Create an object of Rectangle class
        Rectangle rect = new Rectangle();

        // Call methods
        rect.read();
        rect.display();
        rect.calculate();
    }
}
