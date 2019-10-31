package ua.lviv.iot.controller;

import ua.lviv.iot.model.*;
import ua.lviv.iot.service.BusinessLogic;
import ua.lviv.iot.service.BusinessLogicImpl;

import java.sql.Date;

public class ControllerImpl implements Controller {
    private static BusinessLogic businessLogic;

    public ControllerImpl() {
        businessLogic = new BusinessLogicImpl();
    }

    @Override
    public void findAllCountries() {
        businessLogic.findAllCountries();
    }

    @Override
    public void findCountryById(Integer id) {
        businessLogic.findCountryById(id);
    }

    @Override
    public void createCountry(String name) {
        businessLogic.createCountry(new Country(name));
    }

    @Override
    public void updateCountry(Integer id, String name) {
        businessLogic.updateCountry(id, new Country(name));
    }

    @Override
    public void deleteCountry(Integer id) {
        businessLogic.deleteCountry(id);
    }

    @Override
    public void findAllDirectors() {
        businessLogic.findAllDirectors();
    }

    @Override
    public void findDirectorById(Integer id) {
        businessLogic.findDirectorById(id);
    }

    @Override
    public void createDirector(String firstName, String lastName) {
        businessLogic.createDirector(new Director(firstName, lastName));
    }

    @Override
    public void updateDirector(Integer id, String firstName, String lastName) {
        businessLogic.updateDirector(id, new Director(firstName, lastName));
    }

    @Override
    public void deleteDirector(Integer id) {
        businessLogic.deleteDirector(id);
    }

    @Override
    public void findAllFilms() {
        businessLogic.findAllFilms();
    }

    @Override
    public void findFilmById(Integer id) {
        businessLogic.findFilmById(id);
    }

    @Override
    public void createFilm(String title, Integer runningTime, Date releaseDate) {
        businessLogic.createFilm(new Film(title, runningTime, releaseDate));
    }

    @Override
    public void updateFilm(Integer id, String title, Integer runningTime, Date releaseDate) {
        businessLogic.updateFilm(id, new Film(title, runningTime, releaseDate));
    }

    @Override
    public void deleteFilm(Integer id) {
        businessLogic.deleteFilm(id);
    }

    @Override
    public void findAllGenres() {
        businessLogic.findAllGenres();
    }

    @Override
    public void findGenreById(Integer id) {
        businessLogic.findGenreById(id);
    }

    @Override
    public void createGenre(String name) {
        businessLogic.createGenre(new Genre(name));
    }

    @Override
    public void updateGenre(Integer id, String name) {
        businessLogic.updateGenre(id, new Genre(name));
    }

    @Override
    public void deleteGenre(Integer id) {
        businessLogic.deleteGenre(id);
    }

    @Override
    public void findAllStars() {
        businessLogic.findAllStars();
    }

    @Override
    public void findStarById(Integer id) {
        businessLogic.findStarById(id);
    }

    @Override
    public void createStar(String firstName, String lastName, Integer age) {
        businessLogic.createStar(new Star(firstName, lastName, age));
    }

    @Override
    public void updateStar(Integer id, String firstName, String lastName, Integer age) {
        businessLogic.updateStar(id, new Star(firstName, lastName, age));
    }

    @Override
    public void deleteStar(Integer id) {
        businessLogic.deleteStar(id);
    }

    @Override
    public void findAllRoles() {
        businessLogic.findAllRoles();
    }

    @Override
    public void findRoleById(Integer id1, Integer id2) {
        businessLogic.findRoleById(id1, id2);
    }

    @Override
    public void createRole(Integer filmId, Integer starId, String role) {
        businessLogic.createRole(new Role(filmId, starId, role));
    }

    @Override
    public void updateRole(Integer id1, Integer id2, Integer filmId, Integer starId, String role) {
        businessLogic.updateRole(id1, id2, new Role(filmId, starId, role));
    }

    @Override
    public void deleteRole(Integer id1, Integer id2) {
        businessLogic.deleteRole(id1, id2);
    }

    @Override
    public void findAllBoxOffices() {
        businessLogic.findAllBoxOffices();
    }

    @Override
    public void findBoxOfficeById(Integer id1, Integer id2) {
        businessLogic.findBoxOfficeById(id1, id2);
    }

    @Override
    public void createBoxOffice(Integer filmId, Integer countryId, long boxOffice) {
        businessLogic.createBoxOffice(new BoxOffice(filmId, countryId, boxOffice));
    }

    @Override
    public void updateBoxOffice(Integer id1, Integer id2, Integer filmId, Integer countryId, long boxOffice) {
        businessLogic.updateBoxOffice(id1, id2, new BoxOffice(filmId, countryId, boxOffice));
    }

    @Override
    public void deleteBoxOffice(Integer id1, Integer id2) {
        businessLogic.deleteBoxOffice(id1, id2);
    }

    @Override
    public void findAllFilmDirectors() {
        businessLogic.findAllFilmDirectors();
    }

    @Override
    public void findFilmDirectorById(Integer id1, Integer id2) {
        businessLogic.findFilmDirectorById(id1, id2);
    }

    @Override
    public void createFilmDirector(Integer filmId, Integer directorId) {
        businessLogic.createFilmDirector(new FilmDirector(filmId, directorId));
    }

    @Override
    public void updateFilmDirector(Integer id1, Integer id2, Integer filmId, Integer directorId) {
        businessLogic.updateFilmDirector(id1, id2, new FilmDirector(filmId, directorId));
    }

    @Override
    public void deleteFilmDirector(Integer id1, Integer id2) {
        businessLogic.deleteFilmDirector(id1, id2);
    }

    @Override
    public void findAllFilmGenres() {
        businessLogic.findAllFilmGenres();
    }

    @Override
    public void findFilmGenreById(Integer id1, Integer id2) {
        businessLogic.findFilmGenreById(id1, id2);
    }

    @Override
    public void createFilmGenre(Integer filmId, Integer genreId) {
        businessLogic.createFilmGenre(new FilmGenre(filmId, genreId));
    }

    @Override
    public void updateFilmGenre(Integer id1, Integer id2, Integer filmId, Integer genreId) {
        businessLogic.updateFilmGenre(id1, id2, new FilmGenre(filmId, genreId));
    }

    @Override
    public void deleteFilmGenre(Integer id1, Integer id2) {
        businessLogic.deleteFilmGenre(id1, id2);
    }
}
