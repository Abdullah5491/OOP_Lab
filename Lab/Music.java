import java.util.Objects;

public class Music {
    String title;
    String duration;
    String genre;

    Date releasedate;
    Singer singer;

    public Music(String title, String duration, String genre, Date releasedate, Singer singer) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.releasedate = releasedate;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }


    public String toString() {
        return String.format("Song title: %s\nDuration: %s\n Genre: %s\n Release Date: %s\nSinger: %s\n", title, duration, genre, releasedate, singer);
    }

    public boolean equals(Object o) {
        Music M = (Music) o;
        return M.title == this.title ? true : false;

    }
}