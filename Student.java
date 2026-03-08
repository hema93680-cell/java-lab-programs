class Student {
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class DatabaseDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.id = 101;
        s.name = "Hema";

        s.display();
    }
}
