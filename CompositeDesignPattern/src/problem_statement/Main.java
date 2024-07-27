package problem_statement;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");

        File border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File dhol = new File("Dhol");
        comedyMovieDirectory.add(dhol);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
    }
}
