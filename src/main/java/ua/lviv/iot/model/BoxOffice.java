package ua.lviv.iot.model;

public class BoxOffice {
    Integer filmId, countryId;
    long boxOffice;

    public BoxOffice(Integer filmId, Integer countryId, long boxOffice) {
        this.filmId = filmId;
        this.countryId = countryId;
        this.boxOffice = boxOffice;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public long getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(long boxOffice) {
        this.boxOffice = boxOffice;
    }
}
