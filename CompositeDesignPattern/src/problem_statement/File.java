package problem_statement;

public class File {
    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void ls() {
        System.out.println("File name: " + this.fileName);
    }
}
