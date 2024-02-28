package Model;

import java.util.Comparator;

public class Student implements Comparator<Student> {

    private String name;
    private float mark;
    private String classes;

    public Student(String name, float mark, String classes) {
        this.name = name;
        this.mark = mark;
        this.classes = classes;
    }
    public Student(){
    }
    public String getName() {
        return name;
    }

    public float getMark() {
        return mark;
    }

    public String getClasses() {
        return classes;
    }

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
