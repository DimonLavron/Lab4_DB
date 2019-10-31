package ua.lviv.iot.view;

import ua.lviv.iot.controller.Controller;
import ua.lviv.iot.controller.ControllerImpl;

import java.sql.Date;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MyView {
    private static Controller controller;
    private static String options = "\t1 - Find all\n\t2 - Find by id\n\t3 - Create\n\t4 - Update\n\t5 - Delete\n\tQ - Go back";

    public MyView() {
        controller = new ControllerImpl();
    }

    public void show() {
        String keyMenu;
        do {
            System.out.println("FilmDB Main Menu.");
            System.out.println("Please, select option:\n\t1 - Country\n\t2 - Director\n\t3 - Film\n\t4 - Genre\n\t5 - Star\n\t6 - Role\n\t7 - Box Office\n\t8 - Film Director\n\t9 - Film Genre\n\tQ - Exit");
            keyMenu = new Scanner(System.in).nextLine().toUpperCase();
            switch (keyMenu) {
                case "1":
                    countryMenu();
                    break;
                case "2":
                    directorMenu();
                    break;
                case "3":
                    filmMenu();
                    break;
                case "4":
                    genreMenu();
                    break;
                case "5":
                    starMenu();
                    break;
                case "6":
                    roleMenu();
                    break;
                case "7":
                    boxOfficeMenu();
                    break;
                case "8":
                    filmDirectorMenu();
                    break;
                case "9":
                    filmGenreMenu();
                    break;
                case "Q":
                    System.out.println("Goodbye, have a nice day!");
                    break;
                default:
                    System.out.println("Incorrect menu option!");
            }
        } while (!keyMenu.equals("Q"));
    }

    private void countryMenu() {
        String keyMenu;
        do {
            System.out.println("Table 'country' menu.");
            System.out.println("Please, select option:");
            System.out.println(options);
            keyMenu = new Scanner(System.in).nextLine().toUpperCase();
            Integer id;
            String name;
            switch (keyMenu) {
                case "1":
                    controller.findAllCountries();
                    break;
                case "2":
                    System.out.println("Enter id:");
                    id = new Scanner(System.in).nextInt();
                    controller.findCountryById(id);
                    break;
                case "3":
                    System.out.println("Enter name:");
                    name = new Scanner(System.in).nextLine();
                    controller.createCountry(name);
                    break;
                case "4":
                    System.out.println("Enter id:");
                    id = new Scanner(System.in).nextInt();
                    System.out.println("Enter name:");
                    name = new Scanner(System.in).nextLine();
                    controller.updateCountry(id, name);
                    break;
                case "5":
                    System.out.println("Enter id:");
                    id = new Scanner(System.in).nextInt();
                    controller.deleteCountry(id);
                    break;
                case "Q":
                    System.out.println("Back in main menu!");
                    break;
                default:
                    System.out.println("Incorrect menu option!");
            }
        } while (!keyMenu.equals("Q"));
    }

    private void directorMenu() {
        String keyMenu;
        do {
            System.out.println("Table 'director' menu.");
            System.out.println("Please, select option:");
            System.out.println(options);
            keyMenu = new Scanner(System.in).nextLine().toUpperCase();
            Integer id;
            String firstName, lastName;
            switch (keyMenu) {
                case "1":
                    controller.findAllDirectors();
                    break;
                case "2":
                    System.out.println("Enter id:");
                    id = new Scanner(System.in).nextInt();
                    controller.findDirectorById(id);
                    break;
                case "3":
                    System.out.println("Enter first name:");
                    firstName = new Scanner(System.in).nextLine();
                    System.out.println("Enter last name:");
                    lastName = new Scanner(System.in).nextLine();
                    controller.createDirector(firstName, lastName);
                    break;
                case "4":
                    System.out.println("Enter id:");
                    id = new Scanner(System.in).nextInt();
                    System.out.println("Enter first name:");
                    firstName = new Scanner(System.in).nextLine();
                    System.out.println("Enter last name:");
                    lastName = new Scanner(System.in).nextLine();
                    controller.updateDirector(id, firstName, lastName);
                    break;
                case "5":
                    System.out.println("Enter id:");
                    id = new Scanner(System.in).nextInt();
                    controller.deleteDirector(id);
                    break;
                case "Q":
                    System.out.println("Back in main menu!");
                    break;
                default:
                    System.out.println("Incorrect menu option!");
            }
        } while (!keyMenu.equals("Q"));
    }

    private void filmMenu() {
        String keyMenu;
        do {
            System.out.println("Table 'film' menu.");
            System.out.println("Please, select option:");
            System.out.println(options);
            keyMenu = new Scanner(System.in).nextLine().toUpperCase();
            Integer id, runningTime;
            String title;
            Date releaseDate;
            switch (keyMenu) {
                case "1":
                    controller.findAllFilms();
                    break;
                case "2":
                    System.out.println("Enter id:");
                    id = new Scanner(System.in).nextInt();
                    controller.findFilmById(id);
                    break;
                case "3":
                    System.out.println("Enter title:");
                    title = new Scanner(System.in).nextLine();
                    System.out.println("Enter running time:");
                    runningTime = new Scanner(System.in).nextInt();
                    System.out.println("Enter release date:");
                    releaseDate = new Date(new SimpleDateFormat("dd.MM.yyyy").parse(new Scanner(System.in).nextLine(), new ParsePosition(0)).getTime());
                    controller.createFilm(title, runningTime, releaseDate);
                    break;
                case "4":
                    System.out.println("Enter id:");
                    id = new Scanner(System.in).nextInt();
                    System.out.println("Enter title:");
                    title = new Scanner(System.in).nextLine();
                    System.out.println("Enter running time:");
                    runningTime = new Scanner(System.in).nextInt();
                    System.out.println("Enter release date:");
                    releaseDate = new Date(new SimpleDateFormat("dd.MM.yyyy").parse(new Scanner(System.in).nextLine(), new ParsePosition(0)).getTime());
                    controller.updateFilm(id ,title, runningTime, releaseDate);
                    break;
                case "5":
                    System.out.println("Enter id:");
                    id = new Scanner(System.in).nextInt();
                    controller.deleteFilm(id);
                    break;
                case "Q":
                    System.out.println("Back in main menu!");
                    break;
                default:
                    System.out.println("Incorrect menu option!");
            }
        } while (!keyMenu.equals("Q"));
    }

    private void genreMenu() {
        String keyMenu;
        do {
            System.out.println("Table 'genre' menu.");
            System.out.println("Please, select option:");
            System.out.println(options);
            keyMenu = new Scanner(System.in).nextLine().toUpperCase();
            Integer id;
            String name;
            switch (keyMenu) {
                case "1":
                    controller.findAllGenres();
                    break;
                case "2":
                    System.out.println("Enter id:");
                    id = new Scanner(System.in).nextInt();
                    controller.findGenreById(id);
                    break;
                case "3":
                    System.out.println("Enter name:");
                    name = new Scanner(System.in).nextLine();
                    controller.createGenre(name);
                    break;
                case "4":
                    System.out.println("Enter id:");
                    id = new Scanner(System.in).nextInt();
                    System.out.println("Enter name:");
                    name = new Scanner(System.in).nextLine();
                    controller.updateGenre(id, name);
                    break;
                case "5":
                    System.out.println("Enter id:");
                    id = new Scanner(System.in).nextInt();
                    controller.deleteGenre(id);
                    break;
                case "Q":
                    System.out.println("Back in main menu!");
                    break;
                default:
                    System.out.println("Incorrect menu option!");
            }
        } while (!keyMenu.equals("Q"));
    }

    private void starMenu() {
        String keyMenu;
        do {
            System.out.println("Table 'star' menu.");
            System.out.println("Please, select option:");
            System.out.println(options);
            keyMenu = new Scanner(System.in).nextLine().toUpperCase();
            Integer id, age;
            String firstName, lastName;
            switch (keyMenu) {
                case "1":
                    controller.findAllStars();
                    break;
                case "2":
                    System.out.println("Enter id:");
                    id = new Scanner(System.in).nextInt();
                    controller.findStarById(id);
                    break;
                case "3":
                    System.out.println("Enter first name:");
                    firstName = new Scanner(System.in).nextLine();
                    System.out.println("Enter last name:");
                    lastName = new Scanner(System.in).nextLine();
                    System.out.println("Enter age:");
                    age = new Scanner(System.in).nextInt();
                    controller.createStar(firstName, lastName, age);
                    break;
                case "4":
                    System.out.println("Enter id:");
                    id = new Scanner(System.in).nextInt();
                    System.out.println("Enter first name:");
                    firstName = new Scanner(System.in).nextLine();
                    System.out.println("Enter last name:");
                    lastName = new Scanner(System.in).nextLine();
                    System.out.println("Enter age:");
                    age = new Scanner(System.in).nextInt();
                    controller.updateStar(id, firstName, lastName, age);
                    break;
                case "5":
                    System.out.println("Enter id:");
                    id = new Scanner(System.in).nextInt();
                    controller.deleteStar(id);
                    break;
                case "Q":
                    System.out.println("Back in main menu!");
                    break;
                default:
                    System.out.println("Incorrect menu option!");
            }
        } while (!keyMenu.equals("Q"));
    }

    private void roleMenu() {
        String keyMenu;
        do {
            System.out.println("Table 'role' menu.");
            System.out.println("Please, select option:");
            System.out.println(options);
            keyMenu = new Scanner(System.in).nextLine().toUpperCase();
            Integer id1, id2, filmId, starId;
            String role;
            switch (keyMenu) {
                case "1":
                    controller.findAllRoles();
                    break;
                case "2":
                    System.out.println("Enter filmId:");
                    id1 = new Scanner(System.in).nextInt();
                    System.out.println("Enter starId:");
                    id2 = new Scanner(System.in).nextInt();
                    controller.findRoleById(id1, id2);
                    break;
                case "3":
                    System.out.println("Enter filmId:");
                    filmId = new Scanner(System.in).nextInt();
                    System.out.println("Enter starId:");
                    starId = new Scanner(System.in).nextInt();
                    System.out.println("Enter role:");
                    role = new Scanner(System.in).nextLine();
                    controller.createRole(filmId, starId, role);
                    break;
                case "4":
                    System.out.println("Enter filmId:");
                    id1 = new Scanner(System.in).nextInt();
                    System.out.println("Enter starId:");
                    id2 = new Scanner(System.in).nextInt();
                    System.out.println("Enter new filmId:");
                    filmId = new Scanner(System.in).nextInt();
                    System.out.println("Enter new starId:");
                    starId = new Scanner(System.in).nextInt();
                    System.out.println("Enter role:");
                    role = new Scanner(System.in).nextLine();
                    controller.updateRole(id1, id2, filmId, starId, role);
                    break;
                case "5":
                    System.out.println("Enter filmId:");
                    id1 = new Scanner(System.in).nextInt();
                    System.out.println("Enter starId:");
                    id2 = new Scanner(System.in).nextInt();
                    controller.deleteRole(id1, id2);
                    break;
                case "Q":
                    System.out.println("Back in main menu!");
                    break;
                default:
                    System.out.println("Incorrect menu option!");
            }
        } while (!keyMenu.equals("Q"));
    }

    private void boxOfficeMenu() {
        String keyMenu;
        do {
            System.out.println("Table 'box office' menu.");
            System.out.println("Please, select option:");
            System.out.println(options);
            keyMenu = new Scanner(System.in).nextLine().toUpperCase();
            Integer id1, id2, filmId, countryId;
            long boxOffice;
            switch (keyMenu) {
                case "1":
                    controller.findAllBoxOffices();
                    break;
                case "2":
                    System.out.println("Enter filmId:");
                    id1 = new Scanner(System.in).nextInt();
                    System.out.println("Enter countryId:");
                    id2 = new Scanner(System.in).nextInt();
                    controller.findBoxOfficeById(id1, id2);
                    break;
                case "3":
                    System.out.println("Enter filmId:");
                    filmId = new Scanner(System.in).nextInt();
                    System.out.println("Enter countryId:");
                    countryId = new Scanner(System.in).nextInt();
                    System.out.println("Enter box office:");
                    boxOffice = new Scanner(System.in).nextLong();
                    controller.createBoxOffice(filmId, countryId, boxOffice);
                    break;
                case "4":
                    System.out.println("Enter filmId:");
                    id1 = new Scanner(System.in).nextInt();
                    System.out.println("Enter countryId:");
                    id2 = new Scanner(System.in).nextInt();
                    System.out.println("Enter new filmId:");
                    filmId = new Scanner(System.in).nextInt();
                    System.out.println("Enter new countryId:");
                    countryId = new Scanner(System.in).nextInt();
                    System.out.println("Enter box office:");
                    boxOffice = new Scanner(System.in).nextLong();
                    controller.updateBoxOffice(id1, id2, filmId, countryId, boxOffice);
                    break;
                case "5":
                    System.out.println("Enter filmId:");
                    id1 = new Scanner(System.in).nextInt();
                    System.out.println("Enter countryId:");
                    id2 = new Scanner(System.in).nextInt();
                    controller.deleteBoxOffice(id1, id2);
                    break;
                case "Q":
                    System.out.println("Back in main menu!");
                    break;
                default:
                    System.out.println("Incorrect menu option!");
            }
        } while (!keyMenu.equals("Q"));
    }

    private void filmDirectorMenu() {
        String keyMenu;
        do {
            System.out.println("Table 'film director' menu.");
            System.out.println("Please, select option:");
            System.out.println(options);
            keyMenu = new Scanner(System.in).nextLine().toUpperCase();
            Integer id1, id2, filmId, directorId;
            switch (keyMenu) {
                case "1":
                    controller.findAllFilmDirectors();
                    break;
                case "2":
                    System.out.println("Enter filmId:");
                    id1 = new Scanner(System.in).nextInt();
                    System.out.println("Enter directorId:");
                    id2 = new Scanner(System.in).nextInt();
                    controller.findFilmDirectorById(id1, id2);
                    break;
                case "3":
                    System.out.println("Enter filmId:");
                    filmId = new Scanner(System.in).nextInt();
                    System.out.println("Enter directorId:");
                    directorId = new Scanner(System.in).nextInt();
                    controller.createFilmDirector(filmId, directorId);
                    break;
                case "4":
                    System.out.println("Enter filmId:");
                    id1 = new Scanner(System.in).nextInt();
                    System.out.println("Enter directorId:");
                    id2 = new Scanner(System.in).nextInt();
                    System.out.println("Enter new filmId:");
                    filmId = new Scanner(System.in).nextInt();
                    System.out.println("Enter new directorId:");
                    directorId = new Scanner(System.in).nextInt();
                    controller.updateFilmDirector(id1, id2, filmId, directorId);
                    break;
                case "5":
                    System.out.println("Enter filmId:");
                    id1 = new Scanner(System.in).nextInt();
                    System.out.println("Enter directorId:");
                    id2 = new Scanner(System.in).nextInt();
                    controller.deleteFilmDirector(id1, id2);
                    break;
                case "Q":
                    System.out.println("Back in main menu!");
                    break;
                default:
                    System.out.println("Incorrect menu option!");
            }
        } while (!keyMenu.equals("Q"));
    }

    private void filmGenreMenu() {
        String keyMenu;
        do {
            System.out.println("Table 'film genre' menu.");
            System.out.println("Please, select option:");
            System.out.println(options);
            keyMenu = new Scanner(System.in).nextLine().toUpperCase();
            Integer id1, id2, filmId, genreId;
            switch (keyMenu) {
                case "1":
                    controller.findAllFilmGenres();
                    break;
                case "2":
                    System.out.println("Enter filmId:");
                    id1 = new Scanner(System.in).nextInt();
                    System.out.println("Enter genreId:");
                    id2 = new Scanner(System.in).nextInt();
                    controller.findFilmGenreById(id1, id2);
                    break;
                case "3":
                    System.out.println("Enter filmId:");
                    filmId = new Scanner(System.in).nextInt();
                    System.out.println("Enter genreId:");
                    genreId = new Scanner(System.in).nextInt();
                    controller.createFilmGenre(filmId, genreId);
                    break;
                case "4":
                    System.out.println("Enter filmId:");
                    id1 = new Scanner(System.in).nextInt();
                    System.out.println("Enter genreId:");
                    id2 = new Scanner(System.in).nextInt();
                    System.out.println("Enter new filmId:");
                    filmId = new Scanner(System.in).nextInt();
                    System.out.println("Enter new genreId:");
                    genreId = new Scanner(System.in).nextInt();
                    controller.updateFilmGenre(id1, id2, filmId, genreId);
                    break;
                case "5":
                    System.out.println("Enter filmId:");
                    id1 = new Scanner(System.in).nextInt();
                    System.out.println("Enter genreId:");
                    id2 = new Scanner(System.in).nextInt();
                    controller.deleteFilmGenre(id1, id2);
                    break;
                case "Q":
                    System.out.println("Back in main menu!");
                    break;
                default:
                    System.out.println("Incorrect menu option!");
            }
        } while (!keyMenu.equals("Q"));
    }
}