public class Teacher implements Prototype<Teacher> {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public Teacher cloneObj() {
        return new Teacher(this.name, this.subject);
    }
}
