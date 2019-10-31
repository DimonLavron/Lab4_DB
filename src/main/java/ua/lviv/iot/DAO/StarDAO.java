package ua.lviv.iot.DAO;

import ua.lviv.iot.controller.connection.ConnectionManager;
import ua.lviv.iot.model.Star;

import java.sql.*;
import java.util.Map;

public class StarDAO implements GeneralDAO<Star> {
    private static final String FIND_ALL = "SELECT * FROM star";
    private static final String FIND_BY_ID = "SELECT * FROM star WHERE id=?";
    private static final String CREATE = "INSERT INTO star (first_name, last_name, age)" +
            " VALUES (?, ?, ?)";
    private static final String UPDATE = "UPDATE star SET first_name=?, last_name=?, age=? WHERE id=?";
    private static final String DELETE = "DELETE FROM star WHERE id=?";

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
    public void create(Star newItem) {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(CREATE)) {
            preparedStatement.setString(1, newItem.getFirstName());
            preparedStatement.setString(2, newItem.getLastName());
            preparedStatement.setInt(3, newItem.getAge());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Integer id, Star newItem) {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
            preparedStatement.setString(1, newItem.getFirstName());
            preparedStatement.setString(2, newItem.getLastName());
            preparedStatement.setInt(3, newItem.getAge());
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
            System.out.println("Star " + resultSet.getInt("id") +
                    ":\nFirst name: " + resultSet.getString("first_name") +
                    "\nLast name: " + resultSet.getString("last_name") +
                    "\nAge: " + resultSet.getInt("age"));
        }
    }
}
