import java.util.stream.Stream;

public enum FilmCategory {
    TV("TV"),
    MV("Movie");

    private String value;

    FilmCategory(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Stream<FilmCategory> stream() {
        return Stream.of(FilmCategory.values());
    }
}
