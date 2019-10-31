package ua.lviv.iot.service;

import ua.lviv.iot.model.*;

public interface BusinessLogic {
    void findAllCountries();
    void findCountryById(Integer id);
    void createCountry(Country newItem);
    void updateCountry(Integer id, Country newItem);
    void deleteCountry(Integer id);

    void findAllDirectors();
    void findDirectorById(Integer id);
    void createDirector(Director newItem);
    void updateDirector(Integer id, Director newItem);
    void deleteDirector(Integer id);

    void findAllFilms();
    void findFilmById(Integer id);
    void createFilm(Film newItem);
    void updateFilm(Integer id, Film newItem);
    void deleteFilm(Integer id);

    void findAllGenres();
    void findGenreById(Integer id);
    void createGenre(Genre newItem);
    void updateGenre(Integer id, Genre newItem);
    void deleteGenre(Integer id);

    void findAllStars();
    void findStarById(Integer id);
    void createStar(Star newItem);
    void updateStar(Integer id, Star newItem);
    void deleteStar(Integer id);

    void findAllRoles();
    void findRoleById(Integer id1, Integer id2);
    void createRole(Role newItem);
    void updateRole(Integer id1, Integer id2, Role newItem);
    void deleteRole(Integer id1, Integer id2);

    void findAllBoxOffices();
    void findBoxOfficeById(Integer id1, Integer id2);
    void createBoxOffice(BoxOffice newItem);
    void updateBoxOffice(Integer id1, Integer id2, BoxOffice newItem);
    void deleteBoxOffice(Integer id1, Integer id2);

    void findAllFilmDirectors();
    void findFilmDirectorById(Integer id1, Integer id2);
    void createFilmDirector(FilmDirector newItem);
    void updateFilmDirector(Integer id1, Integer id2, FilmDirector newItem);
    void deleteFilmDirector(Integer id1, Integer id2);

    void findAllFilmGenres();
    void findFilmGenreById(Integer id1, Integer id2);
    void createFilmGenre(FilmGenre newItem);
    void updateFilmGenre(Integer id1, Integer id2, FilmGenre newItem);
    void deleteFilmGenre(Integer id1, Integer id2);
}
