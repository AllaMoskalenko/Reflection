package ua.alla.newWorld.Persons;

import java.util.ArrayList;

public class Student extends Human implements Swiming {
    private ArrayList<String> lessons = new ArrayList<String>();

    public Student(String name, int age) {
        super(name, age);

    }

    public ArrayList<String> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<String> lessons) {
        this.lessons = lessons;
    }

    public void swim() {

    }

    @Override
    public String toString() {
        return "Student: " + getName() + '\n' +
                "Age: " + getAge() + '\n' +
                "Lessons: " + lessons;
    }


    public static void main(String[] args) {
        Student student = new Student("Ivanov", 16 );

        student.lessons.add("Physical Culture");
        student.lessons.add("Swiming");
        student.lessons.add("History");

        System.out.println(student);
    }


}