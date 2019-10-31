package ua.lviv.iot.DAO;

import ua.lviv.iot.controller.connection.ConnectionManager;
import ua.lviv.iot.model.Role;

import java.sql.*;

public class RoleDAO implements GeneralJunctionDAO<Role> {
    private static final String FIND_ALL = "SELECT * FROM `role`";
    private static final String FIND_BY_ID = "SELECT * FROM `role` WHERE film_id=? AND star_id=?";
    private static final String CREATE = "INSERT INTO `role` (film_id, star_id, `role`)" +
            " VALUES (?, ?, ?)";
    private static final String UPDATE = "UPDATE `role` SET film_id=?, star_id=?, `role`=? WHERE film_id=? AND star_id=?";
    private static final String DELETE = "DELETE FROM `role` WHERE film_id=? AND star_id=?";

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
    public void create(Role newItem) {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(CREATE)) {
            preparedStatement.setInt(1, newItem.getFilmId());
            preparedStatement.setInt(2, newItem.getStarId());
            preparedStatement.setString(3, newItem.getRole());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Integer id1, Integer id2, Role newItem) {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
            preparedStatement.setInt(1, newItem.getFilmId());
            preparedStatement.setInt(2, newItem.getStarId());
            preparedStatement.setString(3, newItem.getRole());
            preparedStatement.setInt(4, id1);
            preparedStatement.setInt(5, id2);

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
                    " has star " + resultSet.getInt("star_id") +
                    " with role " + resultSet.getString("role"));
        }
    }
}
