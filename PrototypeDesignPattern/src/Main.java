public class Main {
    public static void main(String[] args) {
        Prototype<Student> studentObj = new Student("Chirayu", 10);
        Student clonedStudent = studentObj.cloneObj();

        Prototype<Teacher> teacherObj = new Teacher("Hetvi", "Chemistry");
        Teacher clonedTeacher = teacherObj.cloneObj();
    }
}
