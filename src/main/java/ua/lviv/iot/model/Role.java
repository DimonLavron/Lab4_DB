package ua.lviv.iot.model;

public class Role {
    Integer filmId, starId;
    String role;

    public Role(Integer filmId, Integer starId, String role) {
        this.filmId = filmId;
        this.starId = starId;
        this.role = role;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getStarId() {
        return starId;
    }

    public void setStarId(Integer starId) {
        this.starId = starId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
