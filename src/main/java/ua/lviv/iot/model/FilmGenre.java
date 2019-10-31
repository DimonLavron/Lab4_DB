package ua.lviv.iot.model;

public class FilmGenre {
    Integer filmId, genreId;

    public FilmGenre(Integer filmId, Integer genreId) {
        this.filmId = filmId;
        this.genreId = genreId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }
}
