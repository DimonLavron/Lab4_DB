package ua.lviv.iot.DAO;

import ua.lviv.iot.controller.connection.ConnectionManager;
import ua.lviv.iot.model.Film;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Map;

public class FilmDAO implements GeneralDAO<Film> {
    private static final String FIND_ALL = "SELECT * FROM `film`";
    private static final String FIND_BY_ID = "SELECT * FROM `film` WHERE id=?";
    private static final String CREATE = "INSERT INTO `film` (title, running_time, release_date)" +
            " VALUES (?, ?, ?)";
    private static final String UPDATE = "UPDATE `film` SET title=?, running_time=?, release_date=? WHERE id=?";
    private static final String DELETE = "DELETE FROM `film` WHERE id=?";

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
    public void findById(Integer id) {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID)){
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                print(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void create(Film newItem) {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(CREATE)) {
            preparedStatement.setString(1, newItem.getTitle());
            preparedStatement.setInt(2, newItem.getRunningTime());
            preparedStatement.setDate(3, newItem.getReleaseDate());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Integer id, Film newItem) {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
            preparedStatement.setString(1, newItem.getTitle());
            preparedStatement.setInt(2, newItem.getRunningTime());
            preparedStatement.setDate(3, newItem.getReleaseDate());
            preparedStatement.setInt(4, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE)){
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void print(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            System.out.println("Film " + resultSet.getInt("id") +
                    ":\nTitle: " + resultSet.getString("title") +
                    "\nRunning time: " + resultSet.getString("running_time") + " mins\nRelease date: " +
                    new SimpleDateFormat("dd.MM.yyyy").format(resultSet.getDate("release_date")));
        }
    }
}
