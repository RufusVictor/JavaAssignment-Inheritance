class Student {
    String name;
    int age;

    public Student(String name) {
        this.name = name;
        System.out.println("Student Constructor with Name");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student Constructor with Name and Age");
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class ZSGSStudent extends Student {
    String batch;

    public ZSGSStudent(String name, String batch) {
        super(name);
        this.batch = batch;
        System.out.println("ZSGSStudent Constructor with Name and Batch");
    }

    public ZSGSStudent(String name, int age, String batch) {
        super(name, age);
        this.batch = batch;
        System.out.println("ZSGSStudent Constructor with Name, Age, and Batch");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Batch: " + batch);
    }
}

public class ZS {
    public static void main(String[] args) {
        Student s1 = new ZSGSStudent("John", "Batch A");
        s1.display();

        System.out.println();

        Student s2 = new ZSGSStudent("Alice", 22, "Batch B");
        s2.display();
    }
}
