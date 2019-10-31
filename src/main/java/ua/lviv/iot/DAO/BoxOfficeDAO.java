package ua.lviv.iot.DAO;

import ua.lviv.iot.controller.connection.ConnectionManager;
import ua.lviv.iot.model.BoxOffice;
import ua.lviv.iot.model.Role;

import java.sql.*;

public class BoxOfficeDAO implements GeneralJunctionDAO<BoxOffice> {
    private static final String FIND_ALL = "SELECT * FROM `box_office`";
    private static final String FIND_BY_ID = "SELECT * FROM `box_office` WHERE film_id=? AND country_id=?";
    private static final String CREATE = "INSERT INTO `box_office` (film_id, country_id, box_office)" +
            " VALUES (?, ?, ?)";
    private static final String UPDATE = "UPDATE `box_office` SET film_id=?, country_id=?, box_office=? WHERE film_id=? AND country_id=?";
    private static final String DELETE = "DELETE FROM `box_office` WHERE film_id=? AND country_id=?";

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
    public void create(BoxOffice newItem) {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(CREATE)) {
            preparedStatement.setInt(1, newItem.getFilmId());
            preparedStatement.setInt(2, newItem.getCountryId());
            preparedStatement.setLong(3, newItem.getBoxOffice());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Integer id1, Integer id2, BoxOffice newItem) {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
            preparedStatement.setInt(1, newItem.getFilmId());
            preparedStatement.setInt(2, newItem.getCountryId());
            preparedStatement.setLong(3, newItem.getBoxOffice());
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
                    " earned " + resultSet.getLong("box_office") +
                    "$ in country " + resultSet.getString("country_id"));
        }
    }
}
