package file_system;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");

        FileSystem border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("Comedy Movie");
        FileSystem dhol = new File("Dhol");
        comedyMovieDirectory.add(dhol);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
    }
}
