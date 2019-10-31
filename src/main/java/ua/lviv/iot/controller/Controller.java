package ua.lviv.iot.controller;

import ua.lviv.iot.model.*;

import java.sql.Date;

public interface Controller {
    void findAllCountries();
    void findCountryById(Integer id);
    void createCountry(String name);
    void updateCountry(Integer id, String name);
    void deleteCountry(Integer id);

    void findAllDirectors();
    void findDirectorById(Integer id);
    void createDirector(String firstName, String lastName);
    void updateDirector(Integer id, String firstName, String lastName);
    void deleteDirector(Integer id);

    void findAllFilms();
    void findFilmById(Integer id);
    void createFilm(String title, Integer runningTime, Date releaseDate);
    void updateFilm(Integer id, String title, Integer runningTime, Date releaseDate);
    void deleteFilm(Integer id);

    void findAllGenres();
    void findGenreById(Integer id);
    void createGenre(String name);
    void updateGenre(Integer id, String name);
    void deleteGenre(Integer id);

    void findAllStars();
    void findStarById(Integer id);
    void createStar(String firstName, String lastName, Integer age);
    void updateStar(Integer id, String firstName, String lastName, Integer age);
    void deleteStar(Integer id);

    void findAllRoles();
    void findRoleById(Integer id1, Integer id2);
    void createRole(Integer filmId, Integer starId, String role);
    void updateRole(Integer id1, Integer id2, Integer filmId, Integer starId, String role);
    void deleteRole(Integer id1, Integer id2);

    void findAllBoxOffices();
    void findBoxOfficeById(Integer id1, Integer id2);
    void createBoxOffice(Integer filmId, Integer countryId, long boxOffice);
    void updateBoxOffice(Integer id1, Integer id2, Integer filmId, Integer countryId, long boxOffice);
    void deleteBoxOffice(Integer id1, Integer id2);

    void findAllFilmDirectors();
    void findFilmDirectorById(Integer id1, Integer id2);
    void createFilmDirector(Integer filmId, Integer directorId);
    void updateFilmDirector(Integer id1, Integer id2, Integer filmId, Integer directorId);
    void deleteFilmDirector(Integer id1, Integer id2);

    void findAllFilmGenres();
    void findFilmGenreById(Integer id1, Integer id2);
    void createFilmGenre(Integer filmId, Integer genreId);
    void updateFilmGenre(Integer id1, Integer id2, Integer filmId, Integer genreId);
    void deleteFilmGenre(Integer id1, Integer id2);
}
