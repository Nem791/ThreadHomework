import java.util.List;

public class UsingThread extends Thread {
    public static MovieRepo movieRepo = new MovieRepo();
    public static List<Movie> list = movieRepo.movieArrayList;

    @Override
    public void run() {
        try {
            movieRepo.printAll();
            Thread.sleep(2000);
            movieRepo.print3HighestViews();
            Thread.sleep(2000);
            movieRepo.printFilterCategory();
            Thread.sleep(2000);
            movieRepo.printFilterGenres();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
