package ua.lviv.iot.DAO;

import ua.lviv.iot.controller.connection.ConnectionManager;
import ua.lviv.iot.model.Genre;

import java.sql.*;
import java.util.Map;

public class GenreDAO implements GeneralDAO<Genre> {
    private static final String FIND_ALL = "SELECT * FROM genre";
    private static final String FIND_BY_ID = "SELECT * FROM genre WHERE id=?";
    private static final String CREATE = "INSERT INTO genre (`name`)" +
            " VALUES (?)";
    private static final String UPDATE = "UPDATE genre SET `name`=? WHERE id=?";
    private static final String DELETE = "DELETE FROM genre WHERE id=?";

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
    public void create(Genre newItem) {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(CREATE)) {
            preparedStatement.setString(1, newItem.getName());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Integer id, Genre newItem) {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
            preparedStatement.setString(1, newItem.getName());
            preparedStatement.setInt(2, id);

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
            System.out.println("Genre " + resultSet.getInt("id") + ": " + resultSet.getString("name"));
        }
    }
}
