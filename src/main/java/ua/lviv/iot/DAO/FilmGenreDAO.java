package ua.lviv.iot.DAO;

import ua.lviv.iot.controller.connection.ConnectionManager;
import ua.lviv.iot.model.FilmDirector;
import ua.lviv.iot.model.FilmGenre;

import java.sql.*;

public class FilmGenreDAO implements GeneralJunctionDAO<FilmGenre> {
    private static final String FIND_ALL = "SELECT * FROM `film_genre`";
    private static final String FIND_BY_ID = "SELECT * FROM `film_genre` WHERE film_id=? AND genre_id=?";
    private static final String CREATE = "INSERT INTO `film_genre` (film_id, genre_id)" +
            " VALUES (?, ?)";
    private static final String UPDATE = "UPDATE `film_genre` SET film_id=?, genre_id=? WHERE film_id=? AND genre_id=?";
    private static final String DELETE = "DELETE FROM `film_genre` WHERE film_id=? AND genre_id=?";

    @Override
    public void findAll() {
        Connection connection = ConnectionManager.getConnection();
        try (Statement statement = connection.createStatement()){
            try (ResultSet resultSet = statement.executeQuery(FIND_ALL)){
                print(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void findById(Integer id1, Integer id2) {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID)){
            preparedStatement.setInt(1, id1);
            preparedStatement.setInt(2, id2);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                print(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void create(FilmGenre newItem) {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(CREATE)) {
            preparedStatement.setInt(1, newItem.getFilmId());
            preparedStatement.setInt(2, newItem.getGenreId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Integer id1, Integer id2, FilmGenre newItem) {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
            preparedStatement.setInt(1, newItem.getFilmId());
            preparedStatement.setInt(2, newItem.getGenreId());
            preparedStatement.setInt(3, id1);
            preparedStatement.setInt(4, id2);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id1, Integer id2) {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE)){
            preparedStatement.setInt(1, id1);
            preparedStatement.setInt(2, id2);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void print(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            System.out.println("Film " + resultSet.getInt("film_id") +
                    " has genre " + resultSet.getString("genre_id"));
        }
    }
}
