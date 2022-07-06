public class Movie {
    
    Integer movieRank;
    String title;
    String director;
    Integer score;

    public Movie(Integer movieRank, String title, String director, Integer score) {
        this.movieRank = movieRank;
        this.title = title;
        this.director = director;
        this.score = score;
    } // const

    public Integer getMovieRank() {
        return movieRank;
    }

    public void setMovieRank(Integer movieRank) {
        this.movieRank = movieRank;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Movie [movieRank= " + movieRank + ", title= " + title + ", director= " + director+ ", score= " + score + "%]";
    }



} // class
