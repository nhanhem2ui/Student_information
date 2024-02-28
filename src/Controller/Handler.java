package Controller;

import Model.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Handler {

    List<Student> students;
    Scanner scanner;

    public Handler() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void getInfo() {
        System.out.println("Enter student information (Name, Class, Mark) or type 'done' to finish:");

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Class: ");
            String classes = scanner.nextLine();

            float mark;
            while (true) {
                try {
                    System.out.print("Mark: ");
                    mark = Float.parseFloat(scanner.nextLine());
                    if(mark <0 || mark >10){
                        System.out.println("Mark invalid..");
                        return;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid mark. Please enter a valid number.");
                }
            }

            students.add(new Student(name, mark, classes));
        }
    }

    public List<Student> sortStudent() {
        Collections.sort(students, new Student());
        return students;
    }

    public void display() {
        System.out.println("\nStudent Information:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Class: " + student.getClasses() + ", Mark: " + student.getMark());
        }
    }
}
