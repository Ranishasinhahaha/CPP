import java.util.Scanner;

class Student {
    int roll;
    String name;
    float cgpa;

    Student(int roll, String name, float cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];
        float minCGPA = Float.MAX_VALUE;
        String lowestCGPAName = "";

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll: ");
            int roll = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("CGPA: ");
            float cgpa = sc.nextFloat();

            students[i] = new Student(roll, name, cgpa);

            if (cgpa < minCGPA) {
                minCGPA = cgpa;
                lowestCGPAName = name;
            }
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.display();
        }

        System.out.println("\nStudent with lowest CGPA: " + lowestCGPAName);

        sc.close();
    }
}
