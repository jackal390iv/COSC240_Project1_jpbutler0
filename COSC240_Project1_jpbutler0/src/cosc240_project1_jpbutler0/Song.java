package cosc240_project1_jpbutler0;

/**
 *
 * @author Reaper
 */
public class Song {

    private String title;
    private String writer;
    private String singer;
    private float duration;
    private String genre;
    private int year;

    public Song() {
        title = "";
        writer = "";
        singer = "";
        duration = 0;
        genre = "";
        year = 0;

    }

    public void setSong(String titleOfSong, String writerOfSong,
            String singerOfSong, float durationOfSong, String genreOfSong, int yearCreated) {
        titleOfSong.toLowerCase();
        writerOfSong.toLowerCase();
        singerOfSong.toLowerCase();
        genreOfSong.toLowerCase();

        if ((durationOfSong > 0.0) && (yearCreated > 0)) {
            year = yearCreated;
            duration = durationOfSong;
        }
        title = titleOfSong;
        writer = writerOfSong;
        singer = singerOfSong;
        genre = genreOfSong;

    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getSinger() {
        return singer;
    }

    public float getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "Title: " + title + " Writer: " + writer + " Singer: " + singer
                + " Duration: " + duration + " Genre: " + genre + " Year: " + year;
    }
}
