import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MovieRepo {
    public List<Movie> movieArrayList;

    Random random = new Random();

    public MovieRepo() {
        movieArrayList = new ArrayList<>();
        movieArrayList.add(new Movie(random.nextInt(100 - 1 + 1) + 1, "Phim " + String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Dao dien " +  String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Hanh dong", FilmCategory.TV, random.nextInt(1000 - 1 + 1) + 1, random.nextInt(500 - 1 + 1) + 1));
        movieArrayList.add(new Movie(random.nextInt(100 - 1 + 1) + 1, "Phim " + String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Dao dien " +  String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Kinh di", FilmCategory.TV, random.nextInt(1000 - 1 + 1) + 1, random.nextInt(500 - 1 + 1) + 1));
        movieArrayList.add(new Movie(random.nextInt(100 - 1 + 1) + 1, "Phim " + String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Dao dien " +  String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Kinh di", FilmCategory.TV, random.nextInt(1000 - 1 + 1) + 1, random.nextInt(500 - 1 + 1) + 1));
        movieArrayList.add(new Movie(random.nextInt(100 - 1 + 1) + 1, "Phim " + String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Dao dien " +  String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Kinh di", FilmCategory.TV, random.nextInt(1000 - 1 + 1) + 1, random.nextInt(500 - 1 + 1) + 1));
        movieArrayList.add(new Movie(random.nextInt(100 - 1 + 1) + 1, "Phim " + String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Dao dien " +  String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Hanh dong", FilmCategory.MV, random.nextInt(1000 - 1 + 1) + 1, random.nextInt(500 - 1 + 1) + 1));
        movieArrayList.add(new Movie(random.nextInt(100 - 1 + 1) + 1, "Phim " + String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Dao dien " +  String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Vien tuong", FilmCategory.MV, random.nextInt(1000 - 1 + 1) + 1, random.nextInt(500 - 1 + 1) + 1));
        movieArrayList.add(new Movie(random.nextInt(100 - 1 + 1) + 1, "Phim " + String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Dao dien " +  String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Vien tuong", FilmCategory.MV, random.nextInt(1000 - 1 + 1) + 1, random.nextInt(500 - 1 + 1) + 1));
        movieArrayList.add(new Movie(random.nextInt(100 - 1 + 1) + 1, "Phim " + String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Dao dien " +  String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Drama", FilmCategory.MV, random.nextInt(1000 - 1 + 1) + 1, random.nextInt(500 - 1 + 1) + 1));
    }

    public void printAll() {
        // Hi???n th??? t???t c??? c??c b??? phim
        System.out.println("Hi???n th??? t???t c??? c??c b??? phim");
        movieArrayList.stream().forEach(m -> {
            System.out.println(m);
        });
    }

    public void print3HighestViews() {
        //        L???y ra 3 b??? phim c?? l?????t xem cao nh???t
        System.out.println("\nL???y ra 3 b??? phim c?? l?????t xem cao nh???t");
        movieArrayList.stream()
                .sorted(Comparator.comparingInt(Movie::getViews).reversed())
                .limit(3)
                .forEach(System.out::println);
    }

    public void printFilterCategory() {
        //        Li???t k?? phim theo category
        System.out.println("\nLi???t k?? phim theo category");
        FilmCategory.stream()
                .forEach(filmCategory -> {
                    System.out.println("\n" + filmCategory.getValue());
                    movieArrayList.stream()
                            .filter(m -> m.getCategory().getValue().equals(filmCategory.getValue()))
                            .forEach(System.out::println);
                });


    }

    public void printFilterGenres() {
        //        Li???t k?? phim theo th??? lo???i
        System.out.println("\nLi???t k?? phim theo th??? lo???i");
        List<String> genres = movieArrayList.stream().map(Movie::getGenre).collect(Collectors.toList());
        genres.stream().distinct()
                .forEach(g -> {
                    System.out.println("\n" + g);
                    movieArrayList.stream()
                            .filter(movie -> movie.getGenre().equals(g))
                            .forEach(System.out::println);
                });

    }


}
