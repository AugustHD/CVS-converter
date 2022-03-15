package demo;

public class Movie {
    private String year;
    private String length;
    private String title;
    private String subject;
    private String popularity;
    private String awards;

    public Movie(String year, String length, String title, String subject, String populairity, String awards){
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = populairity;
        this.awards = awards;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String isAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }
}
