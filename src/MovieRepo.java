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
        // Hiển thị tất cả các bộ phim
        System.out.println("Hiển thị tất cả các bộ phim");
        movieArrayList.stream().forEach(m -> {
            System.out.println(m);
        });
    }

    public void print3HighestViews() {
        //        Lấy ra 3 bộ phim có lượt xem cao nhất
        System.out.println("\nLấy ra 3 bộ phim có lượt xem cao nhất");
        movieArrayList.stream()
                .sorted(Comparator.comparingInt(Movie::getViews).reversed())
                .limit(3)
                .forEach(System.out::println);
    }

    public void printFilterCategory() {
        //        Liệt kê phim theo category
        System.out.println("\nLiệt kê phim theo category");
        FilmCategory.stream()
                .forEach(filmCategory -> {
                    System.out.println("\n" + filmCategory.getValue());
                    movieArrayList.stream()
                            .filter(m -> m.getCategory().getValue().equals(filmCategory.getValue()))
                            .forEach(System.out::println);
                });


    }

    public void printFilterGenres() {
        //        Liệt kê phim theo thể loại
        System.out.println("\nLiệt kê phim theo thể loại");
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
