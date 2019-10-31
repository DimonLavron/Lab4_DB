package ua.lviv.iot.service;

import ua.lviv.iot.DAO.*;
import ua.lviv.iot.model.*;

public class BusinessLogicImpl implements BusinessLogic {
    private static GeneralJunctionDAO<BoxOffice> boxOffice;
    private static GeneralDAO<Country> country;
    private static GeneralDAO<Director> director;
    private static GeneralDAO<Film> film;
    private static GeneralJunctionDAO<FilmDirector> filmDirector;
    private static GeneralJunctionDAO<FilmGenre> filmGenre;
    private static GeneralDAO<Genre> genre;
    private static GeneralJunctionDAO<Role> role;
    private static GeneralDAO<Star> star;

    public BusinessLogicImpl() {
        boxOffice = new BoxOfficeDAO();
        country = new CountryDAO();
        director = new DirectorDAO();
        film = new FilmDAO();
        filmDirector = new FilmDirectorDAO();
        filmGenre = new FilmGenreDAO();
        genre = new GenreDAO();
        role = new RoleDAO();
        star = new StarDAO();
    }

    @Override
    public void findAllCountries() {
        country.findAll();
    }

    @Override
    public void findCountryById(Integer id) {
        country.findById(id);
    }

    @Override
    public void createCountry(Country newItem) {
        country.create(newItem);
    }

    @Override
    public void updateCountry(Integer id, Country newItem) {
        country.update(id, newItem);
    }

    @Override
    public void deleteCountry(Integer id) {
        country.delete(id);
    }

    @Override
    public void findAllDirectors() {
        director.findAll();
    }

    @Override
    public void findDirectorById(Integer id) {
        director.findById(id);
    }

    @Override
    public void createDirector(Director newItem) {
        director.create(newItem);
    }

    @Override
    public void updateDirector(Integer id, Director newItem) {
        director.update(id, newItem);
    }

    @Override
    public void deleteDirector(Integer id) {
        director.delete(id);
    }

    @Override
    public void findAllFilms() {
        film.findAll();
    }

    @Override
    public void findFilmById(Integer id) {
        film.findById(id);
    }

    @Override
    public void createFilm(Film newItem) {
        film.create(newItem);
    }

    @Override
    public void updateFilm(Integer id, Film newItem) {
        film.update(id, newItem);
    }

    @Override
    public void deleteFilm(Integer id) {
        film.delete(id);
    }

    @Override
    public void findAllGenres() {
        genre.findAll();
    }

    @Override
    public void findGenreById(Integer id) {
        genre.findById(id);
    }

    @Override
    public void createGenre(Genre newItem) {
        genre.create(newItem);
    }

    @Override
    public void updateGenre(Integer id, Genre newItem) {
        genre.update(id, newItem);
    }

    @Override
    public void deleteGenre(Integer id) {
        genre.delete(id);
    }

    @Override
    public void findAllStars() {
        star.findAll();
    }

    @Override
    public void findStarById(Integer id) {
        star.findById(id);
    }

    @Override
    public void createStar(Star newItem) {
        star.create(newItem);
    }

    @Override
    public void updateStar(Integer id, Star newItem) {
        star.update(id, newItem);
    }

    @Override
    public void deleteStar(Integer id) {
        star.delete(id);
    }

    @Override
    public void findAllRoles() {
        role.findAll();
    }

    @Override
    public void findRoleById(Integer id1, Integer id2) {
        role.findById(id1, id2);
    }

    @Override
    public void createRole(Role newItem) {
        role.create(newItem);
    }

    @Override
    public void updateRole(Integer id1, Integer id2, Role newItem) {
        role.update(id1, id2, newItem);
    }

    @Override
    public void deleteRole(Integer id1, Integer id2) {
        role.delete(id1, id2);
    }

    @Override
    public void findAllBoxOffices() {
        boxOffice.findAll();
    }

    @Override
    public void findBoxOfficeById(Integer id1, Integer id2) {
        boxOffice.findById(id1, id2);
    }

    @Override
    public void createBoxOffice(BoxOffice newItem) {
        boxOffice.create(newItem);
    }

    @Override
    public void updateBoxOffice(Integer id1, Integer id2, BoxOffice newItem) {
        boxOffice.update(id1, id2, newItem);
    }

    @Override
    public void deleteBoxOffice(Integer id1, Integer id2) {
        boxOffice.delete(id1, id2);
    }

    @Override
    public void findAllFilmDirectors() {
        filmDirector.findAll();
    }

    @Override
    public void findFilmDirectorById(Integer id1, Integer id2) {
        filmDirector.findById(id1, id2);
    }

    @Override
    public void createFilmDirector(FilmDirector newItem) {
        filmDirector.create(newItem);
    }

    @Override
    public void updateFilmDirector(Integer id1, Integer id2, FilmDirector newItem) {
        filmDirector.update(id1, id2, newItem);
    }

    @Override
    public void deleteFilmDirector(Integer id1, Integer id2) {
        filmDirector.delete(id1, id2);
    }

    @Override
    public void findAllFilmGenres() {
        filmGenre.findAll();
    }

    @Override
    public void findFilmGenreById(Integer id1, Integer id2) {
        filmGenre.findById(id1, id2);
    }

    @Override
    public void createFilmGenre(FilmGenre newItem) {
        filmGenre.create(newItem);
    }

    @Override
    public void updateFilmGenre(Integer id1, Integer id2, FilmGenre newItem) {
        filmGenre.update(id1, id2, newItem);
    }

    @Override
    public void deleteFilmGenre(Integer id1, Integer id2) {
        filmGenre.delete(id1, id2);
    }
}
