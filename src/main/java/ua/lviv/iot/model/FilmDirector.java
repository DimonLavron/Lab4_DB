package ua.lviv.iot.model;

public class FilmDirector {
    Integer filmId, directorId;

    public FilmDirector(Integer filmId, Integer directorId) {
        this.filmId = filmId;
        this.directorId = directorId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Integer directorId) {
        this.directorId = directorId;
    }
}
