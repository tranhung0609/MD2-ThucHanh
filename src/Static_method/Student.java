package Static_method;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Studen{" +
                "name='" + name + '\'' +
                ", classes ='" + classes + '\'' +
                '}';
    }
    public static class Test{
        public static void main(String[] args) {
            Student student=new Student();
            student.setName("Trần Hưng Hydra");
            student.setClasses("C0222H1");
            System.out.println(student.toString());
        }
    }
}
