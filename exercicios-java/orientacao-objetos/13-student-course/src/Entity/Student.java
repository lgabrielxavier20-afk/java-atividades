package Entity;

public class Student {
    private String name;
    private int age;
    private Course course;

    public Student(String name, int age, Course course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Course getCourse() {
        return course;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public String toString() {
        return name + ", " + age + " years old\n"
                + "Course: " + course + "\n"
                + "Adult: " + (isAdult() ? "yes" : "no");
    }
}
