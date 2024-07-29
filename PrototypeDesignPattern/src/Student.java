public class Student implements Prototype<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Student cloneObj() {
        return new Student(this.name, this.age);
    }
}
