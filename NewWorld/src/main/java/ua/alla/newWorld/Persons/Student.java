package ua.alla.newWorld.Persons;

import java.util.ArrayList;

public class Student extends Human implements Swiming {

    private String highSchoolName;
    private int learningYear;
    private ArrayList<String> lessons = new ArrayList<String>();

    public Student(String name, int age, String highSchoolName, int learningYear) {
        super(name, age);
        this.highSchoolName = highSchoolName;
        this.learningYear = learningYear;
    }

    public String getHighSchoolName() {
        return highSchoolName;
    }

    public void setHighSchoolName(String highSchoolName) {
        this.highSchoolName = highSchoolName;
    }

    public int getLearningYear() {
        return learningYear;
    }

    public void setLearningYear(int learningYear) {
        this.learningYear = learningYear;
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
                "HighSchool: " + getHighSchoolName() +
                ". Year of study: " +getLearningYear()+'\n' +
                "Lessons: " + lessons;
    }


    public static void main(String[] args) {
        Student student = new Student("Ivanov Ivan", 16, "Institute of Physical Education", 2 );

        student.lessons.add("Physical Culture");
        student.lessons.add("Swiming");
        student.lessons.add("History");

        System.out.println(student);
    }


}