public class Movie {
    private int id;
    private String title;
    private String director;
    private String genre;
    private FilmCategory category;
    private int views;
    private int runtime;

    public Movie(int id, String title, String director, String genre, FilmCategory category, int views, int runtime) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.category = category;
        this.views = views;
        this.runtime = runtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public FilmCategory getCategory() {
        return category;
    }

    public void setCategory(FilmCategory category) {
        this.category = category;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return id + " - " + title + " - " + director + " - " + genre + " - " + category + " - views: " + views + " - " + runtime;
    }
}
