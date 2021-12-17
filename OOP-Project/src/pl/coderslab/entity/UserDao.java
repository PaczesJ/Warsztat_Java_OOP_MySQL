package pl.coderslab.entity;


import pl.coderslab.project2.BCrypt;
import pl.coderslab.project2.DBUtils;

import java.sql.*;

public class UserDao {
    private static final String CREATE_USER_QUERY = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
    private static final String UPDATE_DATA_QUERY = "UPDATE users SET  userName = ?, email = ?, password = ? WHERE id = ?";
    private static final String SELECT_USER_QUERY = "SELECT id, userName, email, password FROM workshop2.users WHERE id = ?";
    private static final String DELETE_USER_QUERY = "DELETE FROM users WHERE id = ?";
    private static final String SELECT_ALL_QUERY = "SELECT id, userName, email, password FROM users";

    public String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
    public User create(User user) {
        try (Connection conn = DBUtils.connect("workshop2")) {
            PreparedStatement statement = conn.prepareStatement(CREATE_USER_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getEmail());
            statement.setString(3, hashPassword(user.getPassword()));
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            while(resultSet.next()) {
                user.setId(resultSet.getInt(1));
            }return user;
        }catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
