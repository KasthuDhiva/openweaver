class Student {
    private String name;
    private int age;
    private String course;
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }
}


public class StudentInfo {
    public static void main(String[] args) {
        Student student1 = new Student("Kasthuri", 20, "Computer Science");
        Student student2 = new Student("Ramesh", 22, "Engineering");
        System.out.println("Student 1 Information:");
        student1.displayInfo();
        System.out.println("Student 2 Information:");
        student2.displayInfo();
    }
}
